package example.dao;

import example.model.SuperHuman;

import java.util.ArrayList;
import java.util.List;


public class SuperHumanDaoImpl implements SuperHumanDao {

    private static List<SuperHuman> mySHumans = new ArrayList<>();


    @Override
    public void insert(SuperHuman shuman) {
        mySHumans.add(shuman);
    }

    @Override
    public SuperHuman selectById(int id) {
        return mySHumans.get(id);
    }

    @Override
    public List<SuperHuman> selectAll() {
        return mySHumans;
    }
}
