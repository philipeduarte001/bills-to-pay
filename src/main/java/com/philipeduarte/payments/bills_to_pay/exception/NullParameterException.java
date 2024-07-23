package com.philipeduarte.payments.bills_to_pay.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NullParameterException extends RuntimeException{
    public NullParameterException(String message) {
        super(message);
    }
}
