package com.monapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.monapp.dao.LlamaDao;
import com.monapp.model.Llama;
import com.monapp.validator.llamaValidator;


@Controller
//@RequestMapping("/petit part d'url qui ira dans tous les pages")
public class LlamaController {
	
	@Autowired
	LlamaDao lDao;
	
	@GetMapping("/add")
	public String add(Model model) {
		model.addAttribute("lla", new Llama());
		return "add";  	
	}
	
	@GetMapping ("/edit/{id}")
	public String edit(@PathVariable(value="id") int id, Model model) {
		Llama llama = lDao.findByKey(id);
		model.addAttribute("lla",llama);
		return "add";
	}
	
	@PostMapping ("/processForm") // meme PostMapping pour add and edit
	public String addLlama(@ModelAttribute("lla") Llama llama,  BindingResult result, Model model) {
		new llamaValidator().validate(llama, result);
		if (result.hasErrors()) {
			System.out.println("L'utilisateur n'a pas été validé ...");
			return "add";
		}
		if(llama.getId() == 0){
			lDao.insert(llama);
		}else {
			lDao.update(llama);
		}
		return "redirect:/home";
	}
	
	/*@GetMapping("/delete")
	public String delete(Model model) {
		model.addAttribute("ids", new String());
		return "delete";  	
	}
	
	@PostMapping ("/delete")
	public String deleteLlama(@ModelAttribute("ids") String ids, Model model) {
		int id = Integer.parseInt(ids);
		Llama llama  = lDao.findByKey(id);
		lDao.delete(llama);
		return "redirect:/home";
	}  Jèai pas reussi a recuperer l'Id depuis le formulaire*/
	
		
	@GetMapping("/delete/{id}")
	public String deleteByPath(@PathVariable(value="id") int id, Model model) {
		Llama llama  = lDao.findByKey(id);
		lDao.delete(llama);
		return "redirect:/home";  	
	}
	
	
	
}
