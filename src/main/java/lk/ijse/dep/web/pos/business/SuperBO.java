package lk.ijse.dep.web.pos.business;

import javax.persistence.EntityManager;

/**
 * @author : Deshan Charuka <d.c.0729439631@gmail.com>
 * @since : 2021-02-02
 **/
public interface SuperBO {
    void setEntityManager(EntityManager em);
}
