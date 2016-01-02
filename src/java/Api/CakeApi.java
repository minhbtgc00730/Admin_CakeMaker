package Api;

import Model.Result;
import Model.ResultOrder;
import retrofit.http.GET;
import retrofit.http.Header;

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

    @GET("/1/classes/Product")
    public Result getListProduct(@Header("X-Parse-REST-API-Key") String key,
            @Header("X-Parse-Application-Id") String app
    );

    @GET("/1/classes/Order")
    public ResultOrder getListOrder(@Header("X-Parse-REST-API-Key") String key,
            @Header("X-Parse-Application-Id") String app
    );
}
