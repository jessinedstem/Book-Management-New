package com.example.restapi.bookmanagementnew.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = IsbnValidator.class)
@Documented
public @interface ValidIsbn {
    String message() default "should be positive";
    Class<?>[] groups()default {};
    Class<? extends Payload>[]payload()default {};
}
