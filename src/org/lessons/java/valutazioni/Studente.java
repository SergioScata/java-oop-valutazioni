package org.lessons.java.valutazioni;

import java.math.BigDecimal;

public class Studente {
    private int idStudent;

    private static int counter = 10;
    private int absences;
    private double media;

    public Studente(int absences, double media) {
        this.idStudent = counter++;
        this.absences = absences;
        this.media = media;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getAbsences() {
        return absences;
    }

    public void setAbsences(int absences) {
        this.absences = absences;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

public boolean passedOrNot(){

        if (absences>50){
            return false;
        } else if (absences>25 && absences<50 && media>2 ) {
            return true;
        }else if (absences<25 && media>=2){
            return true;
        }else return false;
}

    @Override
    public String toString() {
        return "id: " + idStudent + " media voti: " + media + " percentuale assenze: " + absences + "%";
    }
}
