 package com.example.restapi.bookmanagementnew.validation;

 import jakarta.validation.ConstraintValidator;
 import jakarta.validation.ConstraintValidatorContext;
 import org.springframework.util.StringUtils;


 public class AuthorValidator implements ConstraintValidator<ValidAuthor, String> {

     @Override
     public boolean isValid(String author, ConstraintValidatorContext context) {
         return StringUtils.hasText(author) && author.length() >= 2;
     }
 }
