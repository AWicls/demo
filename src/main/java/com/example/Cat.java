public class Cat {

    private String name;
    private int age;
    private String id;
    private String owner;

    public Cat(String name, int age, String id, String owner) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

}
