package com.premiumfaber.schoolapp.model;

import java.lang.reflect.Array;

public class Person {
    String name;
    public Person (String newName){
    name = newName;
    }

    public String getName(){
        return name;
    }
    public Float getAttendance() {
        //TO DO: code to calculate attendance of a person}
        return null;
    }
    public Array getStudentList(){
        //TO DO: code to return list of all students}
        return null;
    }
    public void deactivateSelf(){
        // TO DO: method to deactivate/soft-delete self
    }
}
