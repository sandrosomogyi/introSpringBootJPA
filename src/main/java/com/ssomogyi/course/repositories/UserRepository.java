package com.ssomogyi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssomogyi.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
