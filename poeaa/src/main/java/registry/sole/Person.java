package registry.sole;

/**
 * @packgeName: org.lili.chapter18.registry
 * @ClassName: Person
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/9/3-23:11
 * @version: 1.0
 * @since: JDK 1.8
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person name： "+this.firstName+" "+ this.lastName + " ,age:"+this.age;
    }
}
