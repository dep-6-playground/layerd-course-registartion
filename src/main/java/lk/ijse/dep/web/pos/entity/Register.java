package lk.ijse.dep.web.pos.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * @author : Deshan Charuka <d.c.0729439631@gmail.com>
 * @since : 2021-02-01
 **/
@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "register")
public class Register implements SuperEntity {
    @EmbeddedId
    private RegisterPK registerPK;
    @Column(name = "register_date")
    private Date registerDate;
    @Column(name = "register_fee")
    private BigDecimal registerFee;
    @ManyToOne
    @Setter(AccessLevel.NONE)
    @JoinColumn(name="student_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Student student;
    @ManyToOne
    @Setter(AccessLevel.NONE)
    @JoinColumn(name="course_code", referencedColumnName = "code", insertable = false, updatable = false)
    private Course course;


    public Register(RegisterPK registerPK, Date registerDate, BigDecimal registerFee) {
        this.registerPK = registerPK;
        this.registerDate = registerDate;
        this.registerFee = registerFee;
    }

    public Register(int studentId,String courseCode, Date registerDate, BigDecimal registerFee) {
        this.registerPK = new RegisterPK(courseCode,studentId);
        this.registerDate = registerDate;
        this.registerFee = registerFee;
    }
}
