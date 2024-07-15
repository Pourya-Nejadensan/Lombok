import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.With;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
@With
public class Course {
    int id;
    String name;
    Teacher teacher;
    List<Student> students;
}