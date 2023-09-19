package com.example.demo2.service;

import jdk.jfr.DataAmount;
import lombok.Data;

import java.util.Optional;

@Data
public class Student {

    String name;
    int id ;

    String villageName;
    int className;
    long mobileNumber;

    static String schoolName;



    public void getSchoolName(){
        mobileNumber  = 122;
        String random;

    }

    public static void getParentName(){

    }


    public static void main(String[] args) {
     Student student = new Student();

     student.setId(3);
     student.setName("riyanshi");
     student.setVillageName("satram");
     student.setClassName(5);
     student.setMobileNumber(2345678);

     System.out.println(student.getId());
student.setName( "anusha");

student.setVillageName("satram")

;student.setClassName(6);
student.setMobileNumber(56743);



//Pass a non-null value to Optional and validate the result


        String name = "grid";

        Optional<String> name1 = Optional.of(name);

        if (name1.isPresent()) {
            System.out.println(name1.get());
        }
        String name2 = "";

        Optional<String>  output = Optional.ofNullable(name);

        if (output.isPresent()) {
            System.out.println(name1.get());
        }
      //  Pass a null value to Optional and validate the result
    }


}
