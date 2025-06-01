package Pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = ResponsePayloadDeserializer.class)


public class ResponsePayload {
    private String id;
    
    private String name;
    
    private Data data;
    
    private String createdAt;
    

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
   

    public Data getData() {
        return data;
    }
    

    public void setData(Data data) {
        this.data = data;
    }
    
    
    public String getCreatedAt() {
    	  return createdAt;
    	}

    
    public void setCreatedAt(String createdAt) {
    	  this.createdAt = createdAt;
    	}


    @Override
    public String toString() {
        return "ResponsePayload{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", data=" + data +
                '}';
    }
}
