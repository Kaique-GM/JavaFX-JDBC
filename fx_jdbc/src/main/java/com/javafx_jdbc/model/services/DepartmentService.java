package com.javafx_jdbc.model.services;

import java.util.List;
import java.util.ArrayList;

import com.javafx_jdbc.model.entities.Department;

public class DepartmentService {

    public List<Department> findAll() {
        List<Department> list = new ArrayList<>();
        list.add(new Department(1, "Books"));
        list.add(new Department(2, "Computers"));
        list.add(new Department(3, "Electronics"));
        return list;

    }

}
