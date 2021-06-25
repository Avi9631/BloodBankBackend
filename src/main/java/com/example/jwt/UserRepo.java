package com.example.jwt;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserModel, String>{


	List<UserModel> findAllByCityAndState(String city, String group);

	List<UserModel> findAllByCityAndGroup(String city, String group);

	Optional<UserModel> findByName(String id);

	void deleteByEmail(String id);

	List<UserModel> findByEmail(String email);


}
