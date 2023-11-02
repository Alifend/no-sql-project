package com.hector.library.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "product")
public class Product implements Serializable {
    @Id
    private String id;
    private String name;
    private String description;
    private Number serialNumber;
    private String category;
    private String price;
    private Date expirationDate;
    private List<ProductSupplier> suppliers;
}
