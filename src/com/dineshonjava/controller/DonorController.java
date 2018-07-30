package com.dineshonjava.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dineshonjava.bean.Donor;
import com.dineshonjava.service.ContactdetailService;
import com.dineshonjava.service.DonorService;

@Controller
public class DonorController {
	
	@Autowired
	private DonorService donorService;
	
	@Autowired
	private ContactdetailService contactdetailService;
	
	@RequestMapping(value = "/savePublication", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("command") Donor publication, 
			BindingResult result) {
		donorService.addPublication(publication);
		return new ModelAndView("redirect:/addPublication.do");
	}
	
	@RequestMapping(value = "/addPublication", method = RequestMethod.GET)
	public ModelAndView addPublication(@ModelAttribute("command")  Donor publication,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("publications",  donorService.getPublications());
		model.put("categories",  contactdetailService.getCategories());
		return new ModelAndView("addPublication", model);
	}
	
	@RequestMapping(value = "/deletePublication", method = RequestMethod.GET)
	public ModelAndView deletePublication(@ModelAttribute("command")  Donor publication,
			BindingResult result) {
		donorService.deletePublication(publication.getDonorid());
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("publications",  donorService.getPublications());
		model.put("categories",  contactdetailService.getCategories());
		return new ModelAndView("addPublication", model);
	}
	
	@RequestMapping(value = "/editPublication", method = RequestMethod.GET)
	public ModelAndView editPublication(@ModelAttribute("command")  Donor publication,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("publication",  donorService.getPublication(publication.getDonorid()));
		model.put("publications",  donorService.getPublications());
		model.put("categories",  contactdetailService.getCategories());
		return new ModelAndView("addPublication", model);
	}
	
	@RequestMapping(value="/publications", method = RequestMethod.GET)
	public List<Donor> getPublications() {
		return donorService.getPublications();
	}
}
