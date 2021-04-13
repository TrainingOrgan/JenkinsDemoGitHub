package example.dao;

import example.model.SuperHuman;

import java.util.List;

public interface SuperHumanDao {
    //CRUD OPERATIONS
    public void insert(SuperHuman shuman);

    public SuperHuman selectById(int id);
    public List<SuperHuman> selectAll();

}
