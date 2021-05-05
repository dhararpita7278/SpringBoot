package com.springGetRest.springGetRest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springGetRest.springGetRest.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}