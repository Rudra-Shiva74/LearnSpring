package com.theme.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.theme.model.ThymleafUser;

import jakarta.validation.Valid;

@Controller
public class Mycontroller {
	@GetMapping("/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "Abhishek Tiwari");
		mv.setViewName("about");
		return mv;
	}

	@GetMapping("/")
	public ModelAndView Home() {
		List<String> frnd = new ArrayList<>();
		frnd.add("Abhishek Tiwari");
		frnd.add("Rudransh Tiwari");
		frnd.add("Shivansh Tiwari");
//		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int arr = 2;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 3);
		map.put(2, 3);
		map.put(3, 3);
		ModelAndView mv = new ModelAndView();
		mv.addObject("frnd", frnd);
		mv.addObject("arr", arr);
		mv.addObject("map", map);
		mv.setViewName("index");
		return mv;
	}

	@GetMapping("/cund")
	public ModelAndView Condition() {
		ModelAndView mv = new ModelAndView();
		boolean isActive = true;
		List<Integer> ls = new ArrayList<>();
		ls.add(1);
		mv.addObject("isActive", isActive);
		mv.addObject("gender", "M");
		mv.addObject("ls", ls);
		mv.setViewName("condition");
		return mv;
	}

	@GetMapping("/footr")
	public String footer() {
		return "footer";
	}

	@GetMapping("/service")
	public String service() {
		return "service";
	}

	@GetMapping("/aboutnew")
	public String base() {
		return "aboutnew";
	}

	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}

	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("logindata", new ThymleafUser());
		return "Form";
	}

	@PostMapping("/formdata")
	public String formdata(@Valid @ModelAttribute("logindata") ThymleafUser thymleafUser, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println(result);
			return "Form"; 
		} else
			return "formdata";
	}
}
