package com.jbqneto.construo.minimarket.application.handler;

import com.jbqneto.construo.minimarket.domain.exception.ModelNotFoundException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {


    @org.springframework.web.bind.annotation.ExceptionHandler(ModelNotFoundException.class)
    public ResponseEntity<Object> handleNotFound(final Exception ex, HttpHeaders headers,
                                                               HttpStatus status, WebRequest request) {

        return handleExceptionInternal(ex,
                new ExceptionData(HttpStatus.NOT_FOUND, ex.getMessage()),
                headers,
                status,
                request);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(ModelNotFoundException.class)
    public ResponseEntity<Object> handleForbidden(final Exception ex, HttpHeaders headers,
                                                               HttpStatus status, WebRequest request) {

        return handleExceptionInternal(ex,
                new ExceptionData(HttpStatus.FORBIDDEN, ex.getMessage()),
                headers,
                status,
                request);
    }

}