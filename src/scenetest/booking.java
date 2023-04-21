/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenetest;

/**
 *
 * @author riina
 */

import javax.persistence.*;
import javax.persistence.GeneratedValue;


@Entity
@Table(name = "booking")
public class booking implements java.io.Serializable {
    
    @Id     
    @Column(name = "tickt_no")
    private int tikt;
    
    @Column(name = "worship_type")
    private String worship;
    
    @Column(name = "time")
    private String time;
    
    @Column(name = "day")
    private String date;
    
    @Column(name = "visitorID")
    private int id;

    public booking() {
    }
    
    public booking(int tikt, String worship, String time, String date, int id) {
        this.tikt = tikt;
        this.worship = worship;
        this.time = time;
        this.date = date;
        this.id = id;
    }
    
    public booking(int id, int tikt, String time, String date) {
        this.tikt = tikt;
        this.time = time;
        this.date = date;
        this.id = id;
    }
    
    
    public int getTikt() {
        return tikt;
    }

    public void setTikt(int tikt) {
        this.tikt = tikt;
    }

    public String getWorship() {
        return worship;
    }

    public void setWorship(String worship) {
        this.worship = worship;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int txtid) {
        this.id = txtid;
    }
    
  
    
    
    
    
    
    
    
    
    
    
    
}