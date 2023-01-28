package com.example.cgpacalculator.Entity;

public class Student {

    private int cg1;
    private int cg2;
    private int cg3;
    private int cg4;
    private int cg5;
    private int cg6;
    private int cg7;
    private int cg8;
    private int cg9;
    private int cg10;
    private int cg11;
    private int cg12;
    private double cgth;

    private double cgpa;

    public double getTotalCGPA(){

        double cg1T = cg1*12;
        double cg2T = cg2*11.1;
        double cg3T = cg3*9.9;
        double cg4T = cg4*9;
        double cg5T = cg5*8.1;
        double cg6T = cg6*6.9;
        double cg7T = cg7*6;
        double cg8T = cg8*5.1;
        double cg9T = cg9*3.9;
        double cg10T = cg10*3;
        double cg11T = cg11*2.1;
        double cg12T = cg12*0;
        double cgthT = cgth*4;

        double totalT = cg1T + cg2T + cg3T + cg4T + cg5T + cg6T + cg7T + cg8T + cg9T + cg10T + cg11T + cg12T + cgthT;
        double totalCredit = (cg1 + cg2 + cg3 + cg4 + cg5 + cg6 + cg7 + cg8 + cg9 + cg10 + cg11 + cg12)*3;

        if(cgth>1){
            totalCredit = totalCredit + 4;
        }

        cgpa = (totalT/totalCredit);
        cgpa = (double) Math.round(cgpa * 100d) / 100d;
        return cgpa;
    }

    public String getGrade(){

        String grade;
        if(cgpa > 3.7){
            grade = "A";
            return grade;
        } else if (cgpa > 3.3) {
            grade = "A-";
            return grade;
        } else if (cgpa > 3.0) {
            grade = "B+";
            return grade;
        } else if (cgpa > 2.7) {
            grade = "B";
            return grade;
        }
        grade = "A";


        return grade;
    }

    public int getTotalCredit() {
        int totalCredit = (cg1 + cg2 + cg3 + cg4 + cg5 + cg6 + cg7 + cg8 + cg9 + cg10 + cg11 + cg12)*3;
        if(cgth>0){
            return totalCredit + 4;
        }
        return totalCredit;
    }

    public int getTotalCourses() {
        int totalCourses = (cg1 + cg2 + cg3 + cg4 + cg5 + cg6 + cg7 + cg8 + cg9 + cg10 + cg11 + cg12);

        return totalCourses;
    }


    public int getCg1() {
        return cg1;
    }

    public void setCg1(int cg1) {
        this.cg1 = cg1;
    }

    public int getCg2() {
        return cg2;
    }

    public void setCg2(int cg2) {
        this.cg2 = cg2;
    }

    public int getCg3() {
        return cg3;
    }

    public void setCg3(int cg3) {
        this.cg3 = cg3;
    }

    public int getCg4() {
        return cg4;
    }

    public void setCg4(int cg4) {
        this.cg4 = cg4;
    }

    public int getCg5() {
        return cg5;
    }

    public void setCg5(int cg5) {
        this.cg5 = cg5;
    }

    public int getCg6() {
        return cg6;
    }

    public void setCg6(int cg6) {
        this.cg6 = cg6;
    }

    public int getCg7() {
        return cg7;
    }

    public void setCg7(int cg7) {
        this.cg7 = cg7;
    }

    public int getCg8() {
        return cg8;
    }

    public void setCg8(int cg8) {
        this.cg8 = cg8;
    }

    public int getCg9() {
        return cg9;
    }

    public void setCg9(int cg9) {
        this.cg9 = cg9;
    }

    public int getCg10() {
        return cg10;
    }

    public void setCg10(int cg10) {
        this.cg10 = cg10;
    }

    public int getCg11() {
        return cg11;
    }

    public void setCg11(int cg11) {
        this.cg11 = cg11;
    }

    public int getCg12() {
        return cg12;
    }

    public void setCg12(int cg12) {
        this.cg12 = cg12;
    }

    public double getCgth() {
        return cgth;
    }

    public void setCgth(double cgth) {
        this.cgth = cgth;
    }

}
