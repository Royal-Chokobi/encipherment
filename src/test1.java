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
        algorithmClass algorithm = new algorithmClass();

        System.out.println("=========================암호화===========================");
        encode.encode();
        System.out.println("=========================복호화===========================");
        decode.decode();
        System.out.println("===================타원알고리즘===========================");
        algorithm.algorithmDecode();


        /*String t = new String();
        char tt = 'a';

        System.out.println( Integer.parseInt("c548", 16) );
        System.out.println( 50504 >> 1);
        System.out.println( (int)('씀'));
        System.out.println( (int)('Ɗ') << 7);
        System.out.println( Integer.toOctalString('1') );
        //Integer.getInteger(Integer.toBinaryString('안'),16);
        //Integer.toBinaryString('안')



        String target = "c758 bbf8 b97c 20 c54c 20 c218 20 c5c6 b294 20 d615 c2dd 28 c554 d638 bb38 29 c73c b85c 20 c815 bcf4 b97c 20 bcc0 d658 d558 b294 20 ac83 2e";
        byte[] targetBytes = target.getBytes("UTF-8");

        // Base64 인코딩 ///////////////////////////////////////////////////
        Base64.Encoder encoder = Base64.getEncoder();

        // Encoder#encode(byte[] src) :: 바이트배열로 반환
       *//* byte[] encodedBytes = encoder.encode(targetBytes);
        System.out.println("new String(encodedBytes) = "+new String(encodedBytes));*//*

        // Encoder#encodeToString(byte[] src) :: 문자열로 반환
        String encodedString = encoder.encodeToString(targetBytes);
        System.out.println("encoder.encodeToString(targetBytes) = "+encodedString);

        // Base64 디코딩 ///////////////////////////////////////////////////
        Base64.Decoder decoder = Base64.getDecoder();

        // Decoder#decode(bytes[] src)
      //  byte[] decodedBytes1 = decoder.decode(encodedBytes);
        // Decoder#decode(String src)
        byte[] decodedBytes2 = decoder.decode(encodedString);

        // 디코딩한 문자열을 표시
      //  String decodedString = new String(decodedBytes1, "UTF-8");
        //System.out.println(decodedString);

        System.out.println(new String(decodedBytes2, "UTF-8"));


       *//* byte[] decodedBytes3 = decoder.decode(new String(decodedBytes2, "UTF-8"));

        System.out.println(new String(decodedBytes3, "UTF-8"));*//*
*/
    }





}