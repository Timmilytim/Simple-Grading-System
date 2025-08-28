package action;

import com.opensymphony.xwork2.ActionSupport;
import model.Student;

import java.util.List;

public class DashboardAction extends ActionSupport {
    List<Student> students;

    public void initializeStudents() {
        students = dao.StudentDAO.getAllStudents();
    }

    public String execute() {
        initializeStudents();
        return "success";
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
