package model;

public class Score {
    private int id;
    private Integer java;
    private Integer python;
    private Integer php;
    private Integer javascript;
    private Integer html;

    public Score() {
    }

    public Score(int id, Integer java, Integer python, Integer php, Integer javascript, Integer html) {
        this.id = id;
        this.java = java;
        this.python = python;
        this.php = php;
        this.javascript = javascript;
        this.html = html;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
