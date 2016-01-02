/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Bui
 */
@ManagedBean(name = "order")
@SessionScoped  

public class Order {
    public String createdAt;
    public String updatedAt;
    public String objectId;
    public String name;
    public String address;
    public String deliveryDate;
    public String email;
    public String phone;
    public float total;

    public Order() {
    }
    
    public List<Order> listOrder;

    public void setListOrder(List<Order> list) {
        this.listOrder = list;
    }  

    public Order(String createdAt, String updatedAt, String objectId, String name, String address, String deliveryDate, String email, String phone, float total, List<Order> listOrder) {
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.objectId = objectId;
        this.name = name;
        this.address = address;
        this.deliveryDate = deliveryDate;
        this.email = email;
        this.phone = phone;
        this.total = total;
        this.listOrder = listOrder;
    }
       

    @Override
    public String toString() {
        return "Order{" + "objectId=" + objectId + ", name=" + name + ", address=" + address + ", deliveryDate=" + deliveryDate + ", email=" + email + ", phone=" + phone + ", total=" + total + ", listOrder=" + listOrder + '}';
    }
    
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
   
    
    
}
