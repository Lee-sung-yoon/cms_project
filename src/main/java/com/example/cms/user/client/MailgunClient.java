package com.example.cms.user.client;

import com.example.cms.user.mailgun.SendMailForm;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "mailgun", url = "https://api.mailgun.net/v3/")
@Qualifier("mailgun")
public interface MailgunClient {

    @PostMapping("sandboxb91dfca30050421d8cc39ac5c8d67247.mailgun.org/messages")
    ResponseEntity<String> sendEmail(@SpringQueryMap SendMailForm form);
}
