package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    public void addOrder(Order order) {
        orderRepository.addOrder(order);
    }

    public void addPartner(String partnerId) {
        orderRepository.addPartner(partnerId);
    }


    public void addOrderPartnerPair(String orderId, String partnerId) {
        orderRepository.addOrderPartnerPair(orderId,partnerId);
    }

    public Order getOrderById(String orderId) {
        Order result = orderRepository.getOrderById(orderId);
        return result;
    }

    public DeliveryPartner getPartnerById(String partnerId) {
        DeliveryPartner result = orderRepository.getPartnerById(partnerId);
        return result;
    }

    public Integer getOrderCountByPartnerId(String partnerId) {
        int result = orderRepository.getOrderCountByPartnerId(partnerId);
        return result;
    }


    public List<String> getOrdersByPartnerId(String partnerId) {
        List<String> result = orderRepository.getOrdersByPartnerId(partnerId);
        return result;
    }

    public List<String> getAllOrders() {
        List<String> result = orderRepository.getAllOrders();
        return result;
    }

    public Integer getCountOfUnassignedOrders() {
        int countOfOrders = orderRepository.getCountOfUnassignedOrders();
        return countOfOrders;
    }

    public Integer getOrdersLeftAfterGivenTimeByPartnerId(String time, String partnerId) {
        int countOfOrders = orderRepository.getOrdersLeftAfterGivenTimeByPartnerId(time, partnerId);
        return countOfOrders;
    }

    public String getLastDeliveryTimeByPartnerId(String partnerId) {
        String time = orderRepository.getLastDeliveryTimeByPartnerId(partnerId);
        return time;
    }

    public void deletePartnerById(String partnerId) {
        orderRepository.deletePartnerById(partnerId);
    }

    public void deleteOrderById(String orderId) {
        orderRepository.deleteOrderById(orderId);

    }
}
