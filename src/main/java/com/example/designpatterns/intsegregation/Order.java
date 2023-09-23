package com.example.designpatterns.intsegregation;

import lombok.Data;

@Data
public class Order extends Entity{

    private Integer orderNum;
    private double orderTotal;
}
