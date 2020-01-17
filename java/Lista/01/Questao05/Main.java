/*
Este programa imprime a tabuada de multiplicação de 1 a 10,
inclusives, pulando uma linha entre os blocos.
*/

public class Main {
    public static void main(String[] args){
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.print(i + " x " + j + " = " + (i * j));
            }
            System.out.println("");
        }
    }
}
