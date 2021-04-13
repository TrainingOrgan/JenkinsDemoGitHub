package example.service;

import example.dao.SuperHumanDao;
import example.dao.SuperHumanDaoImpl;
import example.model.SuperHuman;

import java.util.List;

public class SuperHumanServiceImpl implements SuperHumanService {

    //we need to create a shumanDao object for the Service to utilize
    /////////////////////////////
    SuperHumanDao shumanDao = new SuperHumanDaoImpl();
    ///////////////////////////////

    @Override
    public void addSHuman(SuperHuman shuman) {

        //any business logic would go here
        shumanDao.insert(shuman);
    }

    @Override
    public List<SuperHuman> getAllSHumans() {
        return shumanDao.selectAll();
    }

    @Override
    public SuperHuman getSHumanUsingId(int id) {
        return shumanDao.selectById(id);
    }
}
