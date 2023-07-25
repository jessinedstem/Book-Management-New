package com.example.restapi.bookmanagementnew.validation;

import jakarta.validation.Payload;

public @interface ValidTitle {
    String message() default "title required";
    Class<?>[] groups()default {};
    Class<? extends Payload>[]payload()default {};
}
