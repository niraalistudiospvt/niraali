package com.example.niraali;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class NiraaliController {

	@GetMapping("/checkme")
	public String checkMe() {
		return "welcome to rest services";
	}
}
