package com.cg.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.exception.EmptyTableException;
import com.cg.exception.ProductNotFoundException;
@ControllerAdvice
public class ExceptionController {
	@ExceptionHandler(value=ProductNotFoundException.class)
	public ResponseEntity<Object> exceptionHandler(Exception ex){
		
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
		
	}
	@ExceptionHandler(value=EmptyTableException.class)
	public ResponseEntity<Object> exceptionHandler1(Exception ex){
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
		
		
	}
	
	
	
	
	

}
