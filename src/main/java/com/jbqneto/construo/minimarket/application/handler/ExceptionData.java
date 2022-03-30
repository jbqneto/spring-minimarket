package com.jbqneto.construo.minimarket.application.handler;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter
public class ExceptionData {
    private LocalDateTime moment;
    private int status;
    private String message;

    public ExceptionData(HttpStatus status, String message) {
        this.message = message;
        this.status = status.value();
        this.moment = LocalDateTime.now();
    }

}
