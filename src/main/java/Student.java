
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jan
 */
public class Student extends User{
    
    /**
     * 
     * @param theName name of user that we define
     * @param theId id of user that we user
     * @param theMail mail of user that we user
     * @param thePass password of user for login system
     */
    public Student(String theName, String theId, String theMail, String thePass){
        super(theName, theId, theMail, thePass);
    }
    
    
    /**
     * Function that print information about user on screen
     */
    @Override
    public void UserProfil(){
        System.out.println(" ***** STUDENT PROFIL ***** ");
        System.out.println("ID : " + this.getId());
        System.out.println("NAME : " + this.getName());
        System.out.println("Mail Address : " + this.getMail());
        
    }
    
    public boolean uploadAssignment(Assignment uploadAssgnmnt){
        boolean result = false;
        Date date = new Date();
        try{
            if(date.before(uploadAssgnmnt.getDeadline()) && date.before(uploadAssgnmnt.getLateDaedLine())){
                
                System.out.println("Operation is successfuly complated.");
            }
            else
                throw new UserException();
        }
        catch(UserException e){
            System.out.println("Assignment is overdue!!!");
            result = false;
        }
        
        return result;
    }
}
