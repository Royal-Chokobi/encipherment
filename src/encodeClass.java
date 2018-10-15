import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

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

                if(((char)ch_txt == '\r') || ((char)ch_txt == '\n')){
                    //System.out.print("=====================");
                    // System.out.print("\n");
                }else{
                    //System.out.print((char)singleCh);
                    // System.out.println(Integer.toString((char)singleCh, 16));
                    String char_txt_16= Integer.toString((char)ch_txt, 16);

                    if(char_txt_16.equals("2e")){
                        txtArray.add(char_txt_16);
                        txtMap.put(lineNum, txtArray.toString());
                        txtArray.clear();
                        //txtArray[lineNum] += char_txt_16;
                        lineNum++;

                    }else{
                        txtArray.add(char_txt_16+" ");
                       // txtArray[lineNum] += char_txt_16+" ";
                    }
                    txt += Integer.toString((char)ch_txt, 16)+" ";
                }


                // System.out.print((char)singleCh);
                //System.out.println(Integer.toString((char)singleCh, 16));  //returns c548
            }

            System.out.println(txt);
            System.out.println(txtMap.toString());
            System.out.println(txtArray.toString());
            filereader.close();
        }catch (FileNotFoundException e) {
            // TODO: handle exception
        }catch(IOException e){
            System.out.println(e);
        }
    }

}
