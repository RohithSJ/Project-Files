package Pojo;




import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class ResponsePayloadDeserializer extends JsonDeserializer<ResponsePayload> {

    @Override
    public ResponsePayload deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {
        JsonNode node = jp.getCodec().readTree(jp);
        ResponsePayload responsePayload = new ResponsePayload();

        responsePayload.setId(node.get("id").asText());
        responsePayload.setName(node.get("name").asText());
        responsePayload.setCreatedAt(node.get("createdAt").asText());

        // Handle nested data object
        JsonNode dataNode = node.get("data");
        if (dataNode != null) {
            Data data = new ObjectMapper().treeToValue(dataNode, Data.class);
            responsePayload.setData(data);
        }

        return responsePayload;
    }
}
