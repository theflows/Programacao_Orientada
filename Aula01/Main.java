package ExAluno;
public class Main {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Gabriel","Ads","000000");
		Disciplina matematica = new Disciplina("Matematica", 7);
		Disciplina eng3 = new Disciplina("Eng 3", 5.2);
		Disciplina logica = new Disciplina("Logica", 8);
		Disciplina port = new Disciplina("Portugues", 6.5);
		
		aluno1.adicionarDisciplina(matematica);
		aluno1.adicionarDisciplina(eng3);
		aluno1.adicionarDisciplina(logica);
		aluno1.adicionarDisciplina(port);
		
		aluno1.listarMedia();
		aluno1.listar();
		aluno1.listarAprovado();
		
		
	}
}
