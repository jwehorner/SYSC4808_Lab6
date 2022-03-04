package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BuddyInfo {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int age;

    public BuddyInfo(String name, int age){
        this.name = name;
        this.age = age;
    }

    public BuddyInfo() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {this.age = age;}

    public int getAge() {return age;}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
       return "Name: " + name +" \tAge: " + age;
    }
}