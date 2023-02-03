package Service;

import Serviceimpl.StudentServiceimpl;
import Serviceimpl.TeacherServiceimpl;


public interface CourseInterface {
    
     void addStudentToCourse(StudentServiceimpl student) ;

     void showStudentsOfCourse() ;
}
