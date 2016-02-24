/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aziz OKAY
 */
public class UserException extends Exception{
    
    /**
     * Function that return massage if there is no such a user
     * @return error massage as a string
     */
    public String noSuchUser(){
        return "There is not such a user.";
    }
    
    /**
     * 
     * @return error massage if wrong teacher
     */
    public String wrongTeacher(){
        return "Wrong Teacher Error : Teacher do not have this course.";
    }
    
    public String allreadyExist(){
        return "This User is allready exist in this course.";
    }
    
    
}
