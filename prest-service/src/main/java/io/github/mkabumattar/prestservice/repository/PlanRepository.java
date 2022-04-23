package io.github.mkabumattar.prestservice.repository;

import io.github.mkabumattar.entityservice.model.PlanModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRepository extends JpaRepository<PlanModel, Integer> {
}
