package com.example.cms.order.service;

import com.example.cms.order.domain.model.Product;
import com.example.cms.order.domain.repository.ProductRepository;
import com.example.cms.order.exception.CustomException;
import com.example.cms.order.exception.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductSearchService {
    private final ProductRepository productRepository;

    public List<Product> searchByName(String name) {
        return productRepository.searchByName(name);
    }

    public Product getByProductId(Long productId) {
        return productRepository.findWithProductItemsById(productId)
                .orElseThrow(() -> new CustomException(ErrorCode.NOT_FOUNT_PRODUCT));
    }
    public List<Product> getListByProductIds(List<Long> productIds) {
        return productRepository.findAllByIdIn(productIds);
    }

}
