package com.example.jwt;

import java.util.Collections;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepo extends JpaRepository<BloodStockModel, String>{

	@Query(value="select new com.example.jwt.GroupStockModel(u.group ,sum(u.qty)) from BloodStockModel u group by u.group ")
	List<GroupStockModel> getTot();

	List<BloodStockModel> findByGroup(String group);
}
