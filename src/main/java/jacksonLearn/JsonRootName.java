package jacksonLearn;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import jacksonLearn.Model.CollegeStdRootName;

public class JsonRootName {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);

        CollegeStdRootName std = new CollegeStdRootName();
        std.setName("name");
        std.setAge("123");
        std.setDept("CSE");

        String json = mapper.writeValueAsString(std);
        System.out.println(json);
    }
}
