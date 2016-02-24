
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aziz OKAY
 */
public class Main {
    
    public static void main(String[] args){
        java.io.File file = new java.io.File("data.txt");
        Date dline = new Date(2016, 3, 3, 6, 2);
        Date lateDline = new Date(2016, 3, 7, 3, 1);
    
        try{
            Scanner input = new Scanner(file);
            while(input.hasNext()){
                String num = input.nextLine();
                System.out.println(num);
            }
        }
        catch(FileNotFoundException e){
            System.err.format("File does not exist.\n");
        }
        
        Administrator admin = new Administrator("admin", "001", "admin@mail.com", "000");
        Teacher teacher1 = new Teacher("Erdogan", "101044012", "erdogan@mail.com", "erdo123");
        Student stdd = new Student("Aziz", "101044064", "okayaziz@amail.com", "ezizjan");
        Student aziz = new Student("jano", "10104064", "janeziz@amail.com", "ejan63");
        Tutor tutory = new Tutor("zeydan", "101010101", "zydanoo@amail.com", "zydn34");
        Course dataStructor = new Course("Data Structors", "222", teacher1);
        Assignment ass;
        
        /*administor add a user to system*/
        admin.addUser(teacher1);
        
        /*administor create a course to system*/
        admin.createCourse(dataStructor);
        
        /*administor add a student to system*/
        admin.addUser(aziz);
        
        /*teacher erdogan add a stdent to his course*/
        teacher1.addStudent(aziz, dataStructor);
        
        
        /*teacher erdogan create a assignment */
        ass = teacher1.createAssignment(dataStructor, dline, lateDline, "pdf");
        
        /*Student stdd upload an assignment */
        stdd.uploadAssignment(ass);
        
        /*admin print console his/her profil*/
        admin.UserProfil();
        
        /*teacher1 print console his/her profil*/
        teacher1.UserProfil();
        
        /*teacher1 print console his/her profil*/
        tutory.UserProfil();
        
        /*stdd print console his/her profil*/
        stdd.UserProfil();
        
        /*aziz print console his/her profil*/
        aziz.UserProfil();
        
        /*Teacher erdogan remove student stdd from course*/
        teacher1.removeStudent(stdd, dataStructor);
        
        /*admin remove student stdd from system*/
        admin.removeUser(stdd);
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
}
