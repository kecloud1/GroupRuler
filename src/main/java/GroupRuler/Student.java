package GroupRuler;

import java.util.ArrayList;

public class Student {

    private String firstName;
    private String lastName;
    private int id;
    private int gradeLevel;
    private ArrayList<String> conflicts = new ArrayList<>();
    private Level level;
    private static int idCounter = 0;

    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = grade;
        this.id = idCounter;
        idCounter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public ArrayList<String> getConflicts() {
        return conflicts;
    }

    public void addConflict(int id) {
        this.conflicts.add(Integer.toString(id));
    }

    public void removeConflict (int id) {
        this.conflicts.remove(Integer.toString(id));
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void print() {
        System.out.println("Student name: " + getFirstName() + " " + getLastName());
        System.out.println("Grade: " + getGradeLevel());
        System.out.println("Achievement level: " + getLevel());
        System.out.println("Conflicts: " + getConflicts());
    }
}

enum Level {
    HIGH, MED, LOW
}
