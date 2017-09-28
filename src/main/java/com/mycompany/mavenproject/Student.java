package com.mycompany.mavenproject;

import org.joda.time.DateTime;
import org.joda.time.Years;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author daram
 */
public class Student {

    private  String name;
    private  Years age;
    private DateTime dob = new DateTime();
    private  int id;
    private  String username;
    private StringBuilder usr = new StringBuilder();

    //Constructor
    Student(String Nm, String DateBirth, int identity){
        name = Nm;
        //Setting string to date
        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyyy");
        dob = formatter.parseDateTime(DateBirth);
        //Setting age based on DOB
        DateTime now = new DateTime(DateTime.now());
        age = Years.yearsBetween(dob, now);
        id = identity;
        usr.append(Nm);
        usr.append(getAge());
        username = usr.toString();
    }

    //Getters and Setters
    int getAge(){ return age.getYears(); }

    public String getName (){ return name; }

    public void setName(String InsertName){
        name = InsertName;
    }

    public String getDOB (){
        return dob.toString();
    }

    //Setting DOB and age from a string
    public void setDOB (String InsertDOB){
        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyyy");
        dob = formatter.parseDateTime(InsertDOB);
        DateTime now = new DateTime(DateTime.now());
        age = Years.yearsBetween(dob, now);
    }

    public int getID (){
        return id;
    }

    public void setID (int InsertID){ id = InsertID;    }

    //Concatonating name and age for username
    public String getUsername(){
        StringBuilder tmp = new StringBuilder(getName());
        tmp.append(getAge());
        return username = tmp.toString();
    }
}
