package com.example.jwt;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000",  exposedHeaders = "authorization")
@RequestMapping("/admin")
public class AdminController {
	
    @Autowired
	private UserService service;
	
	// ADMIN AREA
	
	@GetMapping("/checkRoles")
	private String  checkRoles() {
		return "ADMIN WORKED";
	}
	
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/addStock")
	private void addStock(@RequestParam("group") String group, @RequestParam("qty") String qty) {
		String uuid= String.valueOf(UUID.randomUUID()); 
		BloodStockModel u=new BloodStockModel(uuid, group, qty, LocalDate.now());
		service.addStock(u);
	}
	
	@GetMapping("/deleteUser/{email}" )
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
	private void delUser(@PathVariable("email") String id) {
		service.deleteUSer(id);
	}

}
