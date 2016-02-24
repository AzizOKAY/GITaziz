
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
public interface AssignmentInterface {
    
    public String getFormat();
    public Date getDeadline();
    public void aboutAssigment();
    public Date getLateDaedLine();
    public Course getCourseOfAssignment();
    public Teacher getTeacherOfAssignment();
    
}
