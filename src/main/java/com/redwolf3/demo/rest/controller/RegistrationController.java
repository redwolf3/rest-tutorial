package com.redwolf3.demo.rest.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.redwolf3.demo.rest.dto.User;

@RestController
public class RegistrationController {

	@RequestMapping(method = RequestMethod.POST, value = "/register", produces = MediaType.APPLICATION_JSON_VALUE)
	public User register(@RequestBody User user) {
		user.setAddress(user.getAddress() + "2");
		user.setLastName(user.getLastName() + "2");
		user.setMail(user.getMail() + "2");
		user.setName(user.getName() + "2");
		user.setPassword(user.getPassword() + "2");
		
		return user;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
	public String hello() {		
		return "Hello World";
	}

	@ExceptionHandler
	void handleIllegalArgumentException(IllegalArgumentException e, HttpServletResponse response) throws IOException {
		response.sendError(HttpStatus.BAD_REQUEST.value());
	}
}