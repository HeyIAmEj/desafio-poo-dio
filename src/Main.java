import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("League of Legends Campeoes");
        curso1.setDescricao("Aprenda mais detalhes sobre os Campeões para obter melhor desempenho!");
        curso1.setCargaHoraria(64);

        Curso curso2 = new Curso();
        curso2.setTitulo("Counter Strike");
        curso2.setDescricao("É ruim de Mira? Não será mais depois desse curso!");
        curso2.setCargaHoraria(60);

        Curso curso3 = new Curso();
        curso3.setTitulo("League of Legends Técnicas");
        curso3.setDescricao("Aprenda as melhores técnicas para se aprimorar no cenário!");
        curso3.setCargaHoraria(60);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de LoL");
        mentoria.setDescricao("Aprenda com os mentores mais recomendados da área.");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de CS");
        mentoria2.setDescricao("Aprenda com os mentores mais recomendados da área.");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("League of Legends Bootcamp 4Club");
        bootcamp.setDescricao("Dê o seu melhor nesse Bootcamp para garantir uma vaga no Time 4Club");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Pedro");
        String nome = dev1.getNome();
        dev1.inscreverBootcamp(bootcamp);
        System.out.println(String.format("Conteúdos Inscritos %s: %s", nome, dev1.getConteudosInscritos()));
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println(String.format("Conteúdos Inscritos %s: %s", nome, dev1.getConteudosInscritos()));
        System.out.println("Conteúdos Concluídos Pedro:" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("-------");

        Dev dev2 = new Dev();
        dev2.setNome("Joao");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println(String.format("Conteúdos Inscritos %s: %s", nome, dev2.getConteudosInscritos()));
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println(String.format("Conteúdos Inscritos %s: %s", nome, dev2.getConteudosInscritos()));
        System.out.println("Conteúdos Concluidos João:" + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());

    }

}
