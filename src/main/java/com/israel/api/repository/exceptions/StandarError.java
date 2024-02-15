package com.israel.api.repository.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
public class StandarError {

    private LocalDateTime timestamp;
    private Integer status;

    private String error;
    private String path;
}
