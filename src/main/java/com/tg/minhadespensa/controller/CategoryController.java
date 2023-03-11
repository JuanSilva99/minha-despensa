package com.tg.minhadespensa.controller;

import com.tg.minhadespensa.dto.CategoryDto;
import com.tg.minhadespensa.model.Category;
import com.tg.minhadespensa.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/category")
public class CategoryController {

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping("/")
    public CategoryDto createCategory(@RequestBody CategoryDto categoryDto) {
        return categoryDto.convert(categoryService.createCategory(categoryDto.convert(categoryDto)));
    }


}
