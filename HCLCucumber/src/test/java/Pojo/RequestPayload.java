package Pojo;

import java.util.List;

public class RequestPayload {
    private String name;
    private Data data;

    // Getters and Setters
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

    @Override
    public String toString() {
        return "RequestPayload{" +
                "name='" + name + '\'' +
                ", data=" + data +
                '}';
    }
}
