package br.com.leandroltfx.finance_control_back_spring_core.shared.dtos;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ApiErrorResponseDto {

    private int status;
    private String message;
    private LocalDateTime timestamp;
    private List<String> details;

    public ApiErrorResponseDto(int status, String message, List<String> details) {
        this.status = status;
        this.message = message;
        this.details = details;
        this.timestamp = LocalDateTime.now();
    }

}
