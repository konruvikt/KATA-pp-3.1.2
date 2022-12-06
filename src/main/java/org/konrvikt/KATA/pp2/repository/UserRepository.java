package org.konrvikt.KATA.pp2.repository;

import org.konrvikt.KATA.pp2.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
