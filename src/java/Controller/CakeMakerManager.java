/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Api.CakeApi;
import Model.Order;
import Model.Product;
import Model.Result;
import Model.ResultOrder;
import com.google.gson.Gson;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

/**
 *
 * @author Bui
 */
@ManagedBean (name = "cakeManage")
@SessionScoped
public class CakeMakerManager {
    static  RestAdapter retro = new RestAdapter.Builder().setEndpoint("https://api.parse.com")
                .setConverter(new GsonConverter(new Gson()))
                .build();;
  

    public List<Product> showProducts() {
        CakeApi api = retro.create(CakeApi.class);
        Result r = api.getListProduct("AK5deTY4cweQkqGYJtZ8t71CLPihFOsiFkSQy5HX", "l5OJy4F4rw3COKG6Jgc0VKNi7rFQzarUVLcjw4jA");
        
        return r.results;
    }
    
    public List<Order> showOrders() {
        CakeApi api = retro.create(CakeApi.class);
        ResultOrder resultOrder = api.getListOrder("AK5deTY4cweQkqGYJtZ8t71CLPihFOsiFkSQy5HX", "l5OJy4F4rw3COKG6Jgc0VKNi7rFQzarUVLcjw4jA");
        
        return resultOrder.results;
    }
    
//    public static void main(String[] args) {
//        showOrders().stream().forEach(x-> System.out.println(x));
//    }

}
