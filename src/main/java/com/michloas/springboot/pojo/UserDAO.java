package com.michloas.springboot.pojo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by michloas on 2018/8/8.
 */

@Service
public interface UserDAO extends JpaRepository<User, Integer> {

    User findByName(String name);

    List<User> findByNameContaining(String name);

    Page<User> findByNameNot(String name, Pageable pageable);
}

