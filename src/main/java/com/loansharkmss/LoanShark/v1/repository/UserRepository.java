package com.loansharkmss.LoanShark.v1.repository;

import com.loansharkmss.LoanShark.v1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserById(Integer id);

    User findUserByEmail(String email);

    User findUserByUsername(String username);

    Integer deleteUserById(Integer id);
}
