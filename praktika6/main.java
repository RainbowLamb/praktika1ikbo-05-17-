import java.util.concurrent.ThreadLocalRandom;

public class main {
    public static void main(String[] args)
    {   Student students[] = new Student[10];
        for (int i = 0; i < 10; i++){
            students[i] = new Student();
            students[i].setName("Howard Folk The " + i);
            students[i].setGpa( ThreadLocalRandom.current().nextInt(0, 100 + 1));}
        System.out.println("Before Sort");
        for (Student student:students)
        {System.out.println(student.getName() + " " + student.getGpa());}
        SortingStudentsByGPA Sort = new SortingStudentsByGPA();
        Sort.SortStudentsByGPA(students);
        System.out.println("After Sort");
        for (Student student:students)
        {System.out.println(student.getName() + " " + student.getGpa());}
    }

}