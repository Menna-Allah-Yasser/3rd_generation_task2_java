package Serviceimpl;

import Serviceimpl.CourseServiceimpl;
import Service.StudentInterface;
import java.util.ArrayList;


 public class StudentServiceimpl implements StudentInterface {

    private String id;
    private String name;
    private ArrayList<Serviceimpl.CourseServiceimpl> studentCourses= new ArrayList();

   
    @Override
    public void setCourseToStudent(Serviceimpl.CourseServiceimpl course) {
        studentCourses.add(course);
        course.addStudentToCourse(this);
    }

    @Override
    public void setCourseToStudent(ArrayList<Serviceimpl.CourseServiceimpl> list) {
        CourseServiceimpl course = new CourseServiceimpl();
        for (int i = 0; i < list.size(); i++) {
            course = list.get(i);
            this.studentCourses.add(course);
            course.addStudentToCourse(this);
        }

    }
 }
