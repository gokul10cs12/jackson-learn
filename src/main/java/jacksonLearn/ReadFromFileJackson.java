package jacksonLearn;

import com.fasterxml.jackson.databind.ObjectMapper;
import jacksonLearn.Model.Employee;

import java.io.File;
import java.io.IOException;

public class ReadFromFileJackson {
    public static void main(String[] args) throws IOException {
        System.out.println("Test");

        Employee employee = new Employee();
        employee.setBU("NW");
        employee.setEmployeeId("123");
        employee.setName("things");
        employee.setDOB("28-04-1993");

        ReadFromFileJackson readAndWrite = new ReadFromFileJackson();

        Employee readJson = readAndWrite.readFromJSON();
        System.out.println( readJson);

        readAndWrite.writToJSON(employee);

        readJson = readAndWrite.readFromJSON();

        System.out.println(readJson);

    }

    private Employee readFromJSON() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File("src/main/resources/Employee.json"), Employee.class);
    }
    private void writToJSON(Employee employee) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("src/main/resources/Employee.json"), employee);
    }

}
