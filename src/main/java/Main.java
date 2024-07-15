public class Main {
    public static void main(String[] args) {
        Student pourya = new Student(1,"pourya","Hamburg",1);
        Teacher teacher = new Teacher(1,"teacher","Informatik");
        Course informatik = new Course(1,"Informatik",teacher,pourya);

        System.out.println(pourya);
        System.out.println(teacher);
        System.out.println(informatik);

        pourya.setId(2);
        pourya.setName("Pourya");
        pourya.setAddress("Tehran");
        pourya.setGrade(2);
        System.out.println(pourya.toString());
    }
}
