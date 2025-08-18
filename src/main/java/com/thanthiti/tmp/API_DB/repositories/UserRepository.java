package com.thanthiti.tmp.API_DB.repositories;

import com.thanthiti.tmp.API_DB.models.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<user, Long> { }
