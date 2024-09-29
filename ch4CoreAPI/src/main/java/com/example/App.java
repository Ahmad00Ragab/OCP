package com.example;

import java.text.ListFormat.Style;

import javax.sound.midi.SysexMessage;

public class App 
{
    public static void main( String[] args )
    {

        System.out.println("======================================================");
        System.out.println("======================================================");
        System.out.println("======================================================");

        String str1 = "Hello";
        System.out.println("str1 : " + str1.hashCode());
        str1 +=  new String(", World!");   // str1 = str1 + new String("");
        System.out.println(str1); 
        System.out.println("str1 : " + str1.hashCode());

        // Take care of the difference 
        System.out.println(1 + 2 + "c");   // 3c
        System.out.println("c" + 1 + 2 );  //c12 
        System.out.println("c" + null);    //cnull 

        String str = "ahmad"; 
        System.out.println(str.length()); // 5
        System.out.println(str.charAt(2)); // 'm'
        System.out.println(str.indexOf('m')); // 'm' , if not existed returns -1
        
        // System.out.println(str.charAt(5)); // Exception

        String str2 = "hello, world";
        // System.out.println(str2.charAt(12)); // Exception: outOfBounds
        String str2Sub = str2.substring(4,12);
        System.out.println(str2Sub);
        // System.out.println(str2.substring(4, 13)); // Exception
        // System.out.println(str2.substring(4, 3)); // Exception
        System.out.println(str2.substring(4, 4)); // Exception



        String str3 = "newLook";
        System.out.println(str3.toLowerCase());        
        System.out.println(str3.toUpperCase());
        System.out.println(str3);

        String str4 = "ahmad";
        String str5 = "";
        System.out.println("ahmed".equals(str4));
        System.out.println("ahmad".equals(str5));


        System.out.println("--------------");
        String str6 = "ahmad";                      // saved in the string pool 
        String str7 = new String("ahmad"); // saved in the heap

        System.out.println(str6 == str7);      //false :  compares the values of the ref str6&str7
        System.out.println(str6.equals(str7)); //true: compares the char seq of str6&str7

        System.out.println("--------------");
        String str8 = "ali";
        System.out.println(str8.startsWith("a"));
        System.out.println(str8.endsWith("i"));
        System.out.println(str8.contains("li"));


        System.out.println("--------------");

        String str9 = "hello, ahmad";
        System.out.println(str9.replace(',', ':'));
        System.out.println(str9.replace(';', ':'));
        System.out.println(str9.replace("ahmad","mohamed"));
        System.out.println(str9);

        String str10 = "\nne w ";
        System.out.println(str10.trim().length());
        
        
        String str11 = "\"Hello, Ahmad!\""; // "Hello, Ahmad!"
        System.out.println(str11);

        System.out.println("--------------");
        String str12 = " ";
        System.out.println(str12.isEmpty()); // false
        System.out.println(str12.isBlank()); // true

        /* ==================== StringBuilder Class  ==================== */
        
        // Created 27 String objects (immutable)
        String str13="";
        System.out.println(str13.hashCode());
        for(char c = 'a'; c<='z'; c++)
            str13 +=c;
        System.out.println(str13);
        System.out.println(str13.hashCode());


        //  Created 1 StringBuilder object (mutable)
        StringBuilder str14 =new StringBuilder(15);
        System.out.println(str14.hashCode());
        for(char c = 'a'; c<='z'; c++)
            str14.append(c);
        System.out.println(str14);
        System.out.println(str14.hashCode());

        System.out.println("--------------");

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("d").append('e');
        b = b.append("e").append("f");
        System.out.println(a);
        System.out.println(b);

        StringBuilder str15 = new StringBuilder("ahmad");
        str15.insert(0,"name is : "); // name is : ahmad
        str15.insert(15,", ragab");   // name is : ahmad, ragab
        System.out.println(str15);    

        StringBuilder str16 = new StringBuilder("ahmad haroun");
        str16.delete(6, 7);
        System.out.println(str16);              // ahmad aroun
        str16.replace(5, 15, "");
        System.out.println(str16);
        System.out.println(str16.length());
        
        StringBuilder str17 = new StringBuilder("ABC");
        System.out.println(str17.reverse());

        var x = "ahmad";
        var y = "ahmad ".trim();
        System.out.println(x.equals(y));

        StringBuilder str18 = new StringBuilder("ali");
        StringBuilder str19 = str18;
        str19.append(",mohamed");
        System.out.println(str18); // ali, mohamed
        System.out.println(str19); // ali, mohamed 
        System.out.println(str18 == str19); // true 

        /* ========= String pool ========== */
        
        
        System.out.println("======================================================");
        System.out.println("======================================================");
        System.out.println("======================================================");
    }
}
