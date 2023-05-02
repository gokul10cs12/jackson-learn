package jacksonLearn;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jacksonLearn.Model.TestModel;

import java.util.Map;

public class JacksonMain {

    public static void main(String[] args) throws JsonProcessingException {

        String jsonString = "{\"name\":\"SampleJavaBean\",\"key1\":\"val1\",\"key2\":\"val2\"}";

        ObjectMapper mapper = new ObjectMapper();
        TestModel test = new TestModel("System");
        test.add("name", "Gokul");
        test.add("age", "27");

        String json = mapper.writeValueAsString(test);
        System.out.println(json);

        ObjectMapper mapper2 = new ObjectMapper();
        TestModel model = mapper.readValue(jsonString, TestModel.class);

        Map<String, String> mapperMap = model.myProperties();

        mapperMap.forEach((k,v) ->
                System.out.println(k + " "+ v));

        String resultJson = mapper2.writeValueAsString(model);

        System.out.println(resultJson);

    }
}
