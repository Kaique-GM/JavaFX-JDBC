package com.javafx_jdbc.model.services;

import java.util.List;
import com.javafx_jdbc.model.dao.DaoFactory;
import com.javafx_jdbc.model.dao.SellerDao;
import com.javafx_jdbc.model.entities.Seller;

public class SellerService {

    private SellerDao dao = DaoFactory.creatSellerDao();

    public List<Seller> findAll() {
        return dao.findAll();

    }

    public void saveOrUpdate(Seller obj) {
        if (obj.getId() == null) {
            dao.insert(obj);
        } else {
            dao.update(obj);
        }
    }

    public void remove(Seller obj) {
        dao.deleteById(obj.getId());
    }

}
