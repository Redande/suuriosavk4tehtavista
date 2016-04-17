package ohtu;

import java.util.ArrayList;
import java.util.List;

public class Submission {
    private String student_number;
    private String week;
    private String hours;
    private String a1;
    private String a2;
    private String a3;
    private String a4;
    private String a5;
    private String a6;
    private String a7;
    private String a8;
    private String a9;
    private String a10;
    private String a11;
    private String a12;
    private String a13;
    private String a14;
    private String a15;
    private String a16;
    private String a17;
    private String a18;
    private String a19;
    private String a20;
    private String a21;
    private List<String> doneExcercises;

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }
    
    public String getWeek() {
        return week;
    }
    
    public void setWeek(String week) {
        this.week = week;
    }
    
    public String getHours() {
        return hours;
    }
    
    public void setHours(String hours) {
        this.hours = hours;
    }
    
    public List<String> getDoneExcercises() {
        return doneExcercises;
    }
    
    private void addDoneExcercises() {
        this.doneExcercises = new ArrayList<String>();
        addExcercise(a1, "1");
        addExcercise(a2, "2");
        addExcercise(a3, "3");
        addExcercise(a4, "4");
        addExcercise(a5, "5");
        addExcercise(a6, "6");
        addExcercise(a7, "7");
        addExcercise(a8, "8");
        addExcercise(a9, "9");
        addExcercise(a10, "10");
        addExcercise(a11, "11");
        addExcercise(a12, "12");
        addExcercise(a13, "13");
        addExcercise(a14, "14");
        addExcercise(a15, "15");
        addExcercise(a16, "16");
        addExcercise(a17, "17");
        addExcercise(a18, "18");
        addExcercise(a19, "19");
        addExcercise(a20, "20");
        addExcercise(a21, "21");
    }
    
    private void addExcercise(String e, String l) {
        if (e != null) {
            doneExcercises.add(l);
        }
    }

    @Override
    public String toString() {
        addDoneExcercises();
        return "viikko " + week + ": "
                + "tehtyjä tehtäviä yhteensä: " + doneExcercises.size()
                + ", aikaa kului " + hours + " tuntia"
                + ", tehdyt tehtävät: " + tehdyt();
    }
    
    private String tehdyt() {
        String r = "";
        for (String e : doneExcercises) {
            r += e + " ";
        }
        return r;
    }
    
}