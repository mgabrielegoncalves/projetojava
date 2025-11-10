import controller.ProfessorController;
import service.ProfessorService;
import model.Professor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Professor p = new Professor();
        ProfessorController cp = new ProfessorController();

// --- CADASTRAR ---
        System.out.print("Nome: ");
        p.setNome(sc.next());
        System.out.print("Idade: ");
        p.setIdade(sc.nextInt());
        cp.cadastrarProfessor(p);
// --- LISTAR ---
        cp.listarProfessores();

// --- ATUALIZAR ---
        System.out.print("Informe o nome que deseja atualizar a idade: ");
        p.setNome(sc.next());
        System.out.print("Nova idade: ");
        p.setIdade(sc.nextInt());
       // cp.atualizarProfessor(p.getNome(), p.());

// --- DELETAR ---
        System.out.print("Informe o nome para deletar: ");
        cp.deletarProfessor(sc.next());


        sc.close();
    }
}