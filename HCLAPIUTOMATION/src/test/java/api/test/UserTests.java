
package api.test;

import api.endpoints.Routes;
import api.endpoints.UsersEndPoints;
import api.payloads.User;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;



import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserTests {

    private User user1;
    private User user2;
    
    
    public Logger logger; //for logs

    @BeforeClass
    public void setup() {
        // Initialize user1 and user2 payloads
        user1 = new User();
        user1.setName("Google Pixel 6 Pro");
        user1.setData(new User.Data(2022, new User.DeviceType[] {
            new User.DeviceType("64 GB", 59999.99, new String[]{"Red", "Black", "Brown"}),
            new User.DeviceType("128 GB", 69999.99, new String[]{"Red", "Black"})
        }));
        
        
        user2 = new User();
        user2.setName("Apple iPhone 12 Pro Max");
        user2.setData(new User.Data(2022, new User.DeviceType[] {
            new User.DeviceType("32 GB", 79999.99, new String[]{"Blue", "Green", "White"}),
            new User.DeviceType("64 GB", 89999.99, new String[]{"Orange", "Black"})
        }));
        
     

        
        
        //logs
        
        logger = LogManager.getLogger(this.getClass());

    }

    
    
    
    
//    @Test(priority=1)
//    public void testCreateUser1() {
//    	
//    	logger.info("*********Creating User 1 **********");
//    	
//    	
//        Response response = UsersEndPoints.createUser1(user1);
//        assertEquals(response.getStatusCode(), 200); // assuming 201 is the expected status code for creation
//        
//     // Print the response body
//        System.out.println("Response body: " + response.getBody().asString());
//
//        // Store the value of ID for future use
//        String updatedID = response.jsonPath().getString("id");
//        System.out.println("Updated ID: " + updatedID);
//        
//    	logger.info("*********User1 is created**********");
//
//    }
    
    
    
    
//    @Test(priority=2)
//    public void testReadUser1() {
//    	
//    	logger.info("*********Reading User info**********");
//
//        Response response = UsersEndPoints.readUser1();
//        assertEquals(response.getStatusCode(), 200);
//        
//    	logger.info("*********User info displayed**********");
//
//    }
//    
    
    
    
    
    
//    @Test(priority=3)
//    public void testCreateUser2() {
//    	
//    	logger.info("*********Creating User 2**********");
//
//        Response response = UsersEndPoints.createUser2(user2);
//        assertEquals(response.getStatusCode(), 200); // assuming 201 is the expected status code for creation
//        
//     // Print the response body
//        System.out.println("Response body: " + response.getBody().asString());
//
//        // Store the value of ID for future use
//        String updatedID = response.jsonPath().getString("id");
//        System.out.println("Updated ID: " + updatedID);
//        
//    	logger.info("*********User2 is created**********");
//
//    }
   
    
  
    
    @Test(priority=4)
    public void testReadUsers1and2() {
    	
    	logger.info("*********Read Users 1 and 2**********");

        Response response = UsersEndPoints.readUsers1and2();
        assertEquals(response.getStatusCode(), 200);

        // Validate the response contains the expected users
        String name1 = response.jsonPath().getString("[0].name");
        String name2 = response.jsonPath().getString("[1].name");

        assertEquals(name1, "Google Pixel 6 Pro");
        assertEquals(name2, "Apple iPhone 12 Pro Max");
        
    	logger.info("*********Users 1 and 2 info displayed**********");

    }
    
    
    
    
    
//    @Test(priority = 5)
//    public void testUpdateUser2() {
//        user2.setData(new User.Data(2023, new User.DeviceType[] {
//            new User.DeviceType("32 GB", 79999.99, new String[]{"Blue", "Green"}),
//            new User.DeviceType("64 GB", 89999.99, new String[]{"Orange", "Black"})
//        }));
//        
//        
//    	logger.info("*********User 2 updated**********");
//
//        
//        Response response = UsersEndPoints.updateUser2(user2);
//        assertEquals(response.getStatusCode(), 200);
//
//        // Print the response body
//        System.out.println("Response body: " + response.getBody().asString());
//
//        // Store the value of ID for future use
//        String updatedID = response.jsonPath().getString("id");
//        System.out.println("Updated ID: " + updatedID);
//        
//    	logger.info("*********User 2 updated displayed**********");
//
//    }
//    
//    
//    
//    
    @Test(priority=6)
    public void testReadUser2() {
    	
    	logger.info("*********User 2 read**********");

        Response response = UsersEndPoints.readUser2();
        assertEquals(response.getStatusCode(), 200);
        
    	logger.info("*********User 2 read info diaplayed**********");

    }
//    
//    
//    
//    
//    @Test(priority=7)
//    public void testdeleteUser2() {
//    	
//    	logger.info("*********User 2 delete**********");
//
//    	
//        Response response = UsersEndPoints.deleteUser2();
//        assertEquals(response.getStatusCode(), 200);
//        
//    	logger.info("*********User 2 info deleted**********");
//
//    }
//    
//    
//
//    
//    
//    @Test(priority=8)
//    public void testreaduser2afterdelete() {
//    	
//    	logger.info("********* Read User 2 after delete**********");
// 
//        Response response = UsersEndPoints.readuser2afterdelete();
//        assertEquals(response.getStatusCode(), 404);
//        
//    	logger.info("*********Read User 2 after delete info displayed**********");
//
//    }
// 
//    
//    
//    
//   
//    
//    
//  @Test(priority=9)
//  public void testdeleteUser1() {
//  	
//  	logger.info("*********User 1 delete**********");
//
//  	
//      Response response = UsersEndPoints.deleteUser1();
//      assertEquals(response.getStatusCode(), 200);
//      
//  	logger.info("*********User 1 info deleted**********");
//
//  }
//  
//  
//
//  
//  
//  @Test(priority=10)
//  public void testreaduser1afterdelete() {
//  	
//  	logger.info("********* Read User 1 after delete**********");
//
//      Response response = UsersEndPoints.readuser1afterdelete();
//      assertEquals(response.getStatusCode(), 404);
//      
//  	logger.info("*********Read User 1 after delete info displayed**********");
//
//  }
    
  
    
    

}
