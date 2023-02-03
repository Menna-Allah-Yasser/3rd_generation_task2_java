package Serviceimpl;

import Service.TeacherInterface;
import java.util.ArrayList;


 public class TeacherServiceimpl implements TeacherInterface {

    private int id;
    private String teacherName;
    private ArrayList<CourseServiceimpl> teacherCourses = new ArrayList();

    
    @Override
    public void getCourses() {
        System.out.println("teacher courses : "+teacherCourses);
    }

    

}
