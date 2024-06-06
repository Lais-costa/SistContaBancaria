import java.util.Date;
import java.util.Scanner;

public class Cliente {
    Scanner sc = new Scanner(System.in);
    private int Ip;
    private String nome;
    private Date dataCadastro;
    private String endereco;

    public int getIp() {
        return Ip;
    }

    public void setIp(int ip) {
        this.Ip = Ip;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

