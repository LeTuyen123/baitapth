//package com.example.letuyen.controller;
//
//
//
//import com.example.letuyen.entity.Category;
//import com.example.letuyen.services.BookService;
//import com.example.letuyen.services.CategoryService;
//import jakarta.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//
//import javax.naming.Binding;
//import java.util.List;
//
//@Controller
//@RequestMapping("/category")
//public class CategoryController {
//    @Autowired
//    private CategoryService categoryService;
//
//    @GetMapping
//    public String showAllcategory(Model model){
//        List<Category> categories = categoryService.getAllCategories();
//        model.addAttribute("category",categories);
//        return "category/list";
//    }
//
//    @GetMapping("/add")
//    public String addCateForm(Model model){
//        model.addAttribute("category",new Category ());
//        model.addAttribute("categories", categoryService.getAllCategories());
//        return "category/add";
//    }
//    @PostMapping("/add")
//    public String addCate(@Valid @ModelAttribute("category") Category category, BindingResult bindingResult, Model model  ) {
//        if (bindingResult.hasErrors()) {
//            model.addAttribute("categories", categoryService.getAllCategories());
//            return "category/add";
//        }
//        categoryService.getCate(category);
//        return "redirect:/category";
//    }
//    @GetMapping("/delete/{id}")
//    public String deleteCate(@PathVariable("id")Long id){
//        Category category = categoryService.getCategoryById(id);
//        categoryService.deleteCategory(id);
//        return "redirect:/category";
//    }
//
//    @GetMapping("/edit/{id}")
//    public String editCateForm(@PathVariable("id") Long id, Model model) {
//        Category category = categoryService.getCategoryById(id);
//        model.addAttribute("category", category);
//        model.addAttribute("categories", categoryService.getAllCategories());
//        return "category/edit";
//    }
//    @PostMapping("/edit/{id}")
//    public String editCate(@PathVariable("id") Long id, @ModelAttribute("category") Category Cate) {
//        Category existingCategory = categoryService.getCategoryById(id);
//        existingCategory.setTitle(category.getTitle());
//        existingCategory.setAuthor(book.getAuthor());
//
//        existingBook.setCategory(book.getCategory());
//        existingBook.setPrice(book.getPrice());
//        // Update other properties as needed
//
//        bookService.updateBook(existingBook);
//        return "redirect:/books";
//    }
//
//}
//
