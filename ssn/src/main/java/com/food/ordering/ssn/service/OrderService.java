package com.food.ordering.ssn.service;

import com.food.ordering.ssn.dao.OrderDao;
import com.food.ordering.ssn.model.OrderItemListModel;
import com.food.ordering.ssn.model.OrderModel;
import com.food.ordering.ssn.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderDao orderDao;

    public Response<String> insertOrder(OrderItemListModel orderItemListModel, String oauthId, String mobile, String role) {
        return orderDao.insertOrder(orderItemListModel, oauthId, mobile, role);
    }

    public Response<String> updateOrder(OrderModel orderModel, String oauthId, String mobile, String role) {
        return orderDao.updateOrder(orderModel, oauthId, mobile, role);
    }

    public Response<String> updateOrderStatus(OrderModel orderModel, String oauthId, String mobile, String role) {
        return orderDao.updateOrderStatus(orderModel, oauthId, mobile, role);
    }
}
