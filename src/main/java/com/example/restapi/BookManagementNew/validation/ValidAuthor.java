 package com.example.restapi.BookManagementNew.validation;

 import jakarta.validation.Constraint;
 import jakarta.validation.Payload;

 import java.lang.annotation.*;

 @Target(ElementType.FIELD)
 @Retention(RetentionPolicy.RUNTIME)
 @Constraint(validatedBy = AuthorValidator.class)
 @Documented
 public@interface ValidAuthor{
    String message() default "Author provided is not valid,should have at least 2 names separate";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
 }
