import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Course {
    int id;
    String name;
    Teacher teacher;
    Student students;
}