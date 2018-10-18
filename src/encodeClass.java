import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Base64.Decoder;

public class encodeClass {

    public void encode(){
        try{
            File file = new File("C:\\in_workspace\\encipherment\\txt_file\\encode.txt");
            FileReader filereader = new FileReader(file);
            int ch_txt = 0;
            String txt = "";
            HashMap<Integer, String> txtMap = new HashMap<>();
            ArrayList<String> txtArray = new ArrayList<>();
            ArrayList<String> copy_txtArray = new ArrayList<>();
            int lineNum = 0;

            while((ch_txt = filereader.read()) != -1){
                //System.out.println(ch_txt);
                if(((char)ch_txt == '\r') || ((char)ch_txt == '\n')){
                    //System.out.print("=====================");
                    // System.out.print("\n");
                }else{
                    //System.out.print((char)singleCh);
                    // System.out.println(Integer.toString((char)singleCh, 16));
                    String char_txt_16= Integer.toString((char)ch_txt, 16);

                    if(char_txt_16.equals("2e")){
                        txtArray.add(char_txt_16);
                        txt += char_txt_16;
                        txtMap.put(lineNum, txt);
                        txtArray.clear();
                        txt="";
                        lineNum++;

                    }else{
                        txt += char_txt_16+" ";
                        txtArray.add(char_txt_16);
                    }
                   //txt += char_txt_16+" ";
                }


                // System.out.print((char)singleCh);
                //System.out.println(Integer.toString((char)singleCh, 16));  //returns c548
            }

            //System.out.println(txt);
           // Encoder encoder = Base64.getEncoder();
           // Decoder decoder = Base64.getDecoder();

            //	 byte[] encodeByte = encoder.encode(line.getBytes());
            //  byte[] decodeByte = decoder.decode(encodeByte);
            //	System.out.println(new String(decodeByte));

            Base64.Encoder Bs64_encoder = Base64.getEncoder();

            for(int i = 0; i < txtMap.size(); i++){
               // Integer.decode(txtMap.get(i));

                //txtMap.get(i);
              //  byte[] encodeByte = encoder.encode(txtMap.get(i).getBytes());
             //   System.out.println(txtMap.get(i));

                String target = txtMap.get(i);
                byte[] encodeBytes = target.getBytes("UTF-8");
                String encodedString = Bs64_encoder.encodeToString(encodeBytes);

                System.out.println(encodedString);

               // System.out.println(encoder.encode(txtMap.get(i)));
            }
           // System.out.println(txtArray.toString());
            filereader.close();
        }catch (FileNotFoundException e) {
            // TODO: handle exception
        }catch(IOException e){
            System.out.println(e);
        }
    }

}
