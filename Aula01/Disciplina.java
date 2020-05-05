package ExAluno;
import java.util.*;
public class Disciplina {
	private String nomeDisciplina;
	private double nota;
	
	public Disciplina(String nomeDisciplina, double nota) {
		this.nomeDisciplina= nomeDisciplina;
		this.nota= nota;
	}
	public void mostrarDados(){
        System.out.println("Nome: " + nomeDisciplina);
        System.out.println("Nota: " + nota);
    }
	public void mostrarAprovado(){
        if(nota>=6) {
		System.out.println("Nome: " + nomeDisciplina);
        System.out.println("Nota: " + nota);
    }
	}
	
	public double getNota() {
		return nota;
	}
}
