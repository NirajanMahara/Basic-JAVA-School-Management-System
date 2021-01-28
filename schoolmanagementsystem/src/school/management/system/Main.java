package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nirajan Mahara on 2021 January 28.
 * This class in responsible for keep the track of students.
 * fees, name, id, grade, feespaid.
 */

public class Main {

    public static void main(String[] args) {
		Teacher gaurav = new Teacher(1,"Gaurav Chand",1000);
		Teacher puspa = new Teacher(2,"Puspa Chand",700);
		Teacher nagen = new Teacher(3,"Nagen Kalau",800);

			List<Teacher> teacherList = new ArrayList<>();
			teacherList.add(gaurav);
			teacherList.add(nagen);
			teacherList.add(puspa);

		Student parash = new Student(1,"Parash Kunwar",10);
		Student ankit = new Student(2,"Ankit Aryal",11);
		Student daniel = new Student(3,"Daniel Rai",12);

		List<Student> studentList = new ArrayList<>();
		studentList.add(parash);
		studentList.add(daniel);
		studentList.add(ankit);


		School punkschool = new School(teacherList, studentList);

//		just for adding new teacher by addmethod, same applies to students also
		Teacher kiran = new Teacher(4,"Kiran Bhatt",600);
		punkschool.addTeacher(kiran);

		daniel.payFees(5000);
		parash.payFees(6000);

		System.out.println("-----\t\tPUNKSCHOOL FUND EARNED: $" + punkschool.getTotalMoneyEarned()+"\t\t-----");

		System.out.println("-----\t\tPUNKSCHOOL PAYS SALARY\t\t\t\t-----");

		gaurav.receiveSalary(gaurav.getSalary());
		System.out.println("PUNKSCHOOL SPENT SALARY TO: " + gaurav.getName()+" || REMAINING MONEY IS: $"+ punkschool.getTotalMoneyEarned());

		puspa.receiveSalary(puspa.getSalary());
		System.out.println("PUNKSCHOOL SPENT SALARY TO: " + puspa.getName()+" || REMAINING MONEY IS: $"+ punkschool.getTotalMoneyEarned());

		System.out.println("-------------------------------------------------------------");
		System.out.println(parash);
		System.out.println(daniel);
		System.out.println(ankit);

		System.out.println("--------------------------------------------------------------");
		System.out.println(gaurav);
		System.out.println(puspa);
		System.out.println(nagen);
		System.out.println(kiran);


    }



}
