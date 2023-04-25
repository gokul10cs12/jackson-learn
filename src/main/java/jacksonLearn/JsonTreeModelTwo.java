package jacksonLearn;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
* Json Tree model prepares the in memory representation of the JSON document
 * ObjectMapper build tree of JsonNode
* */
public class JsonTreeModelTwo {

    public static void main(String[] args) throws JsonProcessingException {
        String jsonString =  "{\"name\":\"gokul\", \"employeeId\":21, \"dob\":\"1993-04-28\"" +
                ", \"bu\" : \"test123\" }";
        ObjectMapper mapper = new ObjectMapper();

        //convert json string to a Json Node
        JsonNode root = mapper.readTree(jsonString);

        JsonNode name = root.get("name"); // will get that particular field alone
        System.out.println(name.textValue());

        JsonNode namePath = root.path("name"); // go to the particular path if more deep in the json
        System.out.println(namePath.textValue());

        //get value from a specific path
        JsonNode pathName = root.at("/name");
        System.out.println(pathName.textValue());
    }
}
