package io.github.mkabumattar.prestservice.repository;

import io.github.mkabumattar.entityservice.model.TasksModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksRepository extends JpaRepository<TasksModel, Integer> {
}
