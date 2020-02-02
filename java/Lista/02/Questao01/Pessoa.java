import java.util.Scanner;

public class Pessoa {
	String nomePessoa;
	Pessoa nomePai, nomeMae;
	int idadePessoa;
	Scanner t = new Scanner(System.in);
	
	public Pessoa() {
		cadastraPessoa();
	}
	
	public void cadastraPessoa() {
		System.out.print("Informe o nome da pessoa: ");
		nomePessoa = t.nextLine();
		System.out.print("Digite a idade de " + nomePessoa + ": ");
        idadePessoa = t.nextInt();
        t.nextLine();
	}
	
	public String getNomePessoa() {
		return nomePessoa;
	}
	
	public int getIdadePessoa() {
		return idadePessoa;
	}
	
	public void associarPai(Pessoa pai) {
		this.nomePai = pai;
	}
	
	public void associarMae(Pessoa mae) {
		this.nomeMae = mae;
	}

    public String mostrarNomePai() {
        return this.nomePai.nomePessoa;
    }

    public String mostrarNomeMae() {
        return this.nomeMae.nomePessoa;
    }
}
