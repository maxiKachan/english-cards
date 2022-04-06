package com.kachan.registrationserver.domain.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class UserDto {
    private long id;

    @Pattern(regexp = "^[а-яА-Яa-zA-Z]{1,30}$")
    private String firstName;

    @Pattern(regexp = "^[а-яА-Яa-zA-Z]{1,30}$")
    private String lastName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate registrationDate;
}
