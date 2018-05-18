package com.audio.config;

        import org.springframework.dao.DataIntegrityViolationException;
        import org.springframework.web.bind.annotation.ControllerAdvice;
        import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
class GlobalControllerExceptionHandler {
    @ExceptionHandler(DataIntegrityViolationException.class)
    public void handleConflict() {
        // exceptionHandler, controllerAdvice
        // 1. 사용자 exception 생성, exception이 생성되는 controller에서 던지기
        // 2. 사용자 정의 exception을 받아서 처리
        // 3. 모든 컨트롤러는 이 컨트롤러를 거치기 때무네 괜츈
    }
}