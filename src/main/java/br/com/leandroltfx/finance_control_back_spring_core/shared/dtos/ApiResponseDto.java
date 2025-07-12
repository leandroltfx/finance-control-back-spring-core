package br.com.leandroltfx.finance_control_back_spring_core.shared.dtos;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ApiResponseDto {

    private int status;
    private String message;
    private LocalDateTime timestamp;
    private List<String> details;

    public ApiResponseDto(int status, String message, List<String> details) {
        this.status = status;
        this.message = message;
        this.details = details;
        this.timestamp = LocalDateTime.now();
    }

}
