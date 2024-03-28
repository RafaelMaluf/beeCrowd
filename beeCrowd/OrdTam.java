import java.util.Scanner;


public class OrdTam{
    public static void main(String[] args) {
        String[] saida = new String[50];
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String input = "";
        for(int i = 0; i < n; i ++){
        input = sc.nextLine();
        String[] split = input.split(" ");
        for(int j = 0; j < split.length; j++){
            saida[j] = split[j];
        }
        insertionSort(saida,split.length);
        for(int k = 0; k < saida.length; k++){
            if(saida[k] != null){
                System.out.print(saida[k] + " ");
            }
            
            
        }
        
        saida = new String[50];
        }
        sc.close();
        
        
    }

    static void insertionSort(String arr[], int n) {
        int i, chave, j;
        String aux;
        for (i = 1; i < n; i++) {
            aux = arr[i];
            chave = arr[i].length();
            j = i - 1;
    
            /* Move os elementos do arr[0..i-1] que são maiores que a chave
               para uma posição à frente de sua posição atual */
            while (j >= 0 && arr[j].length() < chave) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = aux;
        }
    }
 
       
    
    
}