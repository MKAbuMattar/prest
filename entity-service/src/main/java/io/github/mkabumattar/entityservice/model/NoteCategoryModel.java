package io.github.mkabumattar.entityservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.github.mkabumattar.utilityservice.constant.ColumnConstants;
import io.github.mkabumattar.utilityservice.constant.TableConstants;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = TableConstants.NOTE_CATEGORY)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name=TableConstants.NOTE_CATEGORY+".findAll", query="SELECT c FROM "+TableConstants.NOTE_CATEGORY+" c")
public class NoteCategoryModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = ColumnConstants.ID)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = ColumnConstants.CATEGORY)
    private String category;

    @ManyToOne()
    @MapsId
    @JsonIgnore
    NoteModel note;

    @Column(name = ColumnConstants.CREATED_AT)
    private LocalDateTime createdAt;

    @Column(name = ColumnConstants.UPDATED_AT)
    private LocalDateTime updatedAt;

}
