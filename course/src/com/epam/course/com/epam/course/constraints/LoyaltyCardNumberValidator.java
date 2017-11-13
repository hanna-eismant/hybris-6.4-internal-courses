package com.epam.course.com.epam.course.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LoyaltyCardNumberValidator implements ConstraintValidator<LoyaltyCardNumber, String> {

    @Override
    public void initialize(final LoyaltyCardNumber loyaltyCardNumber) {
        // no initialization is needed
    }

    @Override
    public boolean isValid(final String value, final ConstraintValidatorContext constraintValidatorContext) {
        return !(value == null || value.isEmpty() || value.length() != 10);
    }
}
