package jacksonLearn;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Iterator;

public class JackSonTreeModel {

    public static void main(String[] args) throws JsonProcessingException {
        final String jsonString =  "{\"name\":\"gokul\", \"employeeId\":21, \"dob\":\"1993-04-28\"" +
                ", \"bu\" : \"test123\" }";

        String jsonString1 = "{\"name\":\"Mahesh Kumar\",  \"age\":{\"realAge\" : 22},\"verified\":false,\"marks\": [100,90,85]}";

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(jsonString);
        JsonNode rooter = mapper.readTree(jsonString1);
        System.out.println(root.path("name").textValue());
        JsonNode empId = root.path("employeeId");
        JsonNode booleanVal = root.path("verified");
        JsonNode test = rooter.at("/age/realAge");
        System.out.println("age:" + test.intValue());
        JsonNode marksNode = rooter.path("marks");
        JsonNode abc = rooter.get("marks");
        System.out.println("abc->" + abc.intValue());

        Iterator<JsonNode> marksIterator = marksNode.elements();
        while (marksIterator.hasNext()){
            JsonNode mark = marksIterator.next();
            System.out.printf("marks ->" + mark.intValue());
        }
    }
}
