import br.edu.christus.Aluno;
import br.edu.christus.Pessoa;
import br.edu.christus.Professor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Pessoa p1 = new Aluno();
       p1.setCpf("123");
       Pessoa p2 = new Aluno();
       p2.setCpf("321");

       Pessoa p3 = new Professor("Julia");
       Pessoa p4 = new Professor("Manel");

       p1.setNome("João");
       p2.setNome("Maria");

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);

        Pessoa p5 = new Aluno();
        p5.setCpf("123");

        ((Professor) p4).setSalario(2000);


        for (Pessoa pessoa : pessoas){
            if(p5.equals(pessoa)){
                System.out.println("ACHEI");
            }
        }

    }

}






