/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author INT105
 */
public class Student {
    private long id;
    private String name;
    private Address address;
    private Faculty faculty;
    public Student(){
        
    }
    public Student(long id,String name,Address address,Faculty faculty){
        
        this.id = id;
        this.name = name;
        this.address = address;
        this.faculty = faculty;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", " + address + ", " + faculty + '}';
    }
    
}
