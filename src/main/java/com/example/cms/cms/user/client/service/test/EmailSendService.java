package com.example.cms.cms.user.client.service.test;

import com.example.cms.cms.user.client.MailgunClient;
import com.example.cms.cms.user.mailgun.SendMailForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailSendService {
    private final MailgunClient mailgunClient;

    public String sendEmail() {

        SendMailForm form = SendMailForm.builder()
                .from("cms-test@leeEmail.com")
                .to("tjddbs1412@gmail.com")
                .subject("Test email from cms")
                .text("my text email test")
                .build();

        return mailgunClient.sendEmail(form).getBody();
    }
}
