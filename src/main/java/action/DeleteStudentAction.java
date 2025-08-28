package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.StudentDAO;

public class DeleteStudentAction extends ActionSupport {
    Integer id;

    public String execute() {
        String statusCode = "";
        int recordDeleted = StudentDAO.deleteStudent(id);
        if (recordDeleted == 1) {
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
}
