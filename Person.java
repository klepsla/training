public class Person {
    private String name;
    private int age;
    private int fhoneNumber;

    public Person(String name, int age, int fhoneNumber) {
        this.name = name;
        this.age = age;
        this.fhoneNumber = fhoneNumber;


        public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFhoneNumber(int fhoneNumber) {
        this.fhoneNumber = fhoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getFhoneNumber() {
        return fhoneNumber;
    }

    }
}
