package com.mycompany.mavenproject;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daram
 */
public class Module {

    private  String moduleName;
    private  String moduleID;
    private List<Student> studentList= new ArrayList<Student>();

    Module(String ModuleNm, String ModID, List<Student> list) {
        moduleName = ModuleNm;
        moduleID = ModID;
        studentList = list;
    }

    //Getters and setters to access the variables
    public String getModuleName(){
        return moduleName;
    }

    public void setModuleName(String NewName){
        moduleName = NewName;
    }

    public String getModuleID(){
        return moduleID;
    }

    public void setModuleID(String NewID){
        moduleID = NewID;
    }

    public List<Student> getStudentList(){
        return studentList;
    }

    public void addStudent(Student a){
        studentList.add(a);
    }
}
