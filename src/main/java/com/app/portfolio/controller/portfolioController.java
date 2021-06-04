package com.app.portfolio.controller;

import com.app.portfolio.Model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/import")
public class portfolioController {

    @Autowired
    JavaMailSender javaMailSender;

    @PostMapping("/userData")
    @CrossOrigin(origins = "http://localhost:4200")
    public UserDetails startApplication(@RequestBody UserDetails userDetails){
        StringBuilder bodyString = new StringBuilder();
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo("prasanth10.official@gmail.com");
        mail.setSubject("PORTFOLIO - REQUESTED BY -> " + userDetails.getEmailId());
        bodyString.append(userDetails.getName()).append(System.getProperty("line.separator"))
        .append(userDetails.getPhoneNum()).append(System.getProperty("line.separator"))
        .append(userDetails.getSkypeId()).append(System.getProperty("line.separator"))
        .append(userDetails.getBriefId());
        mail.setText(bodyString.toString());
        try{
            javaMailSender.send(mail);
            userDetails.setStatus("SUCCESS");
            userDetails.setThanksMessage(new StringBuilder().append("Thanks ").append(userDetails.getName()).toString());
            userDetails.setRespMessage(new StringBuilder().append(" I received your mail and will reply back ASAP").toString());
            return userDetails;
        } catch(Exception e){
            System.out.print("Mail Sender Exception => " + e);
            userDetails.setStatus("FAILURE");
            userDetails.setThanksMessage(new StringBuilder().append("Sorry ").append(userDetails.getName()).toString());
            userDetails.setRespMessage(new StringBuilder().append("We are facing some technical issues, can you please retry in few minutes ")
                    .append("OR use any other forms of contact displayed").toString());
            return userDetails;
        }

    }
}
