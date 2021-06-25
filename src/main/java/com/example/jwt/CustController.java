
package com.example.jwt;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/user")
public class CustController {

	@Autowired
	private UserService service;

	@GetMapping("/check")
	public String check() {
		return "WORKING";
	}

	@GetMapping("/getAll")
	private List<UserModel> getUser() {
		return service.getUSer();
	}

	@GetMapping("/getDonor")
	private List<UserModel> getUserBySearch(@RequestParam("city") String city, @RequestParam("group") String group) {
		return service.getSearchedUser(city, group);
	}

	@GetMapping("/getStock")
	private List<BloodStockModel> getStock(@RequestParam("group") String group) {
		return service.getStockDB(group);
	}

	@GetMapping("/getTotStock")
	private List<GroupStockModel> getTotStock() {
		return service.getTotalStocks();
	}

	@GetMapping("/profile")
	private Optional<UserModel> getProfileDB(@RequestParam("id") String id) {
		return service.getProfileData(id);
	}

	@PostMapping("/updateProfile")
	private void updateProfile(@RequestBody UserModel u) {
		service.addUser(u);
	}

	@PostMapping("/logUp")
	private boolean logUp(@RequestBody UserModel u) {
		Optional<UserModel> list = service.findUserById(u.getId());
		if (list.isEmpty()) {
			u.setUserrole("USER");
			service.addUser(u);
			return true;
		} else {
			return false;
		}
	}

//	// ADMIN AREA
//	
//	@GetMapping("/checkRoles")
//	private String  checkRoles() {
//		return "ADMIN WORKED";
//	}
//	
////	@PreAuthorize("hasRole('ROLE_ADMIN')")
//	@GetMapping("/addStock")
//	private void addStock(@RequestParam("group") String group, @RequestParam("date") String date, @RequestParam("qty") String qty) {
//		String uuid= String.valueOf(UUID.randomUUID()); 
//		BloodStockModel u=new BloodStockModel(uuid, group, qty, date);
//		service.addStock(u);
//	}
//	
//	@GetMapping("/deleteUser/{email}" )
////	@PreAuthorize("hasRole('ROLE_ADMIN')")
//	private void delUser(@PathVariable("email") String id) {
//		service.deleteUSer(id);
//	}

}