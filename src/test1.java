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
        encodeClass encode = new encodeClass();
        decodeClass decode = new decodeClass();

        encode.encode();
        decode.decode();

    }





}