package pe.com.ocmf.oauth2.client.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping("/greetings")
@AllArgsConstructor
public class GreetingController {

    private final RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity<String> get() {
        String url = "http://localhost:8081/messages";
        log.debug("get {}", url);
        String response = restTemplate.getForObject(url, String.class);
        return ResponseEntity.ok(response);
    }
}
