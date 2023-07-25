package com.example.restapi.bookmanagementnew.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.util.StringUtils;

public class titleValidator implements ConstraintValidator<ValidTitle, String> {

    @Override
    public boolean isValid(String title, ConstraintValidatorContext context) {
        return StringUtils.hasText(title) && title.length() >= 2;
    }
}
