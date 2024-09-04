package com.kimsomin.nuts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String categoryCode;
    private String name;
    private String description;
    private Integer status;
    private Long createdBy;
    private Long updatedBy;
    private Date createdDate;
    private Date updatedDate;
    private Date startDate;
    private Date endDate;
}
