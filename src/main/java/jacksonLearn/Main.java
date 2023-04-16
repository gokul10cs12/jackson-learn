package jacksonLearn;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jacksonLearn.Model.Employee;

public class Main {
    public static void main(String[] args) {
       String jsonString =  "{\"name\":\"gokul\", \"employeeId\":21, \"dob\":\"1993-04-28\"" +
               ", \"bu\" : \"test123\" }";

        ObjectMapper objectMapper = new ObjectMapper();

        try{
            //writing to class
            Employee employee = objectMapper.readValue(jsonString, Employee.class);
            System.out.println(employee.toString());
            String jsonStringNew = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
            jsonStringNew = objectMapper.writeValueAsString(employee);
            System.out.println(jsonStringNew);
            employee.setBU("fuckYOu");
            String newResultObject = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
            System.out.printf("newResukt:" + newResultObject);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}