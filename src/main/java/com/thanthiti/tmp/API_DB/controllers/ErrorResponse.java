package com.thanthiti.tmp.API_DB.controllers;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class ErrorResponse {
    private final LocalDateTime timestamp;
    private final int status;
    private final String message;
    private final String error;
    private final Map<String, List<String>> filedErrors;

    public ErrorResponse(LocalDateTime timestamp, int status, String message, String error, Map<String, List<String>> filedErrors) {
        this.timestamp = timestamp;
        this.status = status;
        this.message = message;
        this.error = error;
        this.filedErrors = filedErrors;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public int getStatus() {
        return status;
    }
    public String getMessage() {
        return message;
    }
    public String getError() {
        return error;
    }
    public Map<String, List<String>> getFiledErrors() {
        return filedErrors;
    }
}
