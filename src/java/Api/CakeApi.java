package Api;

import Model.Product;
import Model.Result;
import com.google.gson.JsonArray;
import java.util.List;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Path;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bui
 */
public interface CakeApi {

    @GET("/1/classes/Product/{id}")
    public Product getProduct(@Header("X-Parse-REST-API-Key") String key,
            @Header("X-Parse-Application-Id") String app,
            @Path("id") String id
    );

    @GET("/1/classes/Product")
    public Result getListProduct(@Header("X-Parse-REST-API-Key") String key,
            @Header("X-Parse-Application-Id") String app          
    );
}
