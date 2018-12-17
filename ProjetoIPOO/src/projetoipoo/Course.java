/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoipoo;

/**
 *
 * @author bruno
 */
public class Course {
    private String name;
    private CourseType type;
    private String code;
    private int creditsRequired;

    public Course(String name, CourseType type, String code, int creditsRequired) {
        if(name != null) this.name = name;
        if(type!= null) this.type = type;
        if(code != null) this.code = code;
        if(creditsRequired>0) this.creditsRequired = creditsRequired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CourseType getType() {
        return type;
    }

    public void setType(CourseType type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCreditsRequired() {
        return creditsRequired;
    }

    public void setCreditsRequired(int creditsRequired) {
        this.creditsRequired = creditsRequired;
    }

    @Override
    public String toString() {
        return type + "\n" + "Course{" + name + ", Code: " + code + ", Credits required: " + creditsRequired ;
    }
    
}
