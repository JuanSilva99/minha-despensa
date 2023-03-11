package com.tg.minhadespensa.dto;

import com.tg.minhadespensa.model.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.Banner;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelDto {

    private Integer id;
    private Integer product;
    private String name;
    private Integer quantity;
    private Integer barCode;
    private List<String> urlImages;


    public ModelDto convert(Model model) {
        return ModelDto.builder()
                .id(model.getId())
                .product(model.getProduct())
                .name(model.getName())
                .quantity(model.getQuantity())
                .barCode(model.getBarCode())
                .urlImages(model.getUrlImages())
                .build();
    }

    public Model convert(ModelDto modelDto) {
        return Model.builder()
                .id(modelDto.getId())
                .product(modelDto.getProduct())
                .name(modelDto.getName())
                .quantity(modelDto.getQuantity())
                .barCode(modelDto.getBarCode())
                .urlImages(modelDto.getUrlImages())
                .build();
    }
}
