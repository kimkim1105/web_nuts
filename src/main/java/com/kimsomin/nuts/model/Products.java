package com.kimsomin.nuts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productCode;
    private String name;
    private String description;
    private Double price;
    private String categoryCode;
    private String categoryName;
    private Integer status;
    private Long createdBy;
    private Long updatedBy;
    private Date createdDate;
    private Date updatedDate;
    private Date startDate;
    private Date endDate;
}
