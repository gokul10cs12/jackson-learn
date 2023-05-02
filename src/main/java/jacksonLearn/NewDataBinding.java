package jacksonLearn;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jacksonLearn.Model.Employee;

import java.util.HashMap;
import java.util.Map;

public class NewDataBinding {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> myMapper = new HashMap<>();
        Employee employee = new Employee();
        employee.setDOB("28-04-1993");
        employee.setEmployeeId("1234");
        employee.setName("Gokul");
        employee.setBU("NW");

        myMapper.put("Boolean", true);
        myMapper.put("Test", "1234");
        myMapper.put("employeDetail", employee);

        String writer = mapper.writeValueAsString(myMapper);

        Map<String, Object> reader = mapper.readValue(writer, Map.class);

        System.out.println(reader);

        System.out.println(writer);
    }
}
