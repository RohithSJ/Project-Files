package EncodeandDecode;

import org.apache.commons.codec.binary.Base64;

public class EncodeAndDecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "test123";
		
		byte[] encodedString = Base64.encodeBase64(str.getBytes());
		System.out.println("encoded string:"+ new String(encodedString));
		
		byte[] decodedString = Base64.decodeBase64(encodedString);
		System.out.println("Decoded string:"+ new String(decodedString));
		

	}

}
