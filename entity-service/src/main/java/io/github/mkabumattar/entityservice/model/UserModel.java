package io.github.mkabumattar.entityservice.model;

import io.github.mkabumattar.utilityservice.constant.ColumnConstants;
import io.github.mkabumattar.utilityservice.constant.TableConstants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = TableConstants.USER_INFO)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

    @Id
    @Column(name = ColumnConstants.ID)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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
            mappedBy = ColumnConstants.USER,
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    List<LinkModel> links;

    @OneToMany(
            mappedBy = ColumnConstants.USER,
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    List<PlanModel> plans;

    @OneToMany(
            mappedBy = ColumnConstants.USER,
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    List<NoteModel> notes;

    @OneToMany(
            mappedBy = ColumnConstants.USER,
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    List<TasksModel> tasks;

    @Column(name = ColumnConstants.CREATED_AT)
    private LocalDateTime createdAt;

    @Column(name = ColumnConstants.UPDATED_AT)
    private LocalDateTime updatedAt;

}
