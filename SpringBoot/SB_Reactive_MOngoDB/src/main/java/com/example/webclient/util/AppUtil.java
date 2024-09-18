package com.example.webclient.util;

import com.example.webclient.dto.ProductDto;
import com.example.webclient.entity.Product;
import org.springframework.beans.BeanUtils;

public class AppUtil {

    public static ProductDto entityToDto(Product product) {
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        return productDto;
    }

    public static Product dtoToEntity(ProductDto productDto) {
        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);
        return product;
    }
}
