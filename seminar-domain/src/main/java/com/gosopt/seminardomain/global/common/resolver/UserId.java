package com.gosopt.seminardomain.global.common.resolver;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.PARAMETER})
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface UserId {
}
