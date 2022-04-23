package io.github.mkabumattar.prestservice.repository;

import io.github.mkabumattar.entityservice.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {
}
