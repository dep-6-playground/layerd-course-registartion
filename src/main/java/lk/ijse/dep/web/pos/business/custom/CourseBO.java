package lk.ijse.dep.web.pos.business.custom;

import lk.ijse.dep.web.pos.business.SuperBO;
import lk.ijse.dep.web.pos.dto.CourseDTO;

import java.util.List;

/**
 * @author : Deshan Charuka <d.c.0729439631@gmail.com>
 * @since : 2021-02-02
 **/
public interface CourseBO extends SuperBO {
    public void saveCourse(CourseDTO courseDTO) throws Exception;
    public void updateCourse(CourseDTO courseDTO) throws Exception;
    public void deleteCourse(String courseID) throws Exception;
    public List<CourseDTO> findAllCourses() throws Exception;
}
