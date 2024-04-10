package com.maboglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maboglia.entities.Test;

public interface TestDAO extends JpaRepository<Test, Integer> {

}
