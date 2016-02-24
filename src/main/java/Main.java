
import java.io.FileNotFoundException;
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
    
    public static void main(){
        java.io.File file = new java.io.File("data.txt");
    
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
    }
    
    Teacher teacher1 = new Teacher("Erdogan", "101044012", "erdogan@mail.com", "erdo123");
    
    
    
    
}
