package com.mycompany.mavenproject;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


/**
 *
 * @author daram
 */

public class CourseProgramme {

    private String courseName;
    private DateTime startDate = new DateTime();
    private DateTime endDate = new DateTime();
    private List<Module> moduleList = new ArrayList<Module>();

    CourseProgramme(String CourseNm, List<Module> list, String Stdt, String enddt){
        courseName = CourseNm;
        moduleList = list;

        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyyy");
        startDate = formatter.parseDateTime(Stdt);
        endDate = formatter.parseDateTime(enddt);
    }

    //Getters and setters
    public String getCourseName(){
        return courseName;
    }

    public void setCourseName(String NewName){
        courseName = NewName;
    }

    public List<Module> getModuleList(){
        return moduleList;
    }

    public void addModuleList(Module a){
        moduleList.add(a);
    }

    //Outputting the dates to an easy to read format
    public String getStartDate(){
        return Integer.toString(startDate.getDayOfMonth()) + "/" + Integer.toString(startDate.getMonthOfYear()) + "/" +  Integer.toString(startDate.getYear());
    }

    public void setStartDate(DateTime NstartDate){
        startDate = NstartDate;
    }

    public String getEndDate(){
        return Integer.toString(endDate.getDayOfMonth()) + "/" + Integer.toString(endDate.getMonthOfYear()) + "/" +  Integer.toString(endDate.getYear());
    }

    public void setEndDate(DateTime NEndDate){
        endDate = NEndDate;
    }

}
