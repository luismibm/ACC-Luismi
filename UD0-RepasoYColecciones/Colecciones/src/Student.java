public class Student {

    int id, age;
    String name;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + "\t|\t" + name + "\t|\t" + age;
    }

}