package org.example.reboot2.global.auth.repository;

import org.example.reboot2.global.auth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

}
