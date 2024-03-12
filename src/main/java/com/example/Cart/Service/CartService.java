package com.example.Cart.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Cart.dto.FakeStoreDto;

@Service
public class CartService {
    RestTemplate restTemplate = new RestTemplate();

    String url = "https://fakestoreapi.com";

    public FakeStoreDto[] getAllCarts() {
        var response = restTemplate.getForObject(url + "/carts" , FakeStoreDto[].class);
        return response;
        }

    public FakeStoreDto getCartsById(long id) {
        var response = restTemplate.getForObject(url + "/carts/" + id, FakeStoreDto.class);
        return response;
    }

    public  FakeStoreDto getUserCartById(long userId){
        var response = restTemplate.getForObject(url +"/carts/user/" + userId, FakeStoreDto.class);
        return response;
    }

}
