package ExAluno;
import java.util.*;
public class Aluno {

	private String nome;
	private String curso;
	private String ra;
	private ArrayList <Disciplina> disciplina;
	public Aluno(String nome, String curso, String ra) {
		this.nome=nome;
		this.curso=curso;
		this.ra=ra;
		this.disciplina= new ArrayList<Disciplina>();
	}
	
	public void adicionarDisciplina(Disciplina n) {
		if(n != null)
			disciplina.add(n);
	}
	
	public void remover(int ix){
        if (ix > 0)
            disciplina.remove(ix);
    }
	public void listar(){
        for(int i=0; i < disciplina.size(); i++){
            disciplina.get(i).mostrarDados();
        }
    }
	public void listarAprovado(){
        for(int i=0; i < disciplina.size(); i++){
            disciplina.get(i).mostrarAprovado();
        }
    }
	public void listarMedia() {
		double media=0;
		for(int i=0; i < disciplina.size(); i++) {
			media+=disciplina.get(i).getNota();
		}
		System.out.println("Media das nota: " + media/disciplina.size());
		if (media/disciplina.size() < 6)
			System.out.println("Aprovado!!");
		else
			System.out.println("Reprovado!!");
	}
	
}