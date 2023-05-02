package jacksonLearn;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jacksonLearn.Model.SerialiseStd;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class JsonSerializerTest {

    public static void main(String[] args) throws ParseException, JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleDateFormat simple = new SimpleDateFormat("dd-mm-yyy");
        SerialiseStd std = new SerialiseStd();
        std.setName("gokul");
        std.setAge("30");
        std.setDob(simple.parse("28-04-1993"));
        String json = mapper.writeValueAsString(std);
        System.out.println(json);
    }
}
