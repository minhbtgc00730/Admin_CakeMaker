/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Api.CakeApi;
import Model.Event;
import Model.Order;
import Model.Picture;
import Model.Product;
import Model.Result;
import Model.ResultAddEvent;
import Model.ResultAddProduct;
import Model.ResultEvent;
import Model.ResultObject;
import Model.ResultPicture;
import Model.ResultOpponent;
import Model.ResultOrder;
import Model.ResultUpdate;
import com.google.gson.Gson;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import retrofit.RestAdapter;
import retrofit.client.Response;
import retrofit.converter.GsonConverter;

/**
 *
 * @author Bui
 */
@ManagedBean(name = "cakeManage")
@SessionScoped
public class CakeMakerManager{

    final String APIKey = "AK5deTY4cweQkqGYJtZ8t71CLPihFOsiFkSQy5HX";
    final String APPId = "l5OJy4F4rw3COKG6Jgc0VKNi7rFQzarUVLcjw4jA";

    RestAdapter retro = new RestAdapter.Builder().setEndpoint("https://api.parse.com")
            
            .build();
    ;
    CakeApi api = retro.create(CakeApi.class);

    public List<Product> showProducts() {
        Result r = api.getListProduct(APIKey, APPId);

        return r.results;
    }

    public List<Order> showOrders() {
        ResultOrder ro = api.getListOrder(APIKey, APPId);

        return ro.results;
    }

    public List<Event> showEvents() {
        ResultEvent re = api.getListEvent(APIKey, APPId);

        return re.results;
    }

    public Response deleteEvent(String objectId) {
        return api.deleteEvent(APIKey, APPId, objectId);
    }

    public Response deleteProduct(String objectId) {
        return api.deleteItem(APIKey, APPId, objectId);
    }

    public ResultAddProduct addProduct(Product product) {
        return api.addProduct(APIKey, APPId, product);
    }

    public ResultAddEvent addEvent(Event event) {
        return api.addEvent(APIKey, APPId, event);
    }

    public ResultUpdate updateProduct(String objectId, Product product) {
        return api.updateProduct(APIKey, APPId, objectId, product);
    }
    
    public ResultUpdate updateEvent(String objectId, Event event) {
        return api.updateEvent(APIKey, APPId, objectId, event);
    }

    public ResultUpdate addPicture(String objectId, ResultPicture picture) {
        return api.addPicture(APIKey, APPId, objectId, picture);
    }

//    public static void main(String[] args) {
//        showEvents().stream().forEach(x -> System.out.println(x));
//    }
    public static void main(String[] args) {
        CakeMakerManager cmm = new CakeMakerManager();
//        cmm.removeProduct("MWUo4Jltyr");
//        cmm.removeProduct("vSoUq7bpFc");
//        Product p = new Product("CAKE CAKE", 1, true, 1000, "des");
//        cmm.addProduct(p);
//        cmm.updateProduct("JBlgDQY4PW", p);
        // cmm.deleteEvent("F694rHFOPG");
        ResultObject object = new ResultObject("Pointer", "Picture", "PRMLzcGNgO");
        List<ResultObject> objects = new ArrayList<>();
        objects.add(object);
        ResultOpponent opponent = new ResultOpponent("AddRelation", objects);
        ResultPicture op = new ResultPicture(opponent);
        cmm.addPicture("giPalvgLO3", op);
        System.out.println("done");
    }

}
