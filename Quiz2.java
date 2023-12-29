
package yy6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class  Question{
    private String ques;
    private String ans;
    Question(String ques,String ans){
        this.ques=ques;
        this.ans=ans;
    }
    public String[] getQues(){
        String[] arr1=new String[2];
        arr1[0]=ques;
        arr1[1]=ans;
        return arr1;
}
}
public class Quiz2 {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String>fnames=new ArrayList<>();
        ArrayList<String>quesnames=new ArrayList<>();
        String[] arr2;
        String topic ="topic.txt";
        File f1=new File(topic);
        Scanner sc1=new Scanner(f1);
        Scanner sc2=new Scanner(System.in);
        while(sc1.hasNextLine()){
            String s1=sc1.nextLine();
            arr2=s1.split(",");
            fnames.add(arr2[0]);
            quesnames.add(arr2[1]);
        }
        for(int i=0;i<fnames.size();i++){
            System.out.println((i+1)+" "+fnames.get(i));
        }
        System.out.println("Select Quiz type: ");
        int choice=sc2.nextInt();
        String filename="";
        filename=fnames.get(choice-1)+".csv";
        System.out.println(filename); 
        File f2= new File(filename);
        Scanner sc3=new Scanner(f2);
        ArrayList<Question> mylist1=new ArrayList<>();
        sc3.nextLine();
        while(sc3.hasNextLine()){
            String s1=sc3.nextLine();
            arr2=s1.split(",");
            mylist1.add(new Question(arr2[0],arr2[1]));
        }
        Collections.shuffle(mylist1);
        int size=0,marks=10,total=0;
        if(mylist1.size()>=10){
            size=3;
        }
        else{
            size=mylist1.size();
        }
        Scanner sc4=new Scanner(System.in);
        ArrayList<Question>wrques=new ArrayList<>();
        for(int i=0;i<size;i++){
            System.out.println(quesnames.get(choice-1)+" "+mylist1.get(i).getQues()[0]);
            String input=sc4.nextLine();
            if(mylist1.get(i).getQues()[1].equalsIgnoreCase(input)){
                total=total+marks;
            }
            else{
                total=total+0;
                String str1=mylist1.get(i).getQues()[0];
                String str2=mylist1.get(i).getQues()[1];
                wrques.add(new Question(str1,str2));
            }
        }
        System.out.println("You scored "+total+"/"+size*10+" marks");
        System.out.println("\n Wrong Questions and Answers : \n");
        for(int i=0;i<wrques.size();i++){
            System.out.println(wrques.get(i).getQues()[0]+" : "+wrques.get(i).getQues()[1]);
        }
    }
    
}
