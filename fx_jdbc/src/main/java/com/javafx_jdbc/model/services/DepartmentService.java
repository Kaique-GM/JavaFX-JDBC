package com.javafx_jdbc.model.services;

import java.util.List;
import com.javafx_jdbc.model.dao.DaoFactory;
import com.javafx_jdbc.model.dao.DepartmentDao;
import com.javafx_jdbc.model.entities.Department;

public class DepartmentService {

    private DepartmentDao dao = DaoFactory.creatDepartmentDao();

    public List<Department> findAll() {
        return dao.findAll();

    }

    public void saveOrUpdate(Department obj) {
        if (obj.getId() == null) {
            dao.insert(obj);
        } else {
            dao.update(obj);
        }
    }

    public void remove(Department obj) {
        dao.deleteById(obj.getId());
    }

}
