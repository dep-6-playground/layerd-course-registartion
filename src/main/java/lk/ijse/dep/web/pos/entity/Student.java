package lk.ijse.dep.web.pos.entity;

import lk.ijse.dep.web.pos.entity.util.Gender;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 * @author : Deshan Charuka <d.c.0729439631@gmail.com>
 * @since : 2021-02-01
 **/
@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "student")
public class Student implements SuperEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Column(name = "student_name")
    private String studentName;
    private String contact;
    private Date dob;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @AttributeOverride(name = "no",column = @Column(name = "student_house_no"))
    @AttributeOverride(name = "addressLine1",column = @Column(name = "student_house_address_line1"))
    @AttributeOverride(name = "addressLine2",column = @Column(name = "student_house_address_line2"))
    @AttributeOverride(name = "city",column = @Column(name = "student_house_city"))
    @Embedded
    private Address address;

    @OneToMany(mappedBy = "student")
    @Setter(AccessLevel.NONE)
    private List<Register> registers;

    public Student(int id, String studentName, String contact, Date dob, Gender gender, Address address) {
        this.id = id;
        this.studentName = studentName;
        this.contact = contact;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
    }
}
