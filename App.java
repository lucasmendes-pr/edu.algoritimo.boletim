public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Bem Vindo ao Meu Primeiro Progeto em Java!");
        int idade;
        String nome, email,telefone, cpf, endereco;

        System.out.print("Digite seu nome: ");
        nome = System.console().readLine();
        System.out.print("Digite sua idade: ");
        idade = Integer.parseInt(System.console().readLine());
        System.out.println("Digite seu email:");
        email = System.console().readLine();
        System.out.println("Digite seu telefone: ");
        telefone = System.console().readLine();
        System.out.println("Digite seu CPF: ");
        cpf = System.console().readLine();
        System.out.println("Digite seu endereço: ");
        endereco = System.console().readLine();
        System.out.println("Nome: " + nome+"\nIdade: " + idade + "\nEmail: " + email + "\nTelefone: " + telefone + "\nCPF: " + cpf + "\nEndereço: " + endereco);
    }
}
