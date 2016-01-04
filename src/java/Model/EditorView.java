/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Bui
 */
@ManagedBean (name = "editor")
public class EditorView {
    private String text;
 
    public String getText() {
        return text;
    }
 
    public void setText(String text) {
        this.text = text;
    }
}
