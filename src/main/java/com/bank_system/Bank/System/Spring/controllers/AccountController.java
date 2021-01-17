package com.bank_system.Bank.System.Spring.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank_system.Bank.System.Spring.Boot.Account;

@Controller
public class AccountController {
    @Value("${spring.application.name}")
    String appName;
    
    Account account = Account.getInstance();
    
    @RequestMapping("/")
    public String index() {
        return "index.html";
    }
    
    @GetMapping("/balance")
	public String balance(Model model) {
		model.addAttribute("name", account.getBalance());
		return "balance";
	}
    
    @GetMapping("/deposit")
	public String depositGet(Model model) {
    	model.addAttribute("message", "");
    	return "deposit";
	}
    
    @PostMapping("/deposit")
	public String deposit(@RequestBody MultiValueMap<String, String> formData, Model model) {
    	Double amount = Double.parseDouble(formData.get("amount").get(0));
    	System.out.println(amount);
    	String message = account.setBalance(amount);
    	model.addAttribute("message", message);
    	return "deposit";
	}
    
    @GetMapping("/withdraw")
	public String withdraw(Model model) {
		model.addAttribute("message", "");
		return "withdraw";
	}
    
    @PostMapping("/withdraw")
	public String withdraw(@RequestBody MultiValueMap<String, String> formData, Model model) {
    	Double amount = Double.parseDouble(formData.get("amount").get(0));
    	String message = account.withdraw(amount);
    	model.addAttribute("message", message);
		return "withdraw";
	}
}
