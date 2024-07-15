import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.With;

@Data
@AllArgsConstructor
@Builder
@With
public class Student {
    private int id;
    private String name;
    private String address;
    private int grade;
}