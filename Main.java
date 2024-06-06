import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Sistema de controle bancário");
        Conta c1 = new Conta();
        c1.setJuros(3);
        System.out.println(c1.getJuros());

        c1.setSaldo(200.0);
        System.out.println(c1.getSaldo());

        c1.setNumero(305);
        System.out.println(c1.getNumero());

        c1.setVencimento(new Date());
        System.out.println(c1.getVencimento());

        //NOVO CLIENTE
        Cliente cl1 = new Cliente();
        cl1.setIp(1);
        System.out.println(cl1.getIp());

        cl1.setNome("Pedro");
        System.out.println(cl1.getNome());

        cl1.setDataCadastro(new Date());
        System.out.println(cl1.getDataCadastro());

        cl1.setEndereco("Quixadá-CE");
        System.out.println(cl1.getEndereco());

        //NOVO CLIENTE
        Cliente cl2 = new Cliente();
        cl2.setIp(2);
        System.out.println(cl2.getIp());

        cl2.setNome("Elo");
        System.out.println(cl2.getNome());

        cl2.setDataCadastro(new Date());
        System.out.println(cl2.getDataCadastro());

        cl2.setEndereco("Guaruja-SP");
        System.out.println(cl2.getEndereco());

        //NOVO CLIENTE
        Cliente cl3 = new Cliente();
        cl3.setIp(3);
        System.out.println(cl2.getIp());

        cl3.setNome("Lala");
        System.out.println(cl3.getNome());

        cl3.setDataCadastro(new Date());
        System.out.println(cl3.getDataCadastro());

        cl3.setEndereco("Pacatuba-CE");
        System.out.println(cl3.getEndereco());


    }
}