import java.io.*;

public class decodeClass {

    public void decode(){
        try{
            File file = new File("C:\\in_workspace\\encipherment\\txt_file\\decode.txt");

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
