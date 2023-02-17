package com.example.cms.cms.user.service;

import com.fasterxml.jackson.databind.JsonNode;
import kong.unirest.Unirest;

import java.net.http.HttpResponse;

//
//public class SendTest {
//    public static String sendMail() {
//        String API_KEY = "c716cf2507ea3815a0f214931b3d0541-ca9eeb88-d64fd425";
//        String MY_DOMAIN_NAME = "sandboxb91dfca30050421d8cc39ac5c8d67247.mailgun.org";
//
//        HttpResponse<JsonNode> request = Unirest.post("https://api.mailgun.net/v3/" + MY_DOMAIN_NAME + "/messages")
//                .basicAuth("api", API_KEY)
//                .queryString("from", "postmaster@sandboxb91dfca30050421d8cc39ac5c8d67247.mailgun.org")
//                .queryString("to", "tjddbs1412@gmail.com")
//                .queryString("subject", "hello")
//                .queryString("text", "testing")
//                .asJson();
//        return request.getBody().toString();
//    }
//
//    public static void main(String[] args) {
//        String result = sendMail();
//        System.out.println(result);
//    }
//
//}
