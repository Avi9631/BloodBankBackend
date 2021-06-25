package com.example.jwt;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sun.org.apache.bcel.internal.generic.Select;

@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	@Autowired
	private StockRepo repo2;


	public void addUser(UserModel u) {
		repo.save(u);
	}
	
	public Optional<UserModel> getProfileData(String id) {
		return repo.findById(id);
	}
	
	public List<UserModel> getUSer() {
		return repo.findAll();
	}
	
	public List<UserModel> getSearchedUser(String city, String group) {
		return repo.findAllByCityAndGroup(city, group);
	}
	
	public List<BloodStockModel> getStockDB(String group) {
		return repo2.findByGroup(group);
	}

	public List<GroupStockModel> getTotalStocks(){
		return repo2.getTot();
		
	}

	public void addStock(BloodStockModel u) {
		repo2.save(u);
	}
	
	public void deleteUSer(String id) {
		repo.deleteById(id);
	}
	
	public List<UserModel> findUserByEmail(String email) {
		return repo.findByEmail(email);
	}
	
	public Optional<UserModel> findUserById(String id) {
		return repo.findById(id);
	}
	
}
