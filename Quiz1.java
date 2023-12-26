
package yy6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class quiz1 {

    public static void main(String[] args) throws FileNotFoundException {
     File f1=new File("Quiz_Capitals.csv");
     Scanner sc1=new Scanner(f1);
     Scanner sc2=new Scanner(System.in);
     int total=0,marks=10;
     String[]arr1=new String[2];
     String info1,s1,s2,response1;
     s1="what is the capital of ";
     s2="?";
     info1=sc1.nextLine();
     for(int i=0;i<3;i++){
         info1=sc1.nextLine();
         arr1=info1.split(",");
         System.out.println(s1+arr1[0]+s2);
         response1=sc2.nextLine();
         if(response1.equals(arr1[1])){
             total+=marks;
         }
         
     }
     
     System.out.println(total);
     
    }
    
}
