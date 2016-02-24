
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aziz OKAY
 */
class Administrator extends User{
    
    private ArrayList<Course> courseList; 
    /**
     * 
     * @param theName name of user that we define
     * @param theId id of user that we user
     * @param theMail mail of user that we user
     * @param thePassword password of user that we user
     */
    public Administrator(String theName, String theId, String theMail, String thePass){
        super(theName, theId, theMail, thePass);
    }
    
    /**
     * Getter function for get list of course
     * @return course list
     */
    public ArrayList getCourseList(){
        return courseList;
    }
    
    @Override
    /**
     * Function that print information about user on screen
     */
    public void UserProfil(){
        System.out.println(" ***** ADMINISTRATION PROFIL ***** ");
        System.out.println("ID : " + this.getId());
        System.out.println("NAME : " + this.getName());
        System.out.println("Mail Address : " + this.getMail());
    }
    
    
    /**
     * Function that add user by administration
     * @param theUserthe user that will add the system
     * @return 
     */
    public boolean addUser(User theUser){
       boolean result = false;
        try{
            for(int i = 0; i < getUserList().size(); i++){
                if(theUser.getId() == getUserList().get(i)){
                    result = true;
                } 
                if(result != true)
                    throw new UserException();
                else
                    getUserList().remove(i);
            }
        }
        catch(UserException e){
            System.out.println(theUser.getName() + e.alreadyExist());
        }
        return result;
    }
    
    /**
     * 
     * @param theUser that will remove if exist
     * @return true if user exist false otherwise
     */
    public boolean removeUser(User theUser){
        boolean result = false;
        try{
            for(int i = 0; i < getUserList().size(); i++){
                if(theUser.getId() == getUserList().get(i)){
                    getUserList().remove(i);
                    result = true;
                } 
                if(result != true)
                    throw new UserException();
            }
        }
        catch(UserException e){
            System.out.println(e.noSuchUser());
        }
        return result;
    }
    
    /**
     * 
     * @param theCourse the course will be add the system
     * @return true if added false otherwise
     */
    public boolean addCourse(Course theCourse){
        boolean result = false;
        try{
            for(int i = 0; i < getCourseList().size(); i++){
                if(theCourse.getCourseId() == getCourseList().get(i)){
                    result = true;
                } 
            }
            if(result != true)
                throw new UserException();
            else
                this.getCourseList().add(theCourse);
        }
        catch(UserException e){
            System.out.println("The course" + e.alreadyExist());
        }
        
        return result;
    }
    
    /**
     * 
     * @param theCourse the course will be removed the system
     * @return true if added false otherwise
     */
    public boolean removeCourse(Course theCourse){
        boolean result = false;
        try{
            for(int i = 0; i < getCourseList().size(); i++){
                if(theCourse.getCourseId() == getCourseList().get(i)){
                    result = true;
                } 
            }
            if(result != true)
                throw new UserException();
            else
                this.getCourseList().remove(theCourse);
        }
        catch(UserException e){
            System.out.println(e.noSuchCourse());
        }
        
        return result;
    }
}
