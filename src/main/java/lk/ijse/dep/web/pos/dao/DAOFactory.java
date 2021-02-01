package lk.ijse.dep.web.pos.dao;

import lk.ijse.dep.web.pos.dao.custom.impl.CourseDAOImpl;
import lk.ijse.dep.web.pos.dao.custom.impl.QueryDAOImpl;
import lk.ijse.dep.web.pos.dao.custom.impl.RegisterDAOImpl;
import lk.ijse.dep.web.pos.dao.custom.impl.StudentDAOImpl;

/**
 * @author : Deshan Charuka <d.c.0729439631@gmail.com>
 * @since : 2021-02-01
 **/
public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory(){

    }
    public static DAOFactory getInstance(){
        return (daoFactory==null)?(daoFactory = new DAOFactory()):daoFactory;
    }

    public <T extends SuperDAO> T getDAO(DAOTypes daoTypes){
        switch (daoTypes){
            case STUDENT:
                return (T) new StudentDAOImpl();
            case COURSE:
                return (T) new CourseDAOImpl();
            case REGISTER:
                return (T) new RegisterDAOImpl();
            case QUERY:
                return (T) new QueryDAOImpl();
            default:
                return null;
        }
    }


}
