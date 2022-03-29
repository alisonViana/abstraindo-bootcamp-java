import models.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Criação dos conteúdos
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Curso curso3 = new Curso();
        Mentoria mentoria1 = new Mentoria();
        Mentoria mentoria2 = new Mentoria();

        curso1.setTitulo("Estruturas de Dados em Java");
        curso1.setDescricao("Aprenda sobre estruturas de dados e como implementá-las utilizando Java");
        curso1.setCargaHoraria(6);

        curso2.setTitulo("SQL Server");
        curso2.setDescricao("Trabalhando com banco de dados relacionais");
        curso2.setCargaHoraria(3);

        curso3.setTitulo("Desenvolvimento Mobile Nativo para Android");
        curso3.setDescricao("Desenvolvendo aplicações nativas para Android utilizando Java e Kotlin");
        curso3.setCargaHoraria(4);

        mentoria1.setTitulo("Mentoria #1");
        mentoria1.setDescricao("Aula inaugural - Bootcamp Sportheca Mobile Developer");
        mentoria1.setData(LocalDate.now());

        mentoria2.setTitulo("Mentoria #8");
        mentoria2.setDescricao("Consumo de APIs e Persistindo Dados Localmente em Apps Android");
        mentoria2.setData(LocalDate.now().plusDays(10));


        // Criação do bootcamp
        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setTitulo("Bootcamp Java Developer");
        bootcampJava.setDescricao("Bootcamp focado em Java oferecido pela DIO");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(mentoria1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(curso3);
        bootcampJava.getConteudos().add(mentoria2);

        // Criação dos Devs
        Dev joao = new Dev();
        Dev maria = new Dev();
        joao.setNome("João");
        maria.setNome("Maria");

        System.out.println("Teste 1");
        // Inscrevendo os devs no bootcamp
        joao.inscreverBootcamp(bootcampJava);
        maria.inscreverBootcamp(bootcampJava);

        // Verificando cursos
        imprimirCursos(joao, maria);

        // Calculando XP
        imprimirXp(joao, maria);


        System.out.println("\nTeste 2");
        // Progredindo no bootcamp
        joao.progredir();
        maria.progredir();

        // Verificando cursos
        imprimirCursos(joao, maria);

        // Calculando XP
        imprimirXp(joao, maria);


        System.out.println("\nTeste 3");
        // Progredindo no bootcamp
        joao.progredir();
        joao.progredir();
        maria.progredir();
        maria.progredir();
        maria.progredir();

        // Verificando cursos
        imprimirCursos(joao, maria);

        // Calculando XP
        imprimirXp(joao, maria);

    }


//     Static serve para referenciar todos aqueles atributos/métodos de classe,
//     ou seja, que podem ser acessados diretamente da definição da classe, sem precisar instanciar nenhum objeto.

    public static void imprimirCursos(Dev dev1, Dev dev2) {

        // Verificando cursos inscritos
        System.out.println("-----------------------------------");
        System.out.println("Cursos inscritos de João: " + dev1.getConteudosInscritos());
        System.out.println("Cursos inscritos de Maria: " + dev2.getConteudosInscritos());

        // Verificando cursos concluídos
        System.out.println("-----------------------------------");
        System.out.println("Cursos concluídos de João: " + dev1.getConteudosConcluidos());
        System.out.println("Cursos concluídos de Maria: " + dev2.getConteudosConcluidos());
    }

    public static void imprimirXp(Dev dev1, Dev dev2) {

        // Verificando cursos inscritos
        System.out.println("-----------------------------------");
        System.out.println("XP de João: " + dev1.calcularTotalXP());
        System.out.println("XP de Maria: " + dev2.calcularTotalXP());
    }

}
