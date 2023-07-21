package com.example.restapi.BookManagementNew;

<<<<<<< Updated upstream
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
=======
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
>>>>>>> Stashed changes

@SpringBootApplication
public class BookManagementNewApplication {

<<<<<<< Updated upstream
	public static void main(String[] args) {
		SpringApplication.run(BookManagementNewApplication.class, args);
	}

=======
    public static void main(String[] args) {
        SpringApplication.run(BookManagementNewApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
        return mapper;
    }
>>>>>>> Stashed changes
}
