package lk.ijse.dep.web.pos.dao;

import javax.persistence.EntityManager;

/**
 * @author : Deshan Charuka <d.c.0729439631@gmail.com>
 * @since : 2021-02-01
 **/
public interface SuperDAO {
    void setEntityManager(EntityManager em);
}
