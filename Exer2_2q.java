import java.util.Scanner;

public class Exer2_2q {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nome;
        String sobrenome;
        String sexo;
        int dia;
        int mes;
        int ano;
        float altura;
        float kg;
        
        System.out.println("Seja bem vindo ao seu teste de frequencia cardiaca...\n\n");
        System.out.println("Digite seu nome : ");
        nome = sc.nextLine();
        
        System.out.println("\n\nDigite seu Sobrenome : "); 
        sobrenome = sc.nextLine();
        
        System.out.println("\n\nDigite seu Sexo : "); 
        sexo = sc.nextLine();
        
        System.out.println("\n\nDigite o dia do seu nascimento : ");
        dia = sc.nextInt();
        
        System.out.println("\n\nDigite o mes do seu nascimento : ");
        mes = sc.nextInt();
        
        System.out.println("\n\nDigite o ano do seu nascimento : ");
        ano = sc.nextInt();
        
        System.out.println("\n\nDigite sua altura : ");
        altura = sc.nextFloat();
        
        System.out.println("\n\nDigite seu peso : ");
        kg = sc.nextFloat();
        
        PerfilDeSaude pds = new PerfilDeSaude(nome, sobrenome, sexo, dia, mes, ano, altura, kg);
        
        System.out.println("\n\n\nOlá Sr(a)"+ pds.getNome() +" "+ pds.getSobrenome());
        System.out.println("\nVocê tem "+ pds.CalculaIdade() +" Anos");
        System.out.println("\n" + pds.getSexo());
        System.out.println("\nSua data de nascimento é: "+pds.getDiaNascimento()+"/"+pds.getMesNascimento()+"/"+pds.getAnoNascimento());
        System.out.println("\nSua altura : " + pds.getAltura());
        System.out.println("\nSeu peso : " + pds.getQuilograma());
        System.out.println("\n"+pds.FrenquenciaMaxima());
        System.out.println("\n" + pds.CalculaFrequenciaAlvo());
        System.out.println("\n" + pds.CalculaIMC());

        
    }
    
}
