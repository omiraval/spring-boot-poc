package pe.com.ocmf.oauth2.resource.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @GetMapping
    public ResponseEntity<String> get(Authentication authentication) {
        return ResponseEntity.ok("Hello "+authentication.getName());
    }

    @PostMapping
    public ResponseEntity<String> post(Authentication authentication) {
        return ResponseEntity.ok("Message received "+authentication.getName());
    }

}
