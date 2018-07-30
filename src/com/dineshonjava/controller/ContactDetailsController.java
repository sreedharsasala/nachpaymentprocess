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

import com.dineshonjava.bean.Contactdetails;
import com.dineshonjava.service.ContactdetailService;

/**
 * @author Dinesh Rajput
 *
 */
@Controller
public class ContactDetailsController {
	
	@Autowired
	private ContactdetailService contactdetailService;
	
	@RequestMapping(value = "/saveCategory", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("command") Contactdetails category, 
			BindingResult result) {
		System.out.println("save Category1");
		contactdetailService.addCategory(category);
		System.out.println("save Category2");
		return new ModelAndView("redirect:/addCategory.do");
	}
	
	@RequestMapping(value = "/addCategory", method = RequestMethod.GET)
	public ModelAndView addCategory(@ModelAttribute("command")  Contactdetails contactid,
			BindingResult result) {
		System.out.println("add Category  1st");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("categories",  contactdetailService.getCategories());
		System.out.println("add Category 2nd");
		return new ModelAndView("addCategory", model);
	}
	
	@RequestMapping(value = "/deleteCategory", method = RequestMethod.GET)
	public ModelAndView deleteCategory(@ModelAttribute("command")  Contactdetails category,
			BindingResult result) {
		contactdetailService.deleteCategory(category.getContactid());
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("categories",  contactdetailService.getCategories());
		return new ModelAndView("addCategory", model);
	}
	
	@RequestMapping(value = "/editCategory", method = RequestMethod.GET)
	public ModelAndView editCategory(@ModelAttribute("command")  Contactdetails category,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("category",  contactdetailService.getCategory(category.getContactid()));
		model.put("categories",  contactdetailService.getCategories());
		return new ModelAndView("addCategory", model);
	}
	
	@RequestMapping(value="/categories", method = RequestMethod.GET)
	public List<Contactdetails> getCategories() {
		return contactdetailService.getCategories();
	}
}
