package example.service;

import example.model.SuperHuman;

import java.util.List;

public interface SuperHumanService {
    public void addSHuman(SuperHuman shuman);

    public List<SuperHuman> getAllSHumans();
    public SuperHuman getSHumanUsingId(int id);
}
