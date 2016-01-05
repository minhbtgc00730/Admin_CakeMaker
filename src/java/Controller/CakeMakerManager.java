/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Api.CakeApi;
import Model.Event;
import Model.Order;
import Model.Product;
import Model.Result;
import Model.ResultEvent;
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
@ManagedBean(name = "cakeManage")
@SessionScoped
public class CakeMakerManager {

    static RestAdapter retro = new RestAdapter.Builder().setEndpoint("https://api.parse.com")
            .setConverter(new GsonConverter(new Gson()))
            .build();
    ;
    CakeApi api = retro.create(CakeApi.class);

    public List<Product> showProducts() {
        Result r = api.getListProduct("AK5deTY4cweQkqGYJtZ8t71CLPihFOsiFkSQy5HX", "l5OJy4F4rw3COKG6Jgc0VKNi7rFQzarUVLcjw4jA");

        return r.results;
    }

    public List<Order> showOrders() {
        ResultOrder ro = api.getListOrder("AK5deTY4cweQkqGYJtZ8t71CLPihFOsiFkSQy5HX", "l5OJy4F4rw3COKG6Jgc0VKNi7rFQzarUVLcjw4jA");

        return ro.results;
    }

    public List<Event> showEvents() {
        ResultEvent re = api.getListEvent("AK5deTY4cweQkqGYJtZ8t71CLPihFOsiFkSQy5HX", "l5OJy4F4rw3COKG6Jgc0VKNi7rFQzarUVLcjw4jA");

        return re.results;
    }

//    public static void main(String[] args) {
//        showEvents().stream().forEach(x -> System.out.println(x));
//    }

}
