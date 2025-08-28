package model;

public class Student {
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

    public Student() {
    }

    public Student(Integer id, String name, String level, Integer age, String gender, Integer java, Integer python, Integer php, Integer javascript, Integer html) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.age = age;
        this.gender = gender;
        this.java = java;
        this.python = python;
        this.php = php;
        this.javascript = javascript;
        this.html = html;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", java=" + java +
                ", python=" + python +
                ", php=" + php +
                ", javascript=" + javascript +
                ", html=" + html +
                '}';
    }
}
