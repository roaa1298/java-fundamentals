package inheritance;

public abstract class Manager {
    private  String name;

    public Manager(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void addReview(Review rev);
//    public abstract void editStars();

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                '}';
    }
}
