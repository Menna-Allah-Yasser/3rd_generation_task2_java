package Model;

import java.util.ArrayList;
import java.util.Vector;

public class Teacher {

    private int id;
    private String teacherName;
    private ArrayList<Course> teacherCourses = new ArrayList();

    public Teacher() {
    }

    public Teacher(int id, String teacherName, Course course) {
        this.id = id;
        this.teacherName = teacherName;
        teacherCourses.add(course);
        course.setTeacher(this);
    }

    public Teacher(int id, String teacherName, ArrayList<Course> list) {
        this.id = id;
        this.teacherName = teacherName;
        this.teacherCourses = list;
        Course course = new Course();
        for (int i = 0; i < list.size(); i++) {
            course = list.get(i);
            course.setTeacher(this);
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setTeacherCourse(Course course) {
       this.teacherCourses.add(course);
    }

    public int getId() {
        //   System.out.print("ID of Teacher is : " );
        return id;
    }

    public String getTeacherName() {
        //  System.out.print("Name of Teacher is : ");
        return teacherName;
    }

    public void getCourses() {
        System.out.println("Teacher Courses : " + teacherCourses.toArray());
    }

    @Override
    public String toString() {

        System.out.print("Teacher { Teacher Courses : ");
        for (Course i : teacherCourses) {
            System.out.println(i.getCode() + "   " + i.getName());
        }
        return "id = " + id + " , teacherName = " + teacherName + '}';
    }

}
