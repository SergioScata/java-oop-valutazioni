package org.lessons.java.valutazioni;


import java.util.ArrayList;

public class Corso {
    public ArrayList<Studente> student = new ArrayList<>();

    public static void getStudents(ArrayList<Studente>student){
        for (Studente studente : student){
            System.out.println(studente);
        }
    }

    public static void removeStudent(ArrayList<Studente>student, int ID){
            student.remove(ID);
    }

    public static void addStudent(ArrayList<Studente>student, Studente newStudent){
        student.add(newStudent);
    }

    public static  void getPromoteds (ArrayList<Studente>student){
        int i = 0;
        for (Studente studente:student){
            if (studente.passedOrNot()){
                i++;

            }


        }
        System.out.println("la percentuale di studenti promossi è:"+(i*100.0/(student.size())) + "%");

    }


}
