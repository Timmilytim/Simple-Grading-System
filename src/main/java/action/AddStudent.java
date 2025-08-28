package action;

import com.opensymphony.xwork2.ActionSupport;
import model.Student;

public class AddStudent extends ActionSupport {

    String name;
    String level;
    Integer age;
    String gender;

    public String execute() {
        String statusCode = "";
        Student student = new Student();
        student.setName(name);
        student.setLevel(level);
        student.setGender(gender);
        student.setAge(age);
        int recordAdded = dao.StudentDAO.addStudent(student);
        if (recordAdded == 1) {
            statusCode = "success";
        } else {
            statusCode = "error";
        }
        return statusCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
