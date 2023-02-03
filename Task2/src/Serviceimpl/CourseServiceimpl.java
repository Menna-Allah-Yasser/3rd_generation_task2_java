package Serviceimpl;


import Service.CourseInterface;
import java.util.ArrayList;

 public class CourseServiceimpl implements CourseInterface {

    private String code;
    private String name;
    private TeacherServiceimpl teacher = new TeacherServiceimpl() ;
    private ArrayList<StudentServiceimpl> studentsOfCourse = new ArrayList(){};

    public CourseServiceimpl() {
    }

    CourseServiceimpl(String code, String name) {
        this.code = code;
        this.name = name;
    }

    CourseServiceimpl(String code, String name, TeacherServiceimpl teacher) {
        this.code = code;
        this.name = name;
        this.teacher = teacher;
        this.teacher.setCourseOfTeacher(this);
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setTeacher(TeacherServiceimpl teacher) {
        this.teacher = teacher;
    }

    @Override
    public String getName() {
        //System.out.println("Name of course is : " );
        return name;
    }

    @Override
    public String getCode() {
        // System.out.println("Code of course is : " );
        return code;
    }

    @Override
    public void getTeacherOfCourse() {
        System.out.println("Name of Teacher is : " + teacher.getTeacherName());
    }

    @Override
    public void addStudentToCourse(StudentServiceimpl student) {
        studentsOfCourse.add(student);
    }

    @Override
    public void showStudentsOfCourse() {
        System.out.println("Students of Courses : "+studentsOfCourse);
    }
 }
