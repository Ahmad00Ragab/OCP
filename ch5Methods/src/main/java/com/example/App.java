package com.example;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;
import com.example2.Parent;




class Snake{
    static int staticSnakeField = 10;   
}


class Snake2{

    static int staticSnakeField    = 10;   
    public int nonStaticSnakeField = 20;
    
    public void nonStaticMethod(){
        System.out.println(nonStaticSnakeField);
        System.out.println(staticSnakeField);
    }

    public static void staticMethod(){
        // System.out.println(nonStaticSnakeField); // Error 
        System.out.println(staticSnakeField);
    }

}



class Class1{
    
    static int x;
    public Class1(){
        x = 10;
    }
}


public class App extends Parent{
    
    static String throwsException() throws IOException{
        throw new IOException("throw IOException");
    }

    
    public void accessParent(){
        System.out.println(protectedFeild);
        protectedMethod();
    }


    public static void modifyArr(int[] arr){
        arr[0] = 15;
    }

    public static void modifyPrimtive(int x){
        x = 19;
    }


    public static void modifyString(String x){
        x = "othman";
    }


    public static  void modifyStringBuilder(StringBuilder x){
        x.append("Haroun");
    }


    public static int addTickets(int tickets) {
        tickets++;
        return tickets;
    }


    public static String addGuests(String guests) {
        guests += "d";
        return guests;
    }


    public void fly(String str){
        System.out.println("String");
    }

    public void fly(Object obj){
        System.out.println("Object");
    }



    public static void main( String[] args )
    {

        System.out.println("======================================================");
        System.out.println("======================================================");
        System.out.println("======================================================");
        
        /* Testing the Exceptions */
        try{
            throwsException(); // accessing the method directly because is static 
        }catch(Exception e){
            System.out.println("Exception Caught: " + e.getMessage());
        }

        /* Testing the Protected Keyword */
        // new Parent().protectedMethod(); // Error

        // reaching the protected fields of the parent (which is another package) through the instance of the child instance ==> valid
        System.out.println((new App()).protectedFeild);
        (new App()).protectedMethod();
        
        // same results 
        new App().accessParent();

        System.out.println("--------------------------");
        
        /* Static Variables and methods */
        System.out.println("--------------------------");
        
        System.out.println(Snake.staticSnakeField);

        Snake obj = new Snake();
        System.out.println(obj.staticSnakeField);

        obj = null;
        
        System.out.println(obj.staticSnakeField);
        System.out.println(obj);


        var obj2 = new Snake2();

        obj2.nonStaticMethod();
        Snake2.staticMethod();
    
        System.out.println("----------------");
        System.out.println(new Class1().x);



        System.out.println("----------------");
        int x = 16;
        System.out.println("Before Modification : " + x); // 16
        modifyPrimtive(x);
        System.out.println("After Modification : " + x); // 16



        int arr[] = {16};
        System.out.println("Before Modification : " + Arrays.toString(arr)); // 16
        modifyArr(arr);
        System.out.println("After Modification : " + Arrays.toString(arr)); // 15


        String str = "ali";
        System.out.println("Before Modification : " + str); // ali
        modifyString(str);
        System.out.println("After Modification : " + str); // ali



        StringBuilder str2 = new StringBuilder("hossam");
        System.out.println("Before Modification : " + str2); // hossam
        modifyStringBuilder(str2);
        System.out.println("After Modification : " + str2); // hossamHaroun



        int tickets = 2;         // tickets = 2
        String guests = "abc";  // guests = abc
        System.out.println(addTickets(tickets));   // output : 3 but tickets still 2 here 
        guests = addGuests(guests); // guests = abcd
        System.out.println(tickets + guests); // 2abcd



        /* AutoBoxing and Unoboxing */
        Integer variable1 = 5; // autoboxing 
        int variable12 = variable1; // unboxing 



        System.out.println("----------------");
        var p = new App();
        p.fly("test");
        System.out.println("_");
        p.fly(56); 

        /* Arrays.asList() */
        List<Integer> list = Arrays.asList(5);
        System.out.println(list);
        

        System.out.println(LocalDateTime.now());


        System.out.println("======================================================");
        System.out.println("======================================================");
        System.out.println("======================================================");
    }
}
