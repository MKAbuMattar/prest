package io.github.mkabumattar.prestservice.repository;

import io.github.mkabumattar.entityservice.model.NoteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<NoteModel, Integer> {
}
