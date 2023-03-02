package com.ak.ApnaKhata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ak.ApnaKhata.beans.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
	
	
	@Query("select u from Users u where u.email =:email") 
	public Users findByUserName(@Param("email")String email);

}
