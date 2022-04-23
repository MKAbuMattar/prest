package io.github.mkabumattar.prestservice.repository;

import io.github.mkabumattar.entityservice.model.LinkModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends JpaRepository<LinkModel, Integer> {
}
