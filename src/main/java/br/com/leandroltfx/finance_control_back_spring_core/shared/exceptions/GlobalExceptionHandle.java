package br.com.leandroltfx.finance_control_back_spring_core.shared.exceptions;

import br.com.leandroltfx.finance_control_back_spring_core.shared.dtos.ApiResponseDto;
import br.com.leandroltfx.finance_control_back_spring_core.user.interfaces.web.exceptions.UserFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class GlobalExceptionHandle {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiResponseDto> handleMethodArgumentNotValidException(
            MethodArgumentNotValidException methodArgumentNotValidException
    ) {
        List<String> details = methodArgumentNotValidException.getBindingResult().getFieldErrors().stream()
                .map(error -> error.getField() + ": " + error.getDefaultMessage())
                .collect(Collectors.toList());

        ApiResponseDto apiError = new ApiResponseDto(
                HttpStatus.BAD_REQUEST.value(),
                "Falha na validação dos campos",
                details
        );

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(apiError);
    }

    @ExceptionHandler(UserFoundException.class)
    public ResponseEntity<ApiResponseDto> handleUserFoundException(
            UserFoundException userFoundException
    ) {
        ApiResponseDto apiError = new ApiResponseDto(
                HttpStatus.UNPROCESSABLE_ENTITY.value(),
                userFoundException.getMessage(),
                null
        );

        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(apiError);
    }

}
