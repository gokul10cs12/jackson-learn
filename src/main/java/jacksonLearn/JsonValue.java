package jacksonLearn;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jacksonLearn.Model.CollegeStd;

public class JsonValue {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        CollegeStd std = new CollegeStd();
        std.setName("name");
        std.setAge("123");
        std.setDept("CSE");

        String json = mapper.writeValueAsString(std);
        System.out.println(json);
    }
}
