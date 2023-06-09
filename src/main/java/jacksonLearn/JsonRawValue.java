package jacksonLearn;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jacksonLearn.Model.Student;

public class JsonRawValue {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Student student = new Student();
        student.setName("gokul");
        student.setAge("123");
        student.setDepartment("{\"dept\" : \"cse\"}");

        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
        System.out.println(json);
    }
}
