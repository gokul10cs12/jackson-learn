package jacksonLearn;

import com.fasterxml.jackson.databind.ObjectMapper;
import jacksonLearn.Model.Employee;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBindingLearn {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        List<String> positions = List.of("dev","dev2", "senior dev");

        Map<String, Object> employeeDetails= new HashMap<>();

        Employee employee = new Employee();
        employee.setBU("NW");
        employee.setEmployeeId("123");
        employee.setName("things");
        employee.setDOB("28-04-1993");

        employeeDetails.put("theEmployee", employee);
        employeeDetails.put("company", "RSA");
        employeeDetails.put("positionsFilled", positions);
        employeeDetails.put("age", 26);
        employeeDetails.put("fullTime", true);

        mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/resources/Employee.json"), employeeDetails);
        Map<String, Object> jsonResult = mapper.readValue(new File("src/main/resources/Employee.json"), Map.class);

        System.out.println(jsonResult);


    }
}
