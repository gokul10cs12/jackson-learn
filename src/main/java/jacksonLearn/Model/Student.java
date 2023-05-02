package jacksonLearn.Model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRawValue;
import lombok.Data;

@Data
@JsonPropertyOrder({"department", "age", "name",})
public class Student {

    String name;
    String age;
    @JsonRawValue
    String department;
}
