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
@Document(collection = "refund")
public class Refund {
    @Id
    private String id;
    private Order order;
    private String reason;
    private Number amount;
    private Date refundDate;
}
