package lk.ijse.dep.web.pos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * @author : Deshan Charuka <d.c.0729439631@gmail.com>
 * @since : 2021-02-01
 **/
@Data @AllArgsConstructor @NoArgsConstructor
@Embeddable
public class RegisterPK implements SuperEntity {
    @Column(name = "course_code")
    private String courseCode;
    @Column(name = "student_id")
    private int studentId;


}
