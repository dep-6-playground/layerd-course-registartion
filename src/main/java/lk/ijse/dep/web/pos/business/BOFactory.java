package lk.ijse.dep.web.pos.business;

import lk.ijse.dep.web.pos.business.custom.impl.CourseBOImpl;
import lk.ijse.dep.web.pos.business.custom.impl.RegisterBOImpl;
import lk.ijse.dep.web.pos.business.custom.impl.StudentBOImpl;

/**
 * @author : Deshan Charuka <d.c.0729439631@gmail.com>
 * @since : 2021-02-02
 **/
public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {
    }

    public static BOFactory getInstance(){
        return (boFactory==null)?(boFactory=new BOFactory()):boFactory;
    }

    public <T extends SuperBO> T getBO(BOTypes type){
        switch (type){
            case STUDENT:
                return (T)new StudentBOImpl();
            case COURSE:
                return (T)new CourseBOImpl();
            case REGISTER:
                return (T)new RegisterBOImpl();
            default:
                return null;
        }
    }
}
