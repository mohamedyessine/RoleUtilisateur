package com.uploadFiles.files.repository;

import com.uploadFiles.files.models.ERole;
import com.uploadFiles.files.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
