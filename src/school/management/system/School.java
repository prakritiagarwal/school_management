package school.management.system;

import java.util.List;

/**
 * Keeps track of all things school related
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * 
     * @param teachers
     * @param student
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Update teachers
     * @param teachers
     */
    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    /**
     * Gets all student in the school
     * @return
     */
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public static int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public static int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
        totalMoneySpent += moneySpent;
    }

    /**
     * Add a teacher to the school
     * @param teacher
     */
    public void addTeacher(Teacher teacher)
    {
        teachers.add(teacher);
    }

    /**
     * Add a student to the school
     * @param student
     */
    public void addStudent(Student student)
    {
        students.add(student);
    }
    
}
