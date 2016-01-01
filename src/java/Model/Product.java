package Model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bui
 */
@ManagedBean(name = "product")
@SessionScoped
        
public class Product {
    public String createdAt;
    public String updatedAt;
    public String objectId;
    public String name;
    public int discount;
    public boolean egg;
    public float price;
    public String description;

    public Product() {
    }

    public List<Product> list;

    public void setList(List<Product> list) {
        this.list = list;
    }

    public Product(String createdAt, String updatedAt, String objectId, String name, int discount, boolean egg, float price, String description, List<Product> list) {
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.objectId = objectId;
        this.name = name;
        this.discount = discount;
        this.egg = egg;
        this.price = price;
        this.description = description;
        this.list = list;
    }


    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", discount=" + discount + ", egg=" + egg + ", description=" + description + '}';
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

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public boolean isEgg() {
        return egg;
    }

    public void setEgg(boolean egg) {
        this.egg = egg;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    

}
