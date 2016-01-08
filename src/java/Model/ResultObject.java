/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Bui
 */
public class ResultObject {
    public String __type;
    public String className;
    public String objectId;

    public ResultObject(String type, String className, String objectId) {
        this.__type = type;
        this.className = className;
        this.objectId = objectId;
    }
    
    
}
