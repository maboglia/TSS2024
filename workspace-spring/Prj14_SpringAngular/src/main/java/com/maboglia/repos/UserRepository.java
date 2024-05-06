package com.maboglia.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.maboglia.entities.User;

@Repository 
public interface UserRepository extends CrudRepository<User, Long>{

}
