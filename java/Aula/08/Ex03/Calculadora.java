
public class Calculadora {
    public double memoria = 0.0;
    public int opcao;

    public Calculadora(double memoria, double valor, int opcao) {
        switch(opcao) {
            case 1:
                soma(valor);
                break;
            case 2:
                subtrai(valor);
                break;
            case 3:
                multiplica(valor);
                break;
            case 4:
                divide(valor);
                break;
            case 5:
                zera();
        }
    }
    
    public void soma(double valor) {
        memoria += valor;
    }
    
    public void subtrai(double valor) {
        memoria-= valor;    
    }
    
    public void multiplica(double valor) {
        memoria *= valor;
    }
    
    public void divide(double valor) {
        memoria /= valor;
    }
    
    public void zera() {
        memoria = 0.0;
    }
    
    public Double exibeMemoria() {
        return memoria;
    }
}
