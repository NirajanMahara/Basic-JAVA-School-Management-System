package school.management.system;

import java.util.List;

/** Created by Nirajan Mahara on 2021 January 28.
    * This class in responsible for keep the track of School.
    * teachers, students, Total money earned, total money spent-teacher's salary.
    * The school can have, many teachers, many students
    * teacher1, teacher2, teacher3 for example
    * student1, student2, student3 for example
    * BUT, it is stupid.
    * You can think, you can create array create array
    * private Teacher[] techer = new Teacher[5]
    * array is not good ways, it is only for limited number of teachers or students
    * SO, you have to use ArrayList.
 * static can access
    */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * New school object is created
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     *
     * @return the list of teachers in the school.
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * ADD a teacher to school.
     * @param teacher the teacher to be added.
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return the list of students in the school.
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * ADD a student to school
     * @param student the student to be added
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * ADDs the MoneyEarned earned to the totalMoneyEarned of the school a/c
     * @param MoneyEarned monet that is supposed to be added everytime anyone pays.
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school(salary)
     * is the salary given by the school to its teachers.
     * @param moneySpent the money spent by teh school.
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}

