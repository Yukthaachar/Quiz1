
package yy6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz1 {
    public static void takequiz(String fname,String str1) throws FileNotFoundException {
     File f1=new File(fname);
     ArrayList<String>topics=new ArrayList<>();
     ArrayList<String>questions=new ArrayList<>();
     ArrayList<String>answers=new ArrayList<>();
     int total=0,marks=10;
     String[]arr1=new String[2];
     int[]arr2=new int[10];
     Scanner sc1=new Scanner(f1);
     Scanner sc2=new Scanner(System.in);
     String info1,s1,s2,response1;
     s1=str1;
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
    public static void main(String[] args) throws FileNotFoundException {
        String s1="";
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the category \n Capital\n Currency\n Sport");
        String subject=sc1.next();
        if(subject.equals("Capital")){
            s1="What is the capital of ";
            takequiz("Quiz_Capitals.csv",s1);
        }
        else if(subject.equals("Currency")){
            s1="What is the currency of ";
            takequiz("Quiz_Currency.csv",s1);
        }
        else if(subject.equals("Sport")){
            s1="With whom is this sports associated with ";
            takequiz("Quiz_Sport.csv",s1);
        }
    }
    
}
