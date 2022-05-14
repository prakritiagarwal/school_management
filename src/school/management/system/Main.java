package school.management.system;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher melissa = new Teacher(2, "Melissa", 700);
        Teacher vanderhon = new Teacher(3, "Vanderhorn", 600);
List<Teacher> teacherList = new ArrayList<>();
teacherList.add(lizzy);
teacherList.add(melissa);
teacherList.add(vanderhon);

        Student tamasha = new Student(1, "Tamasha", 4);
        Student rakshit = new Student(2, "Rakshit", 12);
        Student rabbi = new Student(3, "Rabbi", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rabbi);
        studentList.add(rakshit);


        School ghs = new School(teacherList, studentList);

        Teacher megan = new Teacher(6, "Megan", 900);
        ghs.addTeacher(megan);
        

        tamasha.payFees(5000);
        rakshit.payFees(6000);

        System.out.println("Ghs has earned $" + School.getTotalMoneyEarned());

        lizzy.receiveSalary(lizzy.getSalaray());
        System.out.println("Ghs has spent for salary to " + lizzy.getName() + 
         " and now has $ " + School.getTotalMoneyEarned() );

         vanderhon.receiveSalary(vanderhon.getSalaray());

         System.out.println("Ghs has spent for salary to " + vanderhon.getName() + 
         " and now has $ " + School.getTotalMoneyEarned() );

         System.out.println(melissa);
         System.out.println(rakshit);
         System.out.println(vanderhon);
         System.out.println(lizzy);




    }
    
}
