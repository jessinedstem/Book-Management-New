 package com.example.restapi.bookmanagementnew.validation;

 import jakarta.validation.ConstraintValidator;
 import jakarta.validation.ConstraintValidatorContext;
 import org.apache.logging.log4j.util.Strings;
 import org.springframework.util.StringUtils;

 public class AuthorValidator implements ConstraintValidator<ValidAuthor, Strings> {
    @Override
    public boolean isValid(Strings strings, ConstraintValidatorContext constraintValidatorContext)
 {
        String author = null;
        return StringUtils.hasText(author) && author.split(" ").length >= 2;
    }
 }
