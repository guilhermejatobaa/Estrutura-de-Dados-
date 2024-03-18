public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        Aluno a6 = new Aluno();
        Aluno a7 = new Aluno();
        Aluno a8 = new Aluno();
        Aluno a9 = new Aluno();
        Aluno a10 = new Aluno();
        Aluno a11 = new Aluno();
        Aluno a12 = new Aluno();
        Aluno a13 = new Aluno();
        Aluno a14 = new Aluno();
        Aluno a15 = new Aluno();


        a1.setNome("Glevson");
        a2.setNome("Francisco");
        a3.setNome("Maria");
        a4.setNome("João");
        a5.setNome("Marcos");
        a6.setNome("Joana");
        a7.setNome("Davi");
        a8.setNome("Laura");
        a9.setNome("Guilherme");
        a10.setNome("Carlos");
        a11.setNome("Leticia");
        a12.setNome("Zezinho");
        a13.setNome("Paulo");
        a14.setNome("Lucas");
        a15.setNome("Salomão");

        Vetor lista = new Vetor();
        lista.Adiciona(a1);
        lista.Adiciona(a2);
        lista.Adiciona(a3);
        lista.Adiciona(a4);
        lista.Adiciona(a5);
        lista.Adiciona(a6);
        lista.Adiciona(a7);
        lista.Adiciona(a8);
        lista.Adiciona(a9);
        lista.Adiciona(a10);
        lista.Adiciona(a11);
        lista.Adiciona(a12);
        lista.Adiciona(a13);
        lista.Adiciona(a14);
        lista.Adiciona(a15);

        System.out.println("Total de alunos: " +lista.getTotalDealunos());

        System.out.println(lista);

        lista.remove(0);
        lista.remove(5);

        System.out.println(" Agora a lista com os alunos removidos ");
        System.out.println(lista);

        lista.adiciona(5, a5);
        lista.adiciona(0, a3);

        System.out.println(" Agora a lista com os alunos removidos substituidos ");
        System.out.println(lista);
        System.out.println("Total de alunos: " +lista.getTotalDealunos());
        System.out.println("\nAlunos: "+ a2.getNome());
        System.out.println("Alunos: "+ a1.getNome());
        System.out.println(lista.contem(a5));
    }
}