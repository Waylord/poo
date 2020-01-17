/* Calcule a distância entre dois 
pontos num espaço de 3 dimensões */
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int xa, ya, za;
        int xb, yb, zb;
        Scanner teclado = new Scanner(System.in);
        
        //Entrada de dados
        System.out.print("Digite a coordenada x de a: ");
        xa = teclado.nextInt();
        System.out.print("Digite a coordenada y de a: ");
        ya = teclado.nextInt();
        System.out.print("Digite a coordenada z de a: ");
        za = teclado.nextInt();
        System.out.print("Digite a coordenada x de b: ");
        xb = teclado.nextInt();
        System.out.print("Digite a coordenada y de b: ");
        yb = teclado.nextInt();
        System.out.print("Digite a coordenada z de b: ");
        zb = teclado.nextInt();
        
        //Exibe os dados de entrada
        System.out.println("");
        System.out.println("xa = "+xa+"; ya= "+ya+"; za = "+za);
        System.out.println("xb = "+xb+"; yb= "+yb+"; zb = "+zb);
        
        //Calculo
        double result = Math.sqrt(Math.pow((xb - xa), 2) +
        Math.pow((yb - ya), 2) + Math.pow((zb - za), 2));
        
        //Saida
        System.out.println("A distância entre os pontos a e b é "+result);
        teclado.close();
    }
}
