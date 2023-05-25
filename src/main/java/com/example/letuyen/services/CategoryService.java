package com.example.letuyen.services;

import com.example.letuyen.entity.Category;
import com.example.letuyen.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;
    public List<Category> getAllCategories(){return categoryRepository.findAll();}
    public Category getCategoryById(Long id){
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        if(optionalCategory.isPresent()) {
            return optionalCategory.get();
        }else{
            throw new RuntimeException("Category not found");
        }
    }
    public void Addcategory(Category cate){
        categoryRepository.save(cate);
    }
    public void updatecate(Category cate){
        categoryRepository.save(cate);
    }
    public Category saveCategory(Category category){return categoryRepository.save(category);}
    public void deleteCategory(Long id){categoryRepository.deleteById(id);}
}