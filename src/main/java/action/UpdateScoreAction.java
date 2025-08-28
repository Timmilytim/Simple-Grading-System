package action;

import com.opensymphony.xwork2.ActionSupport;
import model.Student;

public class UpdateScoreAction extends ActionSupport {
    Integer id;
    Integer java;
    Integer python;
    Integer php;
    Integer javascript;
    Integer html;

    public String execute() {
        String statusCode="";
        Student student = new Student();
        student.setId(id);
        student.setJava(java);
        student.setPython(python);
        student.setPhp(php);
        student.setJavascript(javascript);
        student.setHtml(html);
        int recordUpdated = dao.StudentDAO.inputScore(student);
        if (recordUpdated == 1) {
            statusCode = "success";
        } else {
            statusCode = "error";
        }
        return statusCode;
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
