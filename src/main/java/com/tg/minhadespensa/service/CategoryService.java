package com.tg.minhadespensa.service;

import com.tg.minhadespensa.model.Category;
import com.tg.minhadespensa.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category createCategory(Category category) {
        return categoryRepository.saveAndFlush(category);
    }

    public Category updateCategory(Category category) {
        return categoryRepository.saveAndFlush(category);
    }

    public void deleteCategory(Category category) {
        categoryRepository.deleteById(category.getId());
    }

    public Category getCategoryById(Integer id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }
}
