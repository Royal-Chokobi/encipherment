import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Ag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encode();
		/*
		try{
		String str = "안녕하세요_hello_world";
		Encoder encoder = Base64.getEncoder();
		Decoder decoder = Base64.getDecoder();
		
		
		
		
		 
	            File file = new File("C:\\IdeaProjects\\test\\src\\encode.txt");
	            FileReader filereader = new FileReader(file);
	            BufferedReader bufReader = new BufferedReader(filereader);
	            String line = "";
	           
	            while((line = bufReader.readLine()) != null){
	                //System.out.println(line);
	            	byte[] decodeByte = decoder.decode(line);
	            	System.out.println(new String(decodeByte));
	                byte[] encodeByte = encoder.encode(line.getBytes());
	                String res = "";
	                String token = "";
	               *//* for( int i=0; i < encodeByte.length; i++){
	                	System.out.println(encodeByte[i]);
	                    token = Integer.toHexString(encodeByte[i] );
	                    byte[] ba = new byte[token.length() / 2];

	                    if(token.length() > 2){
	                        token = token.substring( token.length() - 2 );
	                    }else{
	                        for(int j = 0 ; j < 2 - token.length(); j++){
	                            token = "0" + token;
	                        }
	                    }
	                    res += token+" ";
	                    for (int z = 0; z < ba.length; z++) {
	                    //	System.out.println("bite : "+(byte) Integer.parseInt(token.substring(2 * z, 2 * z + 2), 16));
	                    }
	                    
	                  
	                }*//*
	                
	        		//System.out.println(res);
	        		//System.out.println(new String(encodeByte));
	                //System.out.println(encodeByte);
	        	//	 byte[] encodeByte = encoder.encode(line.getBytes());
	        		//byte[] decodeByte = decoder.decode(encodeByte);
	        	//	System.out.println(new String(decodeByte));
	                
	                
	            }
	           
	            bufReader.close();
	        }catch (FileNotFoundException e) {
	            // TODO: handle exception
	        }catch(IOException e){
	            System.out.println(e);
	        }*/
		

	}
	
	
	public static String encode() {
		
		
		try{
			Encoder encoder = Base64.getEncoder();
			
            File file = new File("C:\\IdeaProjects\\test\\src\\encode.txt");
            FileReader filereader = new FileReader(file);
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";

            while((line = bufReader.readLine()) != null){

				//(char)Integer.parseInt("c548", 16);
				//System.out.println((char)Integer.parseInt(line.toString(), 16));
                byte[] encodeByte = encoder.encode(line.getBytes());

                String res = "";
                String token = "";
                
                for( int i=0; i < encodeByte.length; i++){

                    token = Integer.toHexString( 0xff & encodeByte[i] );

                    if(token.length() > 2){
                        token = token.substring( token.length() - 2 );
                    }else{
                        for(int j = 0 ; j < 2 - token.length(); j++){
                            token = "0" + token;
                        }
                    }
                    res += token+":";
                }
                
        		System.out.println(res);
        		//dencode(res);
        		//System.out.println(new String(encodeByte));
                //System.out.println(encodeByte);
        	
        		//System.out.println(new String(decodeByte));
                
            }
           
            bufReader.close();
        }catch (FileNotFoundException e) {
            // TODO: handle exception
        }catch(IOException e){
            System.out.println(e);
        }
		
		
		return "";
		
	}
	
	public static String dencode(String res) throws IOException {
		
		
		Decoder decoder = Base64.getDecoder();
		String[] txt = res.split(" ");
		//System.out.println(txt);
		
		for(int i= 0; i < txt.length; i++) {
			byte[] ba = hexStringToByteArray(txt[i]);
			byte[] decodeByte = decoder.decode(ba);
			System.out.println(new String(decodeByte));
		}
		
		
		//System.out.println(hexStringToByteArray(txt));
		//byte[] decodeByte = decoder.decode(ba);
		//System.out.println(new String(decodeByte));
		   
		    
		//	System.out.println(new String(decodeByte));
			//byte[] decodeByte = decoder.decode(encodeByte);
			//System.out.println(new String(decodeByte));
		
		
		return "";
		
	}


	private static byte[] hexStringToByteArray(String s) {
		// TODO Auto-generated method stub
		
		 int len = s.length();
		    byte[] data = new byte[len / 2];
		    for (int i = 0; i < len; i += 2) {
		        data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
		                             + Character.digit(s.charAt(i+1), 16));
		    }
		
		return data;
	}
	

}
