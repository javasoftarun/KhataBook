package com.ak.ApnaKhata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ak.ApnaKhata.beans.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

}
