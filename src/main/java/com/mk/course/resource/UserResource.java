package com.mk.course.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mk.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Bruno", "bruno_emeka@hotmail.com", "999999999999", "teste");
		return ResponseEntity.ok(u);
	}
	
}
