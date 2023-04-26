package jacksonLearn.Model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;

public class TestModel {
    private String name;
    private Map<String, String> properties;

    public TestModel(){
        this.properties = new HashMap<>();
    }

    public TestModel(String tester){
        this.name = tester;
        this.properties = new HashMap<>();
    }

    public String getName() {
        return name;
    }
    @JsonAnyGetter
    public Map<String, String> myProperties() {
        return properties;
    }


    @JsonAnySetter
    public void add(String key, String value){
        this.properties.put(key, value);
    }


}
