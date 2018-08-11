package com.domain.quiz.controller;



import com.domain.quiz.model.Supplier;
import com.domain.quiz.service.impl.SupplierServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class SupplierController {
	
	@Autowired
	private SupplierServiceImpl supplierService;





	@RequestMapping(value="/suppliers", method = RequestMethod.GET)
	public ModelAndView listAll(){
		List<Supplier> suppliers = this.supplierService.findAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("suppliers", suppliers);
		modelAndView.setViewName("suppliers/list");
		return modelAndView;
	}
	
	@RequestMapping(value="/suppliers/new", method = RequestMethod.GET)
	public String create(Model model){


		model.addAttribute("supplier", new Supplier());


		return "suppliers/edit";
	}
	
	@RequestMapping(value = "/suppliers", method = RequestMethod.POST)
	public String edit(@Valid @ModelAttribute("supplier") Supplier supplier,
                       BindingResult result, Model model)  {

		if (result.hasErrors())
		{
			model.addAttribute("errors", result.getAllErrors());
			return "suppliers/edit";
		}
		supplier = this.supplierService.save(supplier);
		return "redirect:/suppliers";
	}	
	
	@RequestMapping(value="/suppliers/edit/{id}", method = RequestMethod.GET)
	public String view(@PathVariable Long id, Model model)
    {

		model.addAttribute("supplier", this.supplierService.findOne(id).get());
		return "suppliers/edit";
	}
	
	@RequestMapping(value="/suppliers/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable Long id, Model model)
	{
		this.supplierService.delete(id);
		return "redirect:/";
	}	
}
