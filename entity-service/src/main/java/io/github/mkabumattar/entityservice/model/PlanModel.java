package io.github.mkabumattar.entityservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.github.mkabumattar.utilityservice.constant.ColumnConstants;
import io.github.mkabumattar.utilityservice.constant.TableConstants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = TableConstants.PLAN)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanModel {

    @Id
    @Column(name = ColumnConstants.ID)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = ColumnConstants.TITLE)
    private String title;

    @Column(name = ColumnConstants.PLACE)
    private String place;

    @Column(name = ColumnConstants.DATE)
    private String date;

    @Column(name = ColumnConstants.START_TIME)
    private String startTime;

    @Column(name = ColumnConstants.END_TIME)
    private String endTime;

    @Column(name = ColumnConstants.NOTE_PLAN)
    private String note;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId
    @JsonIgnore
    UserModel user;

    @Column(name = ColumnConstants.CREATED_AT)
    private LocalDateTime createdAt;

    @Column(name = ColumnConstants.UPDATED_AT)
    private LocalDateTime updatedAt;

}
