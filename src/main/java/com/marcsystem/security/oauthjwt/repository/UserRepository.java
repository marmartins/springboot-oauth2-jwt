package com.marcsystem.security.oauthjwt.repository;

import com.marcsystem.security.oauthjwt.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{

    User findByUsername(String username);

}
