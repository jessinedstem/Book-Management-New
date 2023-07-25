package com.example.restapi.bookmanagementnew.validation;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.util.StringUtils;


public class IsbnValidator implements ConstraintValidator<ValidIsbn, String> {

    @Override
    public boolean isValid(String isbn, ConstraintValidatorContext constraintValidatorContext) {
        return StringUtils.hasText(isbn) && isbn.length() >= 2;
    }
}
