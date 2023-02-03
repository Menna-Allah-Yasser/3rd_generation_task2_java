package Service;

import Serviceimpl.CourseServiceimpl;
import java.util.ArrayList;

public interface StudentInterface {

     void setCourseToStudent(CourseServiceimpl course);

     void setCourseToStudent(ArrayList<CourseServiceimpl> list);
}
