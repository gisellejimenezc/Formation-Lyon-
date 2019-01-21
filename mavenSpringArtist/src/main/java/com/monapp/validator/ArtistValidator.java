package com.monapp.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.monapp.model.Artist;

public class ArtistValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Artist.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "firstName.empty", "Please choose a name");
		/*Artist artist = (Artist) target;
		if(artist.getFirstName().equalsIgnoreCase("artist")) {
		errors.rejectValue("firstName", "firstName.firstName.notArtistPlease", "Give it a decent name");
		}*/
	}
	
}
