package dao;

import database.DBUtil;
import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<Student>();

        try{
            Connection conn = DBUtil.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM students");

            while (rs.next()){
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setLevel(rs.getString("level"));
                student.setAge(rs.getInt("age"));
                student.setGender(rs.getString("gender"));
                students.add(student);
            }
            DBUtil.closeConnection(conn);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    public static int addStudent(Student student){
        int status = 0;
        try{
            Connection conn = database.DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO students (name, level, gender, age) VALUES (?, ?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, student.getName());
            ps.setString(2, student.getLevel());
            ps.setString(3, student.getGender());
            ps.setInt(4, student.getAge());
            status = ps.executeUpdate();
            database.DBUtil.closeConnection(conn);
        }catch (Exception e){
            e.printStackTrace();
    }
        return status;
    }

    public static Student getStudentById(int id){
        Student student = null;
        try{
            Connection conn = database.DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM students WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setLevel(rs.getString("level"));
                student.setAge(rs.getInt("age"));
                student.setGender(rs.getString("gender"));
        }
            database.DBUtil.closeConnection(conn);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return  student;
    }

    public static int updateStudent(Student student) {
        int status = 0;
        try {
            Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement("UPDATE students SET name = ?, level = ?, age = ?, gender = ? WHERE id = ?");
            ps.setString(1, student.getName());
            ps.setString(2, student.getLevel());
            ps.setInt(3, student.getAge());
            ps.setString(4, student.getGender());
            ps.setInt(5, student.getId());
            status = ps.executeUpdate();
            DBUtil.closeConnection(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }


    public static Student getScoreById(int id){
        Student student = null;
        try{
            Connection conn = database.DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM students WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                student = new Student();
                student.setId(rs.getInt("id"));
                student.setJava(rs.getInt("java"));
                student.setPython(rs.getInt("python"));
                student.setPhp(rs.getInt("php"));
                student.setJavascript(rs.getInt("javascript"));
                student.setHtml(rs.getInt("html"));
            }
            database.DBUtil.closeConnection(conn);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return  student;
    }

    public static int inputScore(Student student) {
        int status = 0;
        try {
            Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement("UPDATE students SET java = ?, python = ?, php = ?, javascript = ?, html = ? WHERE id = ?");
            ps.setInt(1, student.getJava());
            ps.setInt(2, student.getPython());
            ps.setInt(3, student.getPhp());
            ps.setInt(4, student.getJavascript());
            ps.setInt(5, student.getHtml());
            ps.setInt(6, student.getId());
            status = ps.executeUpdate();
            DBUtil.closeConnection(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public static Student getAllRecordsById(int id){
        Student student = null;
        try{
            Connection conn = database.DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM students WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                student = new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("level"),
                        rs.getInt("age"),
                        rs.getString("gender"),
                        rs.getInt("java"),
                        rs.getInt("python"),
                        rs.getInt("php"),
                        rs.getInt("javascript"),
                        rs.getInt("html"));
            }
            database.DBUtil.closeConnection(conn);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return  student;
    }



    public static int deleteStudent(int id) {
        int status = 0;
        try {
            Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM students WHERE id = ?");
            ps.setInt(1, id);
            status = ps.executeUpdate();
            DBUtil.closeConnection(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}
