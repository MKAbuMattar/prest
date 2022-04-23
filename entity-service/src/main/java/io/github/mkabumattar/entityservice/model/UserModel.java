package io.github.mkabumattar.entityservice.model;

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
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = TableConstants.USER_INFO)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name=TableConstants.USER_INFO+".findAll", query="SELECT c FROM "+TableConstants.USER_INFO+" c")
public class UserModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = ColumnConstants.ID)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = ColumnConstants.USERNAME, unique = true)
    private String username;

    @Column(name = ColumnConstants.EMAIL, unique = true)
    private String email;

    @Column(name = ColumnConstants.PASSWORD)
    private String password;

    @Column(name = ColumnConstants.FIRST_NAME)
    private String firstName;

    @Column(name = ColumnConstants.MIDDLE_NAME)
    private String middleName;

    @Column(name = ColumnConstants.LAST_NAME)
    private String lastName;

    @Column(name = ColumnConstants.DATE_OF_BIRTH)
    private Date dateOfBirth;

    @Column(name = ColumnConstants.BIO)
    private String bio;

    @OneToMany(
            mappedBy = ColumnConstants.USER
    )
    List<LinkModel> links;

    @OneToMany(
            mappedBy = ColumnConstants.USER
    )
    List<PlanModel> plans;

    @OneToMany(
            mappedBy = ColumnConstants.USER
    )
    List<NoteModel> notes;

    @OneToMany(
            mappedBy = ColumnConstants.USER
    )
    List<TasksModel> tasks;

    @Column(name = ColumnConstants.CREATED_AT)
    private LocalDateTime createdAt;

    @Column(name = ColumnConstants.UPDATED_AT)
    private LocalDateTime updatedAt;

}
