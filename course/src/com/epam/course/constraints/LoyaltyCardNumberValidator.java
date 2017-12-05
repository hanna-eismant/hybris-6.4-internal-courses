package com.epam.course.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class LoyaltyCardNumberValidator implements ConstraintValidator<LoyaltyCardNumber, String> {

    private static final String LOYALTY_PATTERN = "[A-Z]{1}\\d{9}";
    private Pattern pattern;

    @Override
    public void initialize(final LoyaltyCardNumber loyaltyCardNumber) {
        pattern = Pattern.compile(LOYALTY_PATTERN);
    }

    @Override
    public boolean isValid(final String value, final ConstraintValidatorContext constraintValidatorContext) {
        if (value == null || value.isEmpty()) {
            return false;
        }

        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }
}
