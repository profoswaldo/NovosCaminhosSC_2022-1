package br.gov.exemplo003_sqlite;


public class Aluno {
    private int id;
    private String studentName;

    Aluno() {
    }
    Aluno(int id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }
    void setID(int id) {
        this.id = id;
    }
    int getID() {
        return this.id;
    }
    void setStudentName(String studentname) {
        this.studentName = studentname;
    }
    String getStudentName() {
        return this.studentName;
    }
}
