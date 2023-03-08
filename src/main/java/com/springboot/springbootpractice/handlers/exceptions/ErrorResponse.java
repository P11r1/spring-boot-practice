package com.springboot.springbootpractice.handlers.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @author Marko
 * @Date 08/03/2023
 */
@Data
@AllArgsConstructor
public class ErrorResponse {

    private String message;

    private List<String> details;

}
