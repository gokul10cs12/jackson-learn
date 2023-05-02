package jacksonLearn;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jacksonLearn.Model.Student;

public class JsonPropertyOrder {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        Student student = new Student();
        student.setAge("23");
        student.setName("Gokul");
        student.setDepartment("CSE");


        String json = mapper.writeValueAsString(student);
        System.out.println(json);

    }
}
