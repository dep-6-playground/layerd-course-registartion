package lk.ijse.dep.web.pos.entity;

import lk.ijse.dep.web.pos.entity.util.Audience;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author : Deshan Charuka <d.c.0729439631@gmail.com>
 * @since : 2021-02-01
 **/
@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "course")
public class Course implements SuperEntity {
    @Id
    private String code;
    private String description;
    private String duration;
    @Enumerated(EnumType.ORDINAL)
    private Audience audience;

    @OneToMany(mappedBy = "course")
    @Setter(AccessLevel.NONE)
    private List<Register> registers;

    public Course(String code, String description, String duration, Audience audience) {
        this.code = code;
        this.description = description;
        this.duration = duration;
        this.audience = audience;
    }
}
