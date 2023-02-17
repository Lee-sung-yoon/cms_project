package com.example.cms.user.application;

import com.example.cms.user.domain.SignInForm;
import com.example.cms.user.domain.model.Customer;
import com.example.cms.user.domain.model.Seller;
import com.example.cms.user.exception.CustomException;
import com.example.cms.user.exception.ErrorCode;
import com.example.cms.user.service.customer.CustomerService;
import com.example.cms.user.service.seller.SellerService;
import com.example.domain.common.UserType;
import com.example.domain.config.JwtAuthenticationProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignInApplication {
    private final CustomerService customerService;
    private final SellerService sellerService;
    private final JwtAuthenticationProvider provider;

    public String customerLoginToken(SignInForm form) {
        // 1. 로그인 가능 여부
        Customer c = customerService.findValidCustomer(form.getEmail(), form.getPassword())
                .orElseThrow(() -> new CustomException(ErrorCode.LOGIN_CHECK_FAIL));

        // 2. 토큰을 발행하고


        // 3. 토큰을 response 한다.
        return provider.createToken(c.getEmail(), c.getId(), UserType.CUSTOMER);
    }

    public String sellerLoginToken(SignInForm form) {
        // 1. 로그인 가능 여부
        Seller s = sellerService.findValidSeller(form.getEmail(), form.getPassword())
                .orElseThrow(() -> new CustomException(ErrorCode.LOGIN_CHECK_FAIL));

        // 2. 토큰을 발행하고


        // 3. 토큰을 response 한다.
        return provider.createToken(s.getEmail(), s.getId(), UserType.SELLER);
    }



}
