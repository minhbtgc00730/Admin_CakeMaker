/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author Bui
 */
public class ResultOpponent {
    public String __op;
    public List<ResultObject> objects;

    public ResultOpponent(String __op, List<ResultObject> objects) {
        this.__op = __op;
        this.objects = objects;
    }
    
    
}
