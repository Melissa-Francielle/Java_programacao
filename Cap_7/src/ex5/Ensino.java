package ex5;

public class Ensino extends Projeto{
	private String disciplina;
	private String curso;
	
	public Ensino () {}
	
	public Ensino (String disciplina, String curso, Integer numero, String tituloProjeto) {
		super(numero, tituloProjeto);
		this.disciplina = disciplina;
		this.curso = curso;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso (String curso) {
		this.curso = curso;
	}
	@Override 
	public String toString() {
		return "\nNumero:"+numero +"\nTitulo do Projeto: "+tituloProjeto+ "\nDisciplina: " + disciplina+"\nCurso: "+curso;
	}
}
