import java.util.Scanner;



public class Camisetas {

    public static void sort(String [] dados){
        for(int j = 0; j < dados.length; j++){
        for(int i = 0; i < dados.length -1;i++){
            if(dados[i].compareTo(dados[i+1]) > 0){
                String aux = dados[i];
                dados[i] = dados[i+1];
                dados[i+1] = aux;
            }
        }
        }   
                for(int y = 0; y < dados.length; y++){
        for(int k = 0; k < dados.length-1; k++){
            
            String[] split = dados[k].split(" ");
            String[] split2 = dados[k+1].split(" ");
           
                
           if(split[0].compareTo(split2[0]) == 0)
            if(split[1].compareTo(split2[1]) < 0){
                String aux = dados[k];
                dados[k] = dados[k+1];
                dados[k+1] = aux;
            }
        
        }
    }
        
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        while(n!= 0){
        String [] dados = new String[n];

        for(int i = 0; i < n; i++){
        
        String nome = sc.nextLine();
        dados[i] = sc.nextLine();
        dados[i] = dados[i] +" "+ nome;
        }

        sort(dados);
         
        
        for(int i = 0; i < dados.length; i++){
            System.out.println(dados[i]);
        }
        
        n = Integer.parseInt(sc.nextLine());
    }
    
        sc.close();
    
}
}