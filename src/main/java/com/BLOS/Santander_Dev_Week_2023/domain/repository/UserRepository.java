package com.BLOS.Santander_Dev_Week_2023.domain.repository;

import com.BLOS.Santander_Dev_Week_2023.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
