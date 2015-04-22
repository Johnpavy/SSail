

/**
 *
 * @author John
 */
public class User {
    String fName;
    String lName;
    char[] password;
    String login;

    
    
    
    User(String f, String ln, char p[], String l){
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
    
    void setPassword(char[] p){
        this.password = p;
    }
    
    char[] getPassword(){
        return this.password;
    }
    
    boolean infoCheck(char[] p, String l){
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
