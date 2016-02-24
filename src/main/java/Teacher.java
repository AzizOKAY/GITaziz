/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jan
 */
class Teacher extends User{
    
    /**
     * 
     * @param theName name of user that we define
     * @param theId id of user that we user
     * @param theMail mail of user that we user
     * @param thePassword password of user that we user
     */
    public Teacher(String theName, String theId, String theMail, String thePass){
        super(theName, theId, theMail, thePass);
    }
    
    
    @Override
    /**
     * Function that print information about user on screen
     */
    public void UserProfil(){
        System.out.println("Mereba ");
    }
    
    /**
     * 
     * @param theUser that add as a user
     */
    public void add(Student theStudent, Course theCourse){
        boolean result = false;
        try{
            if(theCourse.getTeacherOfCourse() == this.getId()){
                try{
                    for(int i = 0; i < theCourse.getStudentList().size(); i++){
                        if(theStudent.getId() == getUserList().get(i)){
                            getUserList().remove(i);
                            result = true;
                        } 
                    }
                    if(result != true)
                            throw new UserException();
                }
                catch(UserException e){
                    System.out.println(e.noSuchUser());
                }
                getUserList().add(theStudent);
            } 
            else
                throw new UserException();
        }
        catch(UserException e){
            System.out.println(e.wrongTeacher());
        }
    }
    
    /**
     * 
     * @param theUser that will remove if exist
     * @return true if user exist false otherwise
     */
    public boolean remove(Student theStudent, Course theCourse){
        boolean result = false;
        try{
            if(theCourse.getTeacherOfCourse() == this.getId()){
                try{
                    for(int i = 0; i < theCourse.getStudentList().size(); i++){
                        if(theStudent.getId() == theCourse.getStudentList().get(i)){
                            getUserList().remove(i);
                            result = true;
                        } 
                    }
                    if(result != true)
                            throw new UserException();
                }
                catch(UserException e){
                    System.out.println(e.noSuchUser());
                }
            }
            else
                throw new UserException();
        }
        catch(UserException e){
            System.out.println(e.wrongTeacher());
        }
        
        return result;
    }
}
