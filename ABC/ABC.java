import java.io.FileNotFoundException;
import java.util.*;
public class ABC {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String [] l = sc.nextLine().split(" ");
            String s = sc.nextLine();
            char []c = new char[3];
            int [] f = new int[3];
            int [] t = new int[3];
            //TRANSFER STRING TO INT
            int i=0;
            for (String str : l) {f[i++] = Integer.parseInt(str);}
            //SORT INT ARRAY
            int temp;
            for(int x = 1;  x< f.length; x++){
                for(int y = x; y > 0; y--){
                    if(f[y]<f[y-1]){
                        temp = f[y];
                        f[y] = f[y-1];
                        f[y-1]= temp;
                    }
                }
            }
            //CREATE CHAR ARRAY
            for(int idx = 0; idx<3; idx++)
                c[idx] = s.charAt(idx);
        
            //ASSIGN VALUE
            int j=0;
            for (char str : c){
                if(j<3){
                    switch(str){
                        case 'A':
                            t[j]=f[0];
                            break;
                        case 'B':
                            t[j]=f[1];
                            break;
                        case 'C':
                            t[j]=f[2];
                            break;
                    }
                    j++;
                }
            }
            for(int a:t)  System.out.println(a);
    }
}

