package Api;

import Model.Event;
import Model.Product;
import Model.Result;
import Model.ResultAddEvent;
import Model.ResultAddProduct;
import Model.ResultEvent;
import Model.ResultPicture;
import Model.ResultOrder;
import Model.ResultUpdate;
import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.POST;
import retrofit.http.PUT;
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
public interface CakeApi{
    String apiKey = "X-Parse-REST-API-Key";
    String appId = "X-Parse-Application-Id";
    
    @GET("/1/classes/Product")
    public Result getListProduct(@Header(apiKey) String key,
            @Header(appId) String app
    );

    @GET("/1/classes/Order")
    public ResultOrder getListOrder(@Header(apiKey) String key,
            @Header(appId) String app
    );

    @GET("/1/classes/Event")
    public ResultEvent getListEvent(@Header(apiKey) String key,
            @Header(appId) String app
    );
    
    @DELETE("/1/classes/Event/{id}")
    public Response deleteEvent(@Header(apiKey) String key,
            @Header(appId) String app,
            @Path("id") String objectId);

    @DELETE("/1/classes/Product/{id}")
    public Response deleteItem(@Header(apiKey) String key,
            @Header(appId) String app,
            @Path("id") String objectId);

    @POST("/1/classes/Product")
    public ResultAddProduct addProduct(@Header(apiKey) String key,
            @Header(appId) String app,
            @Body Product product);

    @POST("/1/classes/Event")
    public ResultAddEvent addEvent(@Header(apiKey) String key,
            @Header(appId) String app,
            @Body Event event);
    
    @PUT("/1/classes/Product/{id}")
    public ResultUpdate updateProduct(@Header(apiKey) String key,
            @Header(appId) String app,
            @Path("id") String objectId, @Body Product product
    );
    
    @PUT("/1/classes/Event/{id}")
    public ResultUpdate updateEvent(@Header(apiKey) String key,
            @Header(appId) String app,
            @Path("id") String objectId, @Body Event event
    );

    @PUT("/1/classes/Product/{id}")
    public ResultUpdate addPicture(@Header(apiKey) String key,
            @Header(appId) String app,
            @Path("id") String objectId, @Body ResultPicture opponent
    );

}
