package example.model;



public class SuperHuman {

    private  int shumanId;

    private String name;

    private String superpower;

    private int bounty;

    public SuperHuman() {
    }

    public SuperHuman(String name, String superpower) {
        this.name = name;
        this.superpower = superpower;
    }

    public SuperHuman(String name, String superpower, int bounty) {
        this.name = name;
        this.superpower = superpower;
        this.bounty = bounty;
    }

    public SuperHuman(int shumanId, String name, String superpower, int bounty) {
        this.shumanId = shumanId;
        this.name = name;
        this.superpower = superpower;
        this.bounty = bounty;
    }

    public int getShumanId() {
        return shumanId;
    }

    public void setShumanId(int shumanId) {
        this.shumanId = shumanId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    public int getBounty() {
        return bounty;
    }

    public void setBounty(int bounty) {
        this.bounty = bounty;
    }

    @Override
    public String toString() {
        return "\nSuperHuman{" +
                "sHumanId=" + shumanId +
                ", name='" + name + '\'' +
                ", superpower='" + superpower + '\'' +
                ", bounty=" + bounty +
                '}';
    }
}
