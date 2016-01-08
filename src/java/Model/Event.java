/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.CakeMakerManager;
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

    public Event(String name) {
        this.name = name;
    }

    public void addEvent() {
        CakeMakerManager cmm = new CakeMakerManager();
        Event event = new Event(name);
        cmm.addEvent(event);
    }

    public String deleteEvent(String object_id) {
        CakeMakerManager cmm = new CakeMakerManager();
        cmm.deleteEvent(object_id);
        return "event.xhtml?faces-redirect=true";
    }
    
    public String updateEvent(String object_id, Event event) {
        CakeMakerManager cmm = new CakeMakerManager();
        return "event.xhtml?faces-redirect=true";
    }

    public Event() {
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
