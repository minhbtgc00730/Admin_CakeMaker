/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;

/**
 *
 * @author Bui
 */
public class Picture {
    public File fileName;
    public String Description;

    public Picture(File fileName, String Description) {
        this.fileName = fileName;
        this.Description = Description;
    }
    
    
}
