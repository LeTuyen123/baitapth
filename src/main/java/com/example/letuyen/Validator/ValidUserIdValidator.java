package com.example.letuyen.Validator;

import com.example.letuyen.Validator.annotation.ValidUserId;
import com.example.letuyen.entity.User;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User> {

    @Override
    public boolean isValid(User user, ConstraintValidatorContext context) {
        if (user == null)
            return true;
        return user.getId() !=null;
    }
}
