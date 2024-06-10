package com.java.ec2.study.project.boundaries.in.controller.ItemController.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ItemResponse {
    private int id;
    private String name;
    private Double price;
    private String description;
    private Integer quantityInStock;

}
