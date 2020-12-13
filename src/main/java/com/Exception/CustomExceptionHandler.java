package com.Exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.model.ExceptionResponces;

@RestController
@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionResponces> handelAllException(Exception ex, WebRequest we) {
		ExceptionResponces ex1 = new ExceptionResponces(new Date(), ex.getMessage(), we.getDescription(false));
		return new ResponseEntity<ExceptionResponces>(ex1, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(StudentNotFoundException.class)
	public final ResponseEntity<ExceptionResponces> handlerUserNotFound(Exception ex, WebRequest we) {
		ExceptionResponces ex2 = new ExceptionResponces(new Date(), ex.getMessage(), we.getDescription(true));
		return new ResponseEntity<ExceptionResponces>(ex2, HttpStatus.NOT_FOUND);

	}

}
