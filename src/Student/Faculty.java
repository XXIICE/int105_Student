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
public class Faculty {
    private String facultyName;
    private String university;

    public Faculty(String facultyName,String university){
        this.facultyName = facultyName;
        this.university = university;
    }
    public Faculty(){
      
    }
    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Faculty{" + "facultyName=" + facultyName + ", university=" + university + '}';
    }
    
}
