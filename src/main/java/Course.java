
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jan
 */
public class Course {
    
    private String name;
    private String courseID;
    private Teacher courseTeacher;
    private ArrayList<Tutor> courseTutorList;
    private ArrayList<Student> studentList;
    
    /**
     * 
     * @param nameOfCourse The name of course
     * @param theCourseID Course id
     * @param theCourseTeacher Course teacher
     */
    public Course(String nameOfCourse, String theCourseID, Teacher theCourseTeacher){
        name = nameOfCourse;
        courseID = theCourseID;
        courseTeacher = theCourseTeacher;
    }
    
    
    /**
     * Setter function to set name of course
     * @param newName new name to set name of course
     */
    public void setNameOfCourse(String newName){
        name = newName;
    }
    
    /**
     * Setter function to set course id of course
     * @param newCourseID new id of course
     */
    public void setCourseID(String newCourseID){
        courseID = newCourseID;
    }
    
    /**
     * Getter function for get name
     * @return Name of course
     */
    public String getNameOfCourse(){
        return name;
    }
    
    /**
     * Getter function for get ID of course
     * @return ID of course
     */
    public String getCourseId(){
        return courseID;
    }
    
    /**
     * Getter function for get list of student that pupil of course
     * @return student list of course
     */
    public ArrayList getStudentList(){
        return studentList;
    }
    
    /**
     * Getter function for get list of tutor that tutor of course
     * @return get tutor list of course
     */
    public ArrayList getTutorList(){
        return courseTutorList;
    }
    
    
    /**
     * Getter function for get teacher of this course
     * @return teacher of this course
     */
    public Teacher getTeacherOfCourse(){
        return courseTeacher;
    }
    
    /**
     * Function that print information about course
     */
    public void aboutCourse(){
        System.out.println("COURSE NAME : " + getNameOfCourse());
        System.out.println("COURSE ID : " + getCourseId());
        System.out.println("TEACHER : " + courseTeacher.getName());
        
        System.out.println("*** Tutor of Course *** ");
        for(int i = 0; i < courseTutorList.size(); i++)
            System.out.println(i+1 + ". " + courseTutorList.get(i).getName());
        
        System.out.println("*** Student of Course *** ");
        for(int i = 0; i < studentList.size(); i++)
            System.out.println(i+1 + ". " + studentList.get(i).getName());
    }

    
}
