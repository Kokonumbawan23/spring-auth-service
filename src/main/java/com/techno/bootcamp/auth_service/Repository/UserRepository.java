package com.techno.bootcamp.auth_service.Repository;

import com.techno.bootcamp.auth_service.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    
}
