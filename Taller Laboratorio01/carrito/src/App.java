import java.lang.Math;
import java.util.*;



public class App {
    static Random rnum = new Random();
    public static void main(String[] args) {
        int[] carro = new int[rnum.nextInt(20)+1];
        addprod(carro);
        showcar(carro);
        detailprod(carro);
        total(carro);
    }

    public static int[] addprod(int[] carro){
        for(int i=0;i<carro.length;i++){
            carro[i]=rnum.nextInt(16);
        }
        return carro;
    }
    public static  void showcar(int[] carro){
        int productos = 0;
        for (int i=0;i<carro.length;i++) {
            productos += carro[i];
        }
        System.out.println("\ncarro contiene "+productos+" productos");
    }
    public static  int total(int[] carro){
        int total = 0;
        for (int i=0;i<carro.length;i++) {
            total += (500+(150*i))*carro[i];
        }
        return total;
    }
    public static  void detailprod(int[] carro){
        int subTotal = 0;
        int total = total(carro);
        System.out.println("Detalle compra:");
        for(int i=0;i<carro.length;i++){
            subTotal = (500+(150*i))*carro[i];
            System.out.println("Cantidad producto "+(i+1)+": "+carro[i]+", subtotal: $"+subTotal);
        }
        System.out.println("Total de compra : $"+total);
    }
}



