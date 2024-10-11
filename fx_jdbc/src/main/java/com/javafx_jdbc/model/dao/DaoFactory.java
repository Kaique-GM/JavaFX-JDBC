package com.javafx_jdbc.model.dao;

import com.javafx_jdbc.db.DB;
import com.javafx_jdbc.model.dao.impl.DepartmentDaoJDBC;
import com.javafx_jdbc.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	public static SellerDao creatSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	public static DepartmentDao creatDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
