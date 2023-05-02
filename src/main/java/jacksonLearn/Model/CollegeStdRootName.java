package jacksonLearn.Model;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;

@Data
@JsonRootName(value = "Batman")
public class CollegeStdRootName {
    String name;
    String dept;
    String age;
}
