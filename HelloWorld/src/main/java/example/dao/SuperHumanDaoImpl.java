package example.dao;

import example.model.SuperHuman;

import java.util.ArrayList;
import java.util.List;


public class SuperHumanDaoImpl implements SuperHumanDao {

    private static List<SuperHuman> mySHumans = new ArrayList<>();

    static {
        mySHumans.add(new SuperHuman("Apple Jupiter", "Flesh Fruit", 0));
        mySHumans.add(new SuperHuman("Pepper Jupiter", "Drowsy Fist", 0));
        mySHumans.add(new SuperHuman("Pastor", "Holy Water", 0));
        mySHumans.add(new SuperHuman("Danny Boy", "Electromagnetism", 250_000));
        mySHumans.add(new SuperHuman("Khro", "Time Dilation", 250_000));
        mySHumans.add(new SuperHuman("Quintin Tesa", "Finger Bullets", 160_000));
    }

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
