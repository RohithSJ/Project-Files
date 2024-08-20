package api.endpoints;

public class Routes {
	
public static String base_url = "https://api.restful-api.dev/objects";

	
	//User module
	
	public static String post_url_1 = base_url;
	public static String get_url_1 = base_url+"/{id}";
	public static String post_url_2 = base_url;
	public static String get_url_updated_one_and_two =  base_url ;  //Validating first and second record
	public static String update_url_2 = base_url+"/{id}";  //second record updated
	public static String get_url_2 = base_url+"/{id}";
	public static String delete_url = base_url+"/{id}"; //Validating second record deleted
	public static String get_url_updated = base_url+"/{id}";  //Validating second record fetched
	
	
	public static String delete_url_1 = base_url+"/{id}"; //Validating second record deleted
	public static String get_url_updated_1 = base_url+"/{id}";  //Validating second record fetched
	

	

}
