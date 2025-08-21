package com.thanthiti.tmp.API_DB.repositories;

import com.thanthiti.tmp.API_DB.models.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<user, Long> {
    // Full version of the query to find a user by email
    @Query("SELECT u FROM user u WHERE u.email = ?1")
    Optional<user> findByEmail(@Param("email") String email);

//    Optional<user> findByEmail(String email);
}
