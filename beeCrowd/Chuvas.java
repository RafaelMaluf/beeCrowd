import java.util.Scanner;

class Ano{
    int ano;
    int chuva;
    Ano(int ano, int chuva){
        this.ano = ano;
        this.chuva = chuva;
    }
    public int getAno() {
        return ano;
    }
    public int getChuva() {
        return chuva;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setChuva(int chuva) {
        this.chuva = chuva;
    }
}
public class Chuvas {
    static boolean buscaAno(int ano,int ano2, Ano[] anos){
        int chuva = 0;
        int chuva2 = 0;
        for(int i = 0; i < anos.length; i++){
            if(anos[i].getAno() == ano){
                chuva = anos[i].getChuva();
            }
            if(anos[i].getAno() == ano2){
               chuva2 = a
            }
        }
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        while (n != 0){
        for(int i = 0; i < n; i++){
            Ano[] anos = new Ano[n]; 
            String[] split = sc.nextLine().split(" ");
            Ano ano = new Ano(Integer.parseInt(split[0]),Integer.parseInt(split[1]));
            anos[i] = ano;
        }
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n; i++){
            String[] split = sc.nextLine().split(" ");    
        }
    }
        sc.close();
    }
    
}
