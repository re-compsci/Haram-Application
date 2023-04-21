/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenetest;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "visitors")
public class visitors implements java.io.Serializable {
    
    @Id
    @Column(name = "visitorID")
    private int txtid;
    
    @Column(name = "FullName")
    private String txtname;
    
    @Column(name = "age")
    private String txtage;
    
    @Column(name = "password")
    private String txtpass;
    
    @Column(name = "Phone_no")
    private int txtphone;
    
    public visitors() {
    }
    public visitors(int txtid, String txtname, String txtage, String txtpass, int txtphone) {
       
        this.txtid= txtid;
        this.txtname=txtname;
        this.txtage=txtage;
        this.txtpass=txtpass;
        this.txtphone=txtphone;       
    }
    public int getTxtid() {
        return txtid;
    }
    public void setTxtid(int txtid) {
        this.txtid = txtid;
    }
    public String getTxtname() {
        return txtname;
    }
    public void setTxtname(String txtname) {
        this.txtname = txtname;
    }
    public String getTxtage() {
        return txtage;
    }
    public void setTxtage(String txtage) {
        this.txtage = txtage;
    }
    public String getTxtpassword() {
        return txtpass;
    }
    public void setTxtpassword(String txtpassword) {
        this.txtpass = txtpassword;
    }
    public int getTxtphone() {
        return txtphone;
    }
    public void setTxtphone(int txtphone) {
        this.txtphone = txtphone;
    }
}
