package jacksonLearn.Model;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jacksonLearn.CustomDateSerializer;
import lombok.Data;

import java.util.Date;

@Data
public class SerialiseStd {

    String name;
    String age;

    @JsonSerialize(using = CustomDateSerializer.class)
    Date dob;
}
