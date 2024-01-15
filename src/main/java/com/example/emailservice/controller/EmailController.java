package com.example.emailservice.controller;

import com.example.emailservice.DTO.OrderCreatedDTO;
import com.example.emailservice.service.EmailService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {
    private final EmailService emailService;
    @Autowired
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }
    @Operation(hidden = true)
    @PostMapping("/order")
    public void sendOrderConfirmation(@RequestBody OrderCreatedDTO request){
        emailService.sendOrderCreatedEmail(request);
    }
}
