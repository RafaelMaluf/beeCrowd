import java.util.Scanner;
import java.io.IOException;
public class ListaTel {
 
    public static void main(String[] args) throws IOException {
 
       Scanner sc = new Scanner(System.in);
       
       
       while (sc.hasNext()){
           int count = 0;
           int n = Integer.parseInt(sc.nextLine());
           String [] num = {" "," "};
       for(int i = 0; i < n; i ++){

           num[i] = sc.nextLine();

       }
       
      for(int k = 0; k < n - 1; k++){
         for(int j = 0; j < num[0].length(); j ++){

             if(num[k].charAt(j) == num[k+1].charAt(j)){
                 count++;
             }
         }
        
      }
      
       System.out.println(count);
    }
    sc.close();
}
}