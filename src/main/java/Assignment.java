
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
public class Assignment implements AssignmentInterface{
    
    private Date deadLine;
    private Date lateDeadLine;
    private String format;
    private Course courseOfAssignment;
    private Teacher teacherOfAssignment;
    
    public Assignment(Teacher theTeacher, Course theCourse, Date theDeadLine,
            Date theLateDeadLine, String theformat){
        teacherOfAssignment = theTeacher;
        courseOfAssignment = theCourse;
        deadLine = theDeadLine;
        lateDeadLine = theLateDeadLine;
        format = theformat;
        
    }
    
    /**
     * Getter Function that get teacher of Assignment
     * @return teacher of course
     */
    @Override
    public Teacher getTeacherOfAssignment(){
        return teacherOfAssignment;
    }
    
    /**
     * Getter Function that get course of Assignment
     * @return 
     */
    @Override
    public Course getCourseOfAssignment(){
        return courseOfAssignment;
    }
    
    /**
     * Getter Function that get deadLine of Assignment
     * @return 
     */
    @Override
    public Date getDeadline(){
        return deadLine;
    }
    
    /**
     * Getter Function that get LateDaedLine of Assignment
     * @return 
     */
    @Override
    public Date getLateDaedLine(){
        return lateDeadLine;
    }
    
    /**
     * Getter Function that get Format of Assignment
     * @return 
     */
    @Override
    public String getFormat(){
        return format;
    }
    
    /**
     * Function that give information about Assignment
     */
    @Override
    public void aboutAssigment(){
        System.out.println("***** Assigment Information *****");
        System.out.println("Course name : " + getCourseOfAssignment().getNameOfCourse());
        System.out.println("Course Teacher : " + getTeacherOfAssignment().getName());
        System.out.println("Deadline : " + getDeadline());
        System.out.println("Late Deadline : " + getLateDaedLine());
        System.out.println("Format : " + getFormat());
    }
}
