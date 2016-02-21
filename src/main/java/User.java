/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jan
 */
abstract class User {
    
    private String name;
    private String id;
    private String mail;
    private String password;
    /**
     * Getter function that return name of user
     * @return name of user
     */
    public String getName(){
        return name;
    }
    
    /**
     * Getter function that return id of user
     * @return id of user
     */
    public String getId(){
        return id;
    }
    
    /**
     * Getter function that return mail address of user
     * @return id mail address of user
     */
    public String getMail(){
        return mail;
    }
    
    /**
     * Getter function that return password of user
     * @return password of user
     */
    public String getPassword(){
        return password;
    } 
    
    /**
     * 
     * @param theMail the mail address of user that will login the system
     * @param thePassword the Password of user that will login the system
     * @return true if mail and password same with database false otherwise
     */
    public boolean login(String theMail, String thePassword){
        System.out.println("No Data Base yet. You are in");
        return true;
    }
    
    /**
     * Abstract function that print information about user on screen
     */
    public abstract void printUserInformation();
    
    
}
