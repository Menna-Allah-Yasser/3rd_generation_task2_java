
package task2;

import Model.*;



public class Task2 {
    
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        
        Course c1=new Course();
        c1.setName("math");
        c1.setCode("123");
        c1.setTeacher(t1);
        Course c2=new Course();
        c1.setName("math2");
        c1.setCode("123");
        
        Student s1=new Student();
        s1.setId("1");
        s1.setName("mna");
        s1.setCourseToStudent(c1);
        System.out.println(c1.toString());
        
        /*t1.setId(3);
        t1.setName("mnsor");
        t1.setTeacherCourse(c1);
        t1.setTeacherCourse(c2);
        System.out.println(t1.toString());*/
        
    }
    
}
