package com.gosopt.seminardomain.global.common.jwt;

import com.gosopt.seminardomain.global.common.exception.common.UnAuthorizedException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;

@Component
public class JwtProvider {

    @Value("${jwt.secret}")
    private String jwtSecret;

    private static final Long ACCESS_TOKEN_EXPIRE_TIME = 60 * 60 * 2 * 1000L;
    private static final Long REFRESH_TOKEN_EXPIRE_TIME = 60 * 60 * 1000L * 24 * 14;

    public String generateAccessToken(String userId) {
        return generateToken(userId, ACCESS_TOKEN_EXPIRE_TIME);
    }

    public String generateRefreshToken(String userId) {
        return generateToken(userId, REFRESH_TOKEN_EXPIRE_TIME);
    }

    private String generateToken(String userId, Long expireTime) {
        final Date now = new Date();

        final Claims claims = Jwts.claims()
                .setSubject("access_token")
                .setIssuedAt(now)
                .setExpiration(new Date(now.getTime() + now.getTime()));

        // private claim 등록
        claims.put("userId", userId);

        return Jwts.builder()
                .setHeaderParam(Header.TYPE, Header.JWT_TYPE)
                .setClaims(claims)
                .signWith(getSigningKey())
                .compact();
    }

    private Key getSigningKey() {
        final byte[] keyBytes = jwtSecret.getBytes(StandardCharsets.UTF_8);
        return Keys.hmacShaKeyFor(keyBytes);
    }

    public boolean verifyToken(String token) {
        try {
            final Claims claims = getBody(token);
            return true;
        } catch (RuntimeException e) {
            if (e instanceof ExpiredJwtException) {
                throw new UnAuthorizedException("Expired JWT token");
            }
        }
        return false;
    }

    private Claims getBody(final String token) {
        return Jwts.parserBuilder()
                .setSigningKey(getSigningKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    // JWT Token 내용 확인
    public String getJwtContents(String token) {
        final Claims claims = getBody(token);
        return claims.get("userId", String.class);
    }
}
