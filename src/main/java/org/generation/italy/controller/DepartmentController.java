/**
 * 
 */
package org.generation.italy.controller;

import java.math.BigInteger;

import org.generation.italy.model.Department;
import org.generation.italy.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lucai
 *
 */
@Controller
@RequestMapping("/")
public class DepartmentController {

	@Autowired
	private DepartmentRepository rep;
	
	@GetMapping
	public String departments(Model model) {
		model.addAttribute("departments", rep.findAll(Sort.by("name")));
		return "departments";
	}
	
	@GetMapping("/degree/{id}")
	public String degreeDetail(Model model, @PathVariable BigInteger id) {
		Department d = rep.getById(id);
		
		model.addAttribute("department", d);
		return "detail";
		
	}
	
}
