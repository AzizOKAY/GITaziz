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
        System.out.println(" ***** TEACHER PROFIL ***** ");
        System.out.println("ID : " + this.getId());
        System.out.println("NAME : " + this.getName());
        System.out.println("Mail Address : " + this.getMail());
    }
    
    /**
     * Function that add a Student to course.
     * @param theStudent that will add to course.
     * @param theCourse that student will add.
     * @return true if there is no problem with it.
     */
    public boolean addStudent(Student theStudent, Course theCourse){
        boolean result = false;
        try{
            if(this.getId() == theCourse.getTeacherOfCourse().getId()){
                try{
                    for(int i = 0; i < theCourse.getStudentList().size(); i++){
                        if(theStudent.getId() == getUserList().get(i)){
                            result = true;
                        } 
                    }
                    if(result != true)
                        throw new UserException();
                    else
                        theCourse.getStudentList().add(theStudent);
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
    
    /**
     * Function that add a Tutor to course.
     * @param theTutor that will add to course.
     * @param theCourse that student will add.
     * @return true if there is no problem with it.
     */
    public boolean addTutor(Tutor theTutor, Course theCourse){
        boolean result = false;
        try{
            if(this.getId() == theCourse.getTeacherOfCourse().getId()){
                try{
                    for(int i = 0; i < theCourse.getTutorList().size(); i++){
                        if(theTutor.getId() == theCourse.getTutorList().get(i)){
                            result = true;
                        } 
                    }
                    if(result != true)
                        throw new UserException();
                    else
                       theCourse.getTutorList().add(theTutor); 
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
    
    /**
     * Function that remove a student from given course
     * @param theUser that will remove if exist
     * @return true if user exist false otherwise
     */
    public boolean removeStudent(Student theStudent, Course theCourse){
        boolean result = false;
        try{
            if(theCourse.getTeacherOfCourse().getId() == this.getId()){
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
    
    /**
     * Function that remove a tutor from given course
     * @param theTutor that will remove if exist
     * @return true if user exist false otherwise
     */
    public boolean removeTutor(Tutor theTutor, Course theCourse){
        boolean result = false;
        try{
            if(theCourse.getTeacherOfCourse().getId() == this.getId()){
                try{
                    for(int i = 0; i < theCourse.getStudentList().size(); i++){
                        if(theTutor.getId() == theCourse.getStudentList().get(i)){
                            theCourse.getStudentList().remove(i);
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
