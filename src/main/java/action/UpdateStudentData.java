package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.StudentDAO;
import model.Student;

public class UpdateStudentData extends ActionSupport {
    Integer id;
    String name;
    String level;
    Integer age;
    String gender;

    public String execute(){
        Student student = StudentDAO.getStudentById(id);
        id=student.getId();
        name=student.getName();
        level=student.getLevel();
        age=student.getAge();
        gender=student.getGender();
        return "success";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
