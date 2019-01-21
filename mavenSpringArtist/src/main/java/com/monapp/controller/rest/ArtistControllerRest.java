package com.monapp.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monapp.dao.ArtistDao;
import com.monapp.model.Artist;

@RestController
@RequestMapping("/rest/artists")
public class ArtistControllerRest {
	
	@Autowired
	ArtistDao aDao;
	
	@GetMapping("/list")
	public ResponseEntity<List<Artist>> list() {
		return new ResponseEntity<List<Artist>>(aDao.findAll(),HttpStatus.OK);
	}
}
