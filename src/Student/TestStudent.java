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
public class TestStudent {
    public static void main(String[] args) {
        Faculty f = new Faculty("IT","KMUTT");
        Address a = new Address("19/2","Muang","Nakhonpathom");
        Student s = new Student(138,"Ariya",a,f);
        System.out.println(f);
        System.out.println(a);
        System.out.println(s);
        //////////////////////////////////
        int[]score = {1,5,2,3,4,5,7};
        int i=3;
                System.out.println(score[i-2]+2);
    }
}                                                    
