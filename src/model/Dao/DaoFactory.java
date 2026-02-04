package model.Dao;

import db.DB;
import model.Dao.impl.DepartamentDaoJDBC;
import model.Dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartamentDao() {
        return new DepartamentDaoJDBC(DB.getConnection());
    }


}
