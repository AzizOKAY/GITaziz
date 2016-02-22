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
     * Constructor for user
     * @param theName name of user that we define
     * @param theId id of user that we user
     */
    public User(String theName, String theId){
        name = theName;
        id = theId;
    }
    
    /**
     * 
     * @param theName name of user that we define
     * @param theId id of user that we user
     * @param theMail mail of user that we user
     * @param thePassword password of user that we user
     */
    public User(String theName, String theId, String theMail, String thePassword){
        name = theName;
        id = theId;
        mail = theMail;
        password = thePassword;
    }
    
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
     * Setter function to set name of User
     * @param newName string to set name of user
     */
    public void setName(String newName){
        name = newName;
    }
    
    /**
     * Setter function to set id of User
     * @param newId new id of User
     */
    public void setID(String newId){
        id = newId;
    }
    
    /**
     * Setter function to set mail address of User
     * @param newMail new mail address
     */
    public void setMail(String newMail){
        mail = newMail;
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
    public abstract void UserProfil();
    
    
}
