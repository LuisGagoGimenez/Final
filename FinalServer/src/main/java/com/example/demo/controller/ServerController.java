package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {
	private final static Logger logger = LoggerFactory.getLogger(ServerController.class);
	
	public static String status;

	@GetMapping("/open")
	public ResponseEntity<String> open() {
		status = "open";
		logger.info("Llamada al endpoint " + status);
		return ResponseEntity.status(HttpStatus.OK).body(status);
	}

	@GetMapping("/close")
	public ResponseEntity<String> close() {
		status = "close";
		logger.info("Llamada al endpoint " + status);
		return ResponseEntity.status(HttpStatus.OK).body(status);
	}

	@GetMapping("/halfopen")
	public ResponseEntity<String> halfopen() {
		status = "halfopen";
		logger.info("Llamada al endpoint " + status);
		return ResponseEntity.status(HttpStatus.OK).body(status);
	}

}
