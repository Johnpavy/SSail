/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author John
 */
public class User {
    String fName;
    String lName;
    String password;
    String login;
    
    void User(String f, String ln, String p, String l){
        this.fName = f;
        this.lName = ln;
        this.password = p;
        
    }
    
    void setFName(String f) {
        this.fName = f;
    }
    
    String getFName(){
        return this.fName;
    }
    
    void setLName(String ln){
        this.lName = ln;
    }
    
    String getLname(){
        return this.lName;
    }
    
    void setPassword(String p){
        this.password = p;
    }
    
    String getPassword(){
        return this.password;
    }
    
    boolean infoCheck(String p, String l){
        if(p.equals(password) && l.equals(login)){
            return true;
        }
        else{
            return false;
        }
    }
    void setLogin(String l){
        this.login = l;
    }
    
    String getLogin(){
        return this.login;
    }
    
    
}
