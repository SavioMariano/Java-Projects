import Herança.*;
public class Teste{
    public static void main(String[] args) {
        Pessoa Pai = new Pessoa("Júlio", 1997);
        Aluno Filho = new Aluno("Mateus", 2008,20978, "Informática");
        Professor Humberto = new Professor("Humberto", 1975 , null, 45790, 8);
        Funcionario  Zé = new Funcionario("Zé", 1993,"Zelador" ,1400.15, 28457);

    System.out.println("\nDados do pai: " + Pai.Saudação());

    System.out.println("\nDados do filho: " + Filho.Saudação());

    System.out.println("\nDados do professor: " + Humberto.Saudação());

    System.out.println("\nDados do funcionário: " + Zé.Saudação() + "\n");


    System.out.println("Saudações alteradas:");

        //Usando o metódo Saudação da pessoa
    System.out.println("\nDados do professor: " + Humberto.Saudação());

        //Usando o metódo Saudação do aluno
    System.out.println("\nDados do professor: " + Humberto.Saudação());

        //Usando o metódo Saudação da Pessoa
    System.out.println("\nDados do funcionário: " + Zé.Saudação() + "\n");
     
    }
}
