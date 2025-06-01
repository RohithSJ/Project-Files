package Test1;

public class CartAPITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			

		    @Test
		    public void testApplyFlatXOffer() {
		        // Add FLATX offer
		        given()
		            .contentType(ContentType.JSON)
		            .body("{ \"restaurant_id\": 1, \"offer_type\": \"FLATX\", \"offer_value\": 10, \"customer_segment\": [\"p1\"] }")
		        .when()
		            .post("/api/v1/offer")
		        .then()
		            .statusCode(200);

		        // Apply offer to the cart
		        Response response = given()
		            .contentType(ContentType.JSON)
		            .body("{ \"cart_value\": 200, \"user_id\": 1, \"restaurant_id\": 1 }")
		        .when()
		            .post("/api/v1/cart/apply_offer");

		        // Verify the response
		        assertEquals(190, response.jsonPath().getInt("cart_value"));
		    }

		    @Test
		    public void testApplyFlatXPerOffer() {
		        // Add FLATXPER offer
		        given()
		            .contentType(ContentType.JSON)
		            .body("{ \"restaurant_id\": 1, \"offer_type\": \"FLATXPER\", \"offer_value\": 20, \"customer_segment\": [\"p1\"] }")
		        .when()
		            .post("/api/v1/offer")
		        .then()
		            .statusCode(200);

		        // Apply offer to the cart
		        Response response = given()
		            .contentType(ContentType.JSON)
		            .body("{ \"cart_value\": 200, \"user_id\": 1, \"restaurant_id\": 1 }")
		        .when()
		            .post("/api/v1/cart/apply_offer");

		        // Verify the response
		        assertEquals(180, response.jsonPath().getInt("cart_value"));
		    }

		    // Add more test cases for different scenarios as per the given requirements
		}

		
		
		

	}

}
