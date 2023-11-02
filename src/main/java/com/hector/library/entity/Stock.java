package com.hector.library.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import java.io.Serializable;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "stock")
public class Stock implements Serializable {
    @Id
    private String id;
    private Product product;
    private String location;
    private Number stock;
    private Date arrivalDate;
    private Date lastUpdatedDate;
    private AlertLevel alertLevel;
}

enum AlertLevel {
    LOW,
    MEDIUM,
    HIGH
}