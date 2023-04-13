package jacksonLearn.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    String name;
    String employeeId;
    String DOB;
    String BU;

    Employee(){}
}
