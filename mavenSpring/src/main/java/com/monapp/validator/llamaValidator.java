package com.monapp.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.monapp.model.Llama;

public class llamaValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Llama.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.empty", "Le prénom doit être saisi");  //Error if empty
		
		Llama llama = (Llama) target;
		if(llama.getName().equalsIgnoreCase("Llama")) {		//Error pour un nom specifique pas accepte
		errors.rejectValue("name", "name.name.notLamaPlease", "Give her a decent name");
		}
	}

}
