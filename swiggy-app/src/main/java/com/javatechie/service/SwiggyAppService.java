package com.javatechie.service;

import com.javatechie.client.RestaurantServiceClient;
import com.javatechie.dto.OrderResponseDTO;
import com.javatechie.exception.OrderNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SwiggyAppService {

    @Autowired
    private RestaurantServiceClient restaurantServiceClient;

    public String greeting() {
        return "Welcome to Swiggy App Service";
    }

    public OrderResponseDTO checkOrderStatus(String orderId) throws OrderNotFoundException {
        OrderResponseDTO responseDTO = restaurantServiceClient.fetchOrderStatus(orderId);
        if (responseDTO != null)
        	return responseDTO;
        throw new OrderNotFoundException("No order exists corresponding to this orderId: " +orderId);
    }
}
