package io.github.mkabumattar.entityservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.github.mkabumattar.utilityservice.constant.ColumnConstants;
import io.github.mkabumattar.utilityservice.constant.TableConstants;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = TableConstants.NOTE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name=TableConstants.NOTE+".findAll", query="SELECT c FROM "+TableConstants.NOTE+" c")
public class NoteModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = ColumnConstants.ID)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = ColumnConstants.TITLE)
    private String title;

    @Column(name = ColumnConstants.CONTENT)
    private String content;

    @OneToMany(mappedBy = ColumnConstants.NOTE)
    List<NoteCategoryModel> category;

    @ManyToOne()
    @MapsId
    @JsonIgnore
    UserModel user;

    @Column(name = ColumnConstants.CREATED_AT)
    private LocalDateTime createdAt;

    @Column(name = ColumnConstants.UPDATED_AT)
    private LocalDateTime updatedAt;
}
