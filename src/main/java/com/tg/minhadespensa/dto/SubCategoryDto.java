package com.tg.minhadespensa.dto;

import com.tg.minhadespensa.model.SubCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubCategoryDto {

    private Integer id;
    private Integer category;
    private String name;

    public SubCategoryDto convert(SubCategory subCategory) {
        return SubCategoryDto.builder()
                .id(subCategory.getId())
                .category(subCategory.getCategory())
                .name(subCategory.getName())
                .build();
    }

    public SubCategory convert(SubCategoryDto subCategoryDto) {
        return SubCategory.builder()
                .id(subCategoryDto.getId())
                .category(subCategoryDto.getCategory())
                .name(subCategoryDto.getName())
                .build();
    }
}
