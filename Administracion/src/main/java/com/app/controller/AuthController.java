package com.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@PostMapping("/login")	
	public ResponseEntity<?> login(@RequestBody LoginRequest request){
	
		if("admin".equals(request.username()) && "admin123".equals(request.password())) {
			return ResponseEntity.ok().body("{\"message\": \"Login exitoso\"}");
		}
		return ResponseEntity.status(401).body("{\"error\": \"Credenciales inválidas\"}");
		
	}

}
record LoginRequest(String username, String password) {}