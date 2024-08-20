//package api.endpoints;
//
//
//import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//
//import static io.restassured.RestAssured.given;
//
//import api.payloads.User;
//
//
//public class UsersEndPoints {
//	
//	
//		
//		public static Response createUser1(User payload)
//		{
//			Response response = given()
//			  .contentType(ContentType.JSON)
//			  .accept(ContentType.JSON)
//			  .body(payload)
//			 .when()
//			    .post(Routes.post_url_1);
//			
//			 return response;
//		}
//		
//		
//		
//		public static Response readUser1(int ID1)
//		{
//			Response response = given()
//			  .pathParam("ID1", ID1)
//			 .when()
//			    .get(Routes.get_url_1);
//			
//			 return response;
//		}
//		
//		
//		
//		public static Response createUser2(User payload)
//		{
//			Response response = given()
//			  .contentType(ContentType.JSON)
//			  .accept(ContentType.JSON)
//			  .body(payload)
//			 .when()
//			    .post(Routes.post_url_2);
//			
//			 return response;
//		}
//		
//		
//		
//		public static Response readUser1and2(int ID1, int ID2) {
//	        Response response = given()
//	                .queryParam("ID1", ID1)
//	                .queryParam("ID2", ID2)
//	                .when()
//	                .get(Routes.get_url_updated_one_and_two); 
//	            
//	        return response;
//	    }
//		
//		
//		
//
//		
//		public static Response updateUser(int ID2)
//		{
//			Response response = given()
//			  .contentType(ContentType.JSON)
//			  .accept(ContentType.JSON)
//			  .pathParam("ID2", ID2)
//			 .when()
//			    .put(Routes.update_url_2);
//			
//			 return response;
//		}
//		
//		
//		
//		
//		
//		
//		
//		public static Response deleteUser(int ID2)
//		{
//			Response response = given()
//			       .pathParam("ID2", ID2)
//			 .when()
//			    .delete(Routes.delete_url);
//			
//			 return response;
//		}
//		
//		
//		
//		
//		public static Response readUser2(int ID2)
//		{
//			Response response = given()
//			  .pathParam("ID2", ID2)
//			 .when()
//			    .get(Routes.get_url_updated);
//			
//			 return response;
//		}
//	    
//		
//		
//		
//		
//		
//	
//
//}












//package api.endpoints;
//
//import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//import static io.restassured.RestAssured.given;
//import api.payloads.User;
//
//public class UsersEndPoints {
    // Static variable to store the ID
//      private static int storedID1;
//    private static int storedID2;
    
//    public static Response createUser1(User payload) {
//        Response response = given()
//            .contentType(ContentType.JSON)
//            .accept(ContentType.JSON)
//            .body(payload)
//            .when()
//            .post(Routes.post_url_1);
//        
//        // Extract the ID from the response and store it
//        storedID1 = response.jsonPath().getInt("id");
//        
//        return response;
//    }
    
    
    
    
    
//    public static Response readUser1() {
//        Response response = given()
//            .pathParam("ID1", storedID1)
//            .when()
//            .get(Routes.get_url_1);
//        
//        return response;
//    }
//    
//    public static Response createUser2(User payload) {
//        Response response = given()
//            .contentType(ContentType.JSON)
//            .accept(ContentType.JSON)
//            .body(payload)
//            .when()
//            .post(Routes.post_url_2);
        
//        // Extract the ID from the response and store it
//        storedID2 = response.jsonPath().getInt("id");
//        
//        return response;
//    }
//    
//    public static Response readUser1and2() {
//        Response response = given()
//            .queryParam("ID1", storedID1)
//            .queryParam("ID2", storedID2)
//            .when()
//            .get(Routes.get_url_updated_one_and_two);
//        
//        return response;
//    }
//    
//    public static Response updateUser() {
//        Response response = given()
//            .contentType(ContentType.JSON)
//            .accept(ContentType.JSON)
//            .pathParam("ID2", storedID2)
//            .when()
//            .put(Routes.update_url_2);
//        
//        return response;
//    }
//    
//    public static Response deleteUser() {
//        Response response = given()
//            .pathParam("ID2", storedID2)
//            .when()
//            .delete(Routes.delete_url);
//        
//        return response;
//    }
//    
//    public static Response readUser2() {
//        Response response = given()
//            .pathParam("ID2", storedID2)
//            .when()
//            .get(Routes.get_url_updated);
//        
//        return response;
//    }
	
	
	
	
	
	
	
package api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import api.payloads.User;

public class UsersEndPoints {
    // Static variable to store the ID
    private static final String storedID1 = "ff8081819168f52b01916aa457db03f3";
    private static final String storedID2 = "ff8081819168f52b01916aa45ba403f4";

    
    
    public static Response createUser1(User payload) {
        return given()
            .contentType(ContentType.JSON)
            .accept(ContentType.JSON)
            .body(payload)
            .when()
            .post(Routes.post_url_1);
    }

    public static Response readUser1() {
        return given()
            .pathParam("id", storedID1)
            .when()
            .get(Routes.get_url_1);
    }
    
    
    
    public static Response createUser2(User payload) {
        return given()
            .contentType(ContentType.JSON)
            .accept(ContentType.JSON)
            .body(payload)
            .when()
            .post(Routes.post_url_2);
    }
    
    
    
    
    public static Response readUsers1and2() {
        return given()
            .queryParam("id", storedID1)
            .queryParam("id", storedID2)
            .when()
            .get(Routes.get_url_updated_one_and_two);
    }
//    
//    
//    
//    public static Response updateUser2(User payload) {
//        // Logging the request details
//        System.out.println("Updating user with ID: " + storedID2);
//        System.out.println("Request payload: " + payload);
//
//        return given()
//            .contentType(ContentType.JSON)
//            .accept(ContentType.JSON)
//            .body(payload)
//            .when()
//            .put(Routes.update_url_2.replace("{id}", storedID2));
//    }
//    
//    
//   
//    
//    
//    
    public static Response readUser2() {
        return given()
            .pathParam("id", storedID2)
            .when()
            .get(Routes.get_url_2);
    }
//    
//    
//    
//    
//    
//    
//    
//    
//    public static Response deleteUser2() {
//        return given()
//            .pathParam("id", storedID2)
//            .when()
//            .delete(Routes.delete_url);
//    }
//    
//    
//    
//    public static Response readuser2afterdelete() {
//        return given()
//            .pathParam("id", storedID2)
//            .when()
//            .get(Routes.get_url_updated);
//    }
//    
//    
//    
//    
//    
//    
//  public static Response deleteUser1() {
//  return given()
//      .pathParam("id", storedID1)
//      .when()
//      .delete(Routes.delete_url_1);
//}
//
//
//
//public static Response readuser1afterdelete() {
//  return given()
//      .pathParam("id", storedID1)
//      .when()
//      .get(Routes.get_url_updated_1);
//}  
//    
//    
//    
//    
//    
//  
//
//
    
    
    public static String getStoredID1() {
        return storedID1;
    }
    
    
    public static String getStoredID2() {
        return storedID2;
    }
    
    
}
