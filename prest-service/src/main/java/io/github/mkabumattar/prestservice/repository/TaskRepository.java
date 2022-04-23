package io.github.mkabumattar.prestservice.repository;

import io.github.mkabumattar.entityservice.model.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskModel, Integer> {
}
