package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.StudentDAO;
import model.Student;

public class ReportDataAction extends ActionSupport {
    Integer id;
    String name;
    String level;
    Integer age;
    String gender;
    Integer java;
    Integer python;
    Integer php;
    Integer javascript;
    Integer html;

    String javaGrade;
    String pythonGrade;
    String phpGrade;
    String javascriptGrade;
    String htmlGrade;

    Double cgpa;
    String remark;


    public String execute() {
        Student student = StudentDAO.getAllRecordsById(id);
        if (student != null) {
            id = student.getId();
            name = student.getName();
            level = student.getLevel();
            age = student.getAge();
            gender = student.getGender();
            java = student.getJava();
            python = student.getPython();
            php = student.getPhp();
            javascript = student.getJavascript();
            html = student.getHtml();

            javaGrade = getGrade(java);
            pythonGrade = getGrade(python);
            phpGrade = getGrade(php);
            javascriptGrade = getGrade(javascript);
            htmlGrade = getGrade(html);

            cgpa = getCgpa(java, python, php, javascript, html);
            remark = cgpaRemark(cgpa);
        }
            return "success";
        }

        public String getGrade(Integer score) {
            if (score == null) {
                return "N/A";
            } else if (score >= 70) {
                return "A";
            } else if (score >= 60) {
                return "B";
            } else if (score >= 50) {
                return "C";
            } else if (score >= 45) {
                return "D";
            } else if (score >= 39) {
                return "E";
            }else {
                return "F";
            }
        }

    public double getCgpa(int java, int python, int php, int javascript, int html) {
        double total = java + python + php + javascript + html;
        double average = total / 5.0;
        double cgpa = (average / 100.0) * 5.0;
        return Math.round(cgpa * 100.0) / 100.0; // keeps 2 decimal places
    }

    private String cgpaRemark(double cgpa) {
            if (cgpa >= 4.5) return "Excellent";
            else if (cgpa >= 3.5) return "Very Good";
            else if (cgpa >= 2.5) return "Good";
            else if (cgpa >= 1.5) return "Pass";
            else return "Fail";
        }

        public Integer getId () {
            return id;
        }

        public void setId (Integer id){
            this.id = id;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getLevel () {
            return level;
        }

        public void setLevel (String level){
            this.level = level;
        }

        public Integer getAge () {
            return age;
        }

        public void setAge (Integer age){
            this.age = age;
        }

        public String getGender () {
            return gender;
        }

        public void setGender (String gender){
            this.gender = gender;
        }

        public Integer getJava () {
            return java;
        }

        public void setJava (Integer java){
            this.java = java;
        }

        public Integer getPython () {
            return python;
        }

        public void setPython (Integer python){
            this.python = python;
        }

        public Integer getPhp () {
            return php;
        }

        public void setPhp (Integer php){
            this.php = php;
        }

        public Integer getJavascript () {
            return javascript;
        }

        public void setJavascript (Integer javascript){
            this.javascript = javascript;
        }

        public Integer getHtml () {
            return html;
        }

        public void setHtml (Integer html){
            this.html = html;
        }

        public String getJavaGrade () {
            return javaGrade;
        }

        public void setJavaGrade (String javaGrade){
            this.javaGrade = javaGrade;
        }

        public String getPythonGrade () {
            return pythonGrade;
        }

        public void setPythonGrade (String pythonGrade){
            this.pythonGrade = pythonGrade;
        }

        public String getPhpGrade () {
            return phpGrade;
        }

        public void setPhpGrade (String phpGrade){
            this.phpGrade = phpGrade;
        }

        public String getJavascriptGrade () {
            return javascriptGrade;
        }

        public void setJavascriptGrade (String javascriptGrade){
            this.javascriptGrade = javascriptGrade;
        }

        public String getHtmlGrade () {
            return htmlGrade;
        }

        public void setHtmlGrade (String htmlGrade){
            this.htmlGrade = htmlGrade;
        }

        public Double getCgpa () {
            return cgpa;
        }

        public void setCgpa (Double cgpa){
            this.cgpa = cgpa;
        }

        public String getRemark () {
            return remark;
        }

        public void setRemark (String remark){
            this.remark = remark;
        }
    }