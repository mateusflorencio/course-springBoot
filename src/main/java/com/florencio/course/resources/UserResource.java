package com.florencio.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.florencio.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
	User user=new User(1L, "mateus", "mateus@gmail.com", "11964188994", "123456");
	
	return ResponseEntity.ok().body(user);
	
	}

}
