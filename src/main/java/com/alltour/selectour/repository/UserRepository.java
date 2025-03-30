package com.alltour.selectour.repository;

import com.alltour.selectour.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
