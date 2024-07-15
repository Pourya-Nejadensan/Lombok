import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student pourya = new Student(1,"pourya","Hamburg",1);
        Teacher teacher = new Teacher(1,"teacher","Informatik");
        Course informatik = new Course(1,"Informatik",teacher,new ArrayList<Student>(List.of(pourya)));

        System.out.println(pourya);
        System.out.println(teacher);
        System.out.println(informatik);

        pourya.setId(2);
        pourya.setName("Pourya");
        pourya.setAddress("Tehran");
        pourya.setGrade(2);
        System.out.println(pourya.toString());

        Student ali = Student.builder()
                .id(2)
                .name("Ali")
                .address("Ilam")
                .grade(1)
                .build();

        Teacher teacher2 = Teacher.builder()
                .id(2)
                .name("Teacher2")
                .subject("Mathematik")
                .build();

        Course mathematik = Course.builder()
                .id(2)
                .name("Mathematik")
                .teacher(teacher2)
                .students(new ArrayList<Student>(List.of(pourya,ali)))
                .build();

        System.out.println(ali);
        System.out.println(teacher2);
        System.out.println(mathematik);
    }
}
