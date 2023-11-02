package com.hector.library.entity;

import java.util.Date;

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
@Document(collection = "order")
public class Order {
    @Id
    private String id;
    private Client client;
    private Product product;
    private Number quantity;
    private Status status;
    private Date orderedDate;
}

enum Status {
    PENDING,
    DELIVERED,
    CANCELLED
}
