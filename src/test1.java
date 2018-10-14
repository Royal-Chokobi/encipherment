import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class test1{
    public static void main(String[] args) {

       /* int n = 150;
        System.out.println(Integer.toBinaryString(n));  //returns 10010110

        byte b = (byte) n;
        System.out.println(b);          // returns -106
        System.out.println(b & 0xff);   // returns  150
        System.out.println((int) '안');   // returns  72
        System.out.println((int) 'a');   // returns  97
        System.out.println((char) 50504);   // returns  안
        System.out.println((char) 50504&0xff);   // returns  72
        System.out.println(Integer.toBinaryString(50504));  //returns 1100010101001000
        System.out.println(Integer.toHexString(50504));  //returns c548
        System.out.println(Integer.toHexString(50504&0xff));  //returns 48

        System.out.println("===============================================================");

        System.out.println((int) '안');   // returns  50504
        System.out.println(Integer.toString(50504, 16));  //returns c548

        System.out.println("===============================================================");

        System.out.println((char)Integer.parseInt("c548", 16));  //returns 안
        System.out.println(Integer.toString('안', 16));  //returns c548*/
       // System.out.println((int)'c548');  //returns 안

        //System.out.println((char)singleCh);  //returns c548

        encode();
        decode();
    }

    public static void encode(){
        try{
            File file = new File("C:\\IdeaProjects\\test\\src\\sample.txt");
            FileReader filereader = new FileReader(file);
            int ch_txt = 0;
            String txt = "";
            while((ch_txt = filereader.read()) != -1){

                if(((char)ch_txt == '\r') || ((char)ch_txt == '\n')){
                    //System.out.print("=====================");
                   // System.out.print("\n");
                }else{
                    //System.out.print((char)singleCh);
                   // System.out.println(Integer.toString((char)singleCh, 16));
                    txt += Integer.toString((char)ch_txt, 16)+" ";
                }


                // System.out.print((char)singleCh);
                //System.out.println(Integer.toString((char)singleCh, 16));  //returns c548
            }
            System.out.println(txt);
            filereader.close();
        }catch (FileNotFoundException e) {
            // TODO: handle exception
        }catch(IOException e){
            System.out.println(e);
        }
    }

    public static void decode(){
        try{
            File file = new File("C:\\IdeaProjects\\test\\src\\sample1.txt");

            FileReader filereader = new FileReader(file);
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";

            while((line = bufReader.readLine()) != null){
                String[] txt = line.split(" ");
                   // System.out.println(line);  //returns c548
                    for(int i =0; i< txt.length; i++){
                        System.out.print((char)Integer.parseInt(txt[i], 16));  //returns c548
                    }
                System.out.print("\n");
            }
            bufReader.close();
        }catch (FileNotFoundException e) {
            // TODO: handle exception
        }catch(IOException e){
            System.out.println(e);
        }
    }

}