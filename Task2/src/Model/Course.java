package Model;

import java.util.ArrayList;

public class Course {

    private String code;
    private String name;
    private Teacher teacher = new Teacher();
    private ArrayList<Student> studentsOfCourse = new ArrayList();
    
    public Course() {
    }

    Course(String code, String name) {
        this.code = code;
        this.name = name;
    }

    Course(String code, String name, Teacher teacher) {
        this.code = code;
        this.name = name;
        this.teacher = teacher;
        this.teacher.setTeacherCourse(this);
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public void setName(String name) {
        this.name= name;
    }
    
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        //System.out.println("Name of course is : " );
        return name;
    }

    public String getCode() {
        // System.out.println("Code of course is : " );
        return code;
    }

    public void getTeacherOfCourse() {
        System.out.println("Name of Teacher is : " + teacher.getTeacherName());
    }
  
    public void addStudentToCourse(Student student) {
        studentsOfCourse.add(student);
    }

    public ArrayList<Student> getStudentsOfCourse() {
        return studentsOfCourse;
    }

    @Override
    public String toString() {
        System.out.print(" Course{  students Of Course : ");
        for (Student i : studentsOfCourse) {
            System.out.println(i.getId() + "   " + i.getName());
        }
        return  "code=" + code + ", name=" + name +
                ", teacher=" + teacher  + '}';
    }
    
    


}
