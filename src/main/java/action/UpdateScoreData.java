package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.StudentDAO;
import model.Student;

public class UpdateScoreData extends ActionSupport {

    Integer id;
    Integer java;
    Integer python;
    Integer php;
    Integer javascript;
    Integer html;

    public String execute() {
        Student student = new Student();
        student = StudentDAO.getStudentById(id);
        id = student.getId();
        java = student.getJava();
        python = student.getPython();
        php = student.getPhp();
        javascript = student.getJavascript();
        html = student.getHtml();
        return "success";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJava() {
        return java;
    }

    public void setJava(Integer java) {
        this.java = java;
    }

    public Integer getPython() {
        return python;
    }

    public void setPython(Integer python) {
        this.python = python;
    }

    public Integer getPhp() {
        return php;
    }

    public void setPhp(Integer php) {
        this.php = php;
    }

    public Integer getJavascript() {
        return javascript;
    }

    public void setJavascript(Integer javascript) {
        this.javascript = javascript;
    }

    public Integer getHtml() {
        return html;
    }

    public void setHtml(Integer html) {
        this.html = html;
    }
}
