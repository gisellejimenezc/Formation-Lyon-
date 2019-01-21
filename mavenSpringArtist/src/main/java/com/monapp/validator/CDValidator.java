package com.monapp.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.monapp.model.CD;

public class CDValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return CD.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "title.empty", "Please choose a title");
		CD cd = (CD) target;
	}
	
}
