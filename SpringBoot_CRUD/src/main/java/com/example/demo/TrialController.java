package com.example.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TrialController {


	@RequestMapping("/getProperty")
	public String getProperty(Model model) {
		
		model.addAttribute("inputText", "getProperty");
		return "receiveValue";
	}
}
