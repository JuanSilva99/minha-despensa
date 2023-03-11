package com.tg.minhadespensa.dto;

import com.tg.minhadespensa.model.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private Integer id;
    private Integer subCategory;
    private String name;

    public ProductDto convert(Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .subCategory(product.getSubCategory())
                .name(product.getName())
                .build();
    }

    public Product convert(ProductDto productDto) {
        return Product.builder()
                .id(productDto.getId())
                .subCategory(productDto.getSubCategory())
                .name(productDto.getName())
                .build();
    }
}
