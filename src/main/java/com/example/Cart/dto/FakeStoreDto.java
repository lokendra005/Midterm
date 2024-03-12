package com.example.Cart.dto;

import java.sql.Array;
import java.sql.Date;
import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FakeStoreDto {
    long id;
    long userId;
    String date;
    ArrayList<storedto>products ;

    public class storedto {

    int productId;
        int quantity;
         storedto(int productId,int quantity){
             this.productId = productId;
             this.quantity = quantity;
         }
    }
}
