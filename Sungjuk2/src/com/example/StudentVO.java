package com.example;

public class StudentVO {
    private String hakbun, name;
    private int kor, eng, mat, edp, tot;
    private double avg;
    private char grade;

    public StudentVO(String hakbun, String name, int kor, int eng, int mat, int edp) {
        this.hakbun = hakbun;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.edp = edp;
    }

    public String getHakbun() {
        return hakbun;
    }

    public void setHakbun(String hakbun) {
        this.hakbun = hakbun;
    }

    public int getTot() {
        return tot;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getEdp() {
        return edp;
    }

    public void setEdp(int edp) {
        this.edp = edp;
    }

    @Override
    public String toString(){
        return String.format(  "Student [hakbun=%s, name=%s, kor=%s,eng=%s,mat=%s,edp=%s,avg=%s,grade=%s]",
                hakbun, name, kor, eng, mat, edp, avg, grade);
    }
}
