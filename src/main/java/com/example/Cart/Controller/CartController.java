package com.example.Cart.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.Cart.Service.CartService;
import com.example.Cart.dto.FakeStoreDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class CartController {
    CartService cs;
    CartController(CartService cs){
        this.cs = cs;
    }

    @GetMapping("/carts")
    public FakeStoreDto[] getAllCarts() {

        return cs.getAllCarts();
    }

    @GetMapping("/carts/{id}")
    public FakeStoreDto getCartsById(@PathVariable long id) {
        return cs.getCartsById(id);
    }


    @GetMapping("/carts/user/{userId}")
    public FakeStoreDto getUserCartById(@PathVariable long userId){
        return cs.getUserCartById(userId);
    }
    
}

