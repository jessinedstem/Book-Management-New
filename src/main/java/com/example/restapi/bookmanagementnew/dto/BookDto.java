package com.example.restapi.bookmanagementnew.dto;

import com.example.restapi.bookmanagementnew.validation.ValidAuthor;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private long id;

    @NotBlank(message = "title required")
    @Size(min = 3, message = "Must be minimum 3 characters")
    private String title;

    @NotBlank(message = "Author is mandatory")
        @ValidAuthor
    @Size(min = 3, message = "Must be minimum 3 characters")
    private String author;

    @Min(value = 1, message = "the value should be positive")
    private String isbn;

    private LocalDate publicationDate;
}
