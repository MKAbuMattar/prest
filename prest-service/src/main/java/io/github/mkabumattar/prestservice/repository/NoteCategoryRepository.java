package io.github.mkabumattar.prestservice.repository;

import io.github.mkabumattar.entityservice.model.NoteCategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteCategoryRepository extends JpaRepository<NoteCategoryModel, Integer> {
}
