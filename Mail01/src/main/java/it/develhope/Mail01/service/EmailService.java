package it.develhope.Mail01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    JavaMailSender mailSender;


    public void sendTo(String email, String title, String message) {
        SimpleMailMessage sms = new SimpleMailMessage();
        sms.setTo(email);
        sms.setSubject(title);
        sms.setText(message);
        mailSender.send(sms);


    }
}
