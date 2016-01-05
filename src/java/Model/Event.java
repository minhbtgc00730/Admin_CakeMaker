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
@ManagedBean(name = "event")
@SessionScoped

public class Event {
    public String objectId;
    public String name;

    public Event(String objectId, String name) {
        this.name = name;
        this.objectId = objectId;
    }

    public List<Event> list;
    
    public void setList(List<Event> list) {
        this.list = list;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    @Override
    public String toString() {
        return "Event{" + "objectId=" + objectId + ", name=" + name + ", list=" + list + '}';
    }
}
