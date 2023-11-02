package com.hector.library.entity;

import java.io.Serializable;
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
@Document(collection = "shop")
public class Shop implements Serializable {
    @Id
    private String location;
    private String name;
    private String address;
    private String city;
    private String postalCode;
    private Number stockCapacity;
    private String timetable;
    private List<ProductShop> products;
}
