import java.util.Scanner;


public class TDA {
        public static void simplifica(int N, int D){
            while(N%2 == 0 && D%2 == 0){
                N = N/2;
                D = D/2;
            } 
            while(N%3 == 0 && D%3 == 0){
                N = N/3;
                D = D/3;
            } 
            System.out.println("= " + N+"/"+D);
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++){
        
            String input = sc.nextLine();
            String[] split = input.split(" ");
            int N1 = Integer.parseInt(split[0]);
            int N2 = Integer.parseInt(split[4]);
            int D1 = Integer.parseInt(split[2]);
            int D2 = Integer.parseInt(split[6]);

            char op = split[3].charAt(0);

            if(op == '+'){
                int N = N1*D2 + N2*D1;
                int D = D1*D2;
                System.out.print(N+"/"+D+" ");
                simplifica(N,D);
                
            } else 
            if (op == '-'){
                int N = N1*D2 - N2*D1;
                int D = D1*D2;
                System.out.print(N+"/"+D+" ");
                simplifica(N,D);
            } else 
            if (op == '*'){
                int N = N1*N2;
                int D = D1*D2;
                System.out.print(N+"/"+D+" ");
                simplifica(N,D);
            } else
            if (op == '/'){
                int N = N1*D2;
                int D = N2*D1;
                System.out.print(N+"/"+D+" ");
                simplifica(N,D);
            }

            }
        sc.close();
        }
}
