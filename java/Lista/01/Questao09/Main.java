/*
Determine a saída do seguinte programa:
*/

public class Loop {
    public static void main(String[] args) {
        for (int i = 2; i <= 8; i = i + 2) {
            for (int j = i; j <= 4; j++) {
                for (int k = 1; k <= j; k = k + i) {
                    System.out.println(i + ", " + j + ", " + k);
                }
            }
        }
    }
}

/*
A variável i avança de 2 em 2, começando no 2 até 8.
A variável j avança de 1 em 1, começando de i até 4.
A variável k avança de i em i, começando em 1 até j.

Logo, temos as seguintes saídas:
2, 2, 1
2, 3, 1
2, 3, 3
2, 4, 1
2, 4, 3
4, 4, 1

*/
