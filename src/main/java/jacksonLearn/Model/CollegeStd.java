package jacksonLearn.Model;


import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;

@Data
public class CollegeStd {
    String name;
    String dept;
    @JsonValue
    String age;

    @JsonValue
    public String stringger() {
        return "name" + ":" + name;
    }
}
