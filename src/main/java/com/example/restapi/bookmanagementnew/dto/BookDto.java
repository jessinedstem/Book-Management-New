package com.example.restapi.bookmanagementnew.dto;

import com.example.restapi.bookmanagementnew.validation.ValidAuthor;
import com.example.restapi.bookmanagementnew.validation.ValidIsbn;
//import com.example.restapi.bookmanagementnew.validation.ValidPublicationDate;
import com.example.restapi.bookmanagementnew.validation.ValidTitle;
import java.time.LocalDate;
import jakarta.validation.constraints.Positive;
import lombok.*;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private long id;
    @ValidTitle private String title;
    @ValidAuthor private String author;
    @Positive
    @ValidIsbn private String isbn;
    private LocalDate publicationDate;
}
