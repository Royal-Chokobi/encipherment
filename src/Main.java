import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/**
 * @author JYL
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 51712;
        int per = 0;
        int x = 2;    
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list= new ArrayList();
        int k = 0;
        int y = 0;
          for(int i = 0; num >= 1; i++){
             per = num%x;
             num = num/x;
             list.add(per);
          }
          System.out.println(list.toString());
          int leng = 0;
          boolean bool = false;
          for(int i= 0; i<list.size(); i++) {
        	  if(list.get(i) == 0) {
        		  if(list.get(0) == 0 && i == 0 ) {
        			  k = -1;
        		  }
                  map.put(k, ++y);
                  bool = true;
        	  }
        	  if(list.get(i) == 1) {
        		  k++;
        		  y=0;
        	  }     
          }
          
          for(Entry<Integer, Integer> entry : map.entrySet()){
  			int value = entry.getValue();
  			if(value > leng && value < list.size()-1 && entry.getKey() != -1) {
  				leng = value;
  			}
  			
          }
      
          if(!bool) {
        	  leng = 0;
          }
          
        System.out.println(leng);
          
          
          
            
	}

}
