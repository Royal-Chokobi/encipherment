import java.util.Random;

public class algorithmClass {

    public void algorithmDecode(){

        Random randomNum = new Random();
        int cnt=randomNum.nextInt(99)+1;

        int x_axis = randomNum.nextInt(10);
        int y_axis = randomNum.nextInt(10);
        int alpha = x_axis+1;
        int beta = y_axis+1;

        for (int i = 0; i < cnt; i++) {
            if(i%2 == 0){
                x_axis = (x_axis+alpha);
                alpha = (alpha >= 0) ? ((++alpha)*(-1)) : ((--alpha)*(-1));
            }else{
                y_axis = (y_axis+beta);
                beta = (beta >= 0) ? ((++beta)*(-1)) : ((--beta)*(-1));
            }
            System.out.println("x : "+x_axis + " y : "+ y_axis);
        }

    }

}
