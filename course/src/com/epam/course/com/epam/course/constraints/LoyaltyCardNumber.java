package com.epam.course.com.epam.course.constraints;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = com.epam.course.com.epam.course.constraints.LoyaltyCardNumberValidator.class)
@Documented
public @interface LoyaltyCardNumber {
    String message() default "{course.constraints.LoyaltyCardNumber.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
