package com.hemnath.blog.servies.impl;

import com.hemnath.blog.entity.Category;
import com.hemnath.blog.repository.CategoryRepository;
import com.hemnath.blog.servies.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    @Override
    public List<Category> categoryList() {
        return categoryRepository.findAllWithPostCount();
    }
}
