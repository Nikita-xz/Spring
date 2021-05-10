package com.xworkz.mvc.component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.mvc.dto.PressOrderDTO;
@Component
@RequestMapping("/")

public class PressOrderComponent {
	
	public PressOrderComponent() {
		System.out.println("created"+ this.getClass().getSimpleName());
	}
	
	@PostMapping("/order.do")
	public String onOrder(PressOrderDTO dto, Model model) {
		System.out.println("invoked onOrder"+dto);
		model.addAttribute("message", "order success !!");
		model.addAttribute("data", dto);
		return "OrderSuccess";
		
	}

}
