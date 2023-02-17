package com.example.cms.cms.user.domain.customer;

import com.example.cms.cms.user.domain.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CustomerDto {
    private Long id;
    private String email;
    private Integer balance;

    public static CustomerDto from(Customer customer) {
        return new CustomerDto(customer.getId(), customer.getEmail(), customer.getBalance() == null ? 0 : customer.getBalance());

    }
}
