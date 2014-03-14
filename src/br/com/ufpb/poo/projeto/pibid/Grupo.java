package br.com.ufpb.poo.projeto.pibid;
import java.util.LinkedList;
import java.util.List;

public class Grupo {
	private List<Tarefa> tarefas;
	private String codigoGrupo;
	private List <Aluno> participantes;
	
	public Grupo(Tarefa tarefa, String codigoGrupo){
		tarefas = new LinkedList<Tarefa>();
		tarefas.add(tarefa);
		this.codigoGrupo=codigoGrupo;
		this.participantes = new LinkedList<Aluno>();
	}
	public Grupo(){
		
	}
	public String getDescricao(){
		String aluno = "";
		String tar = "";
		for (Aluno t: this.participantes){
			aluno += t.getNome() + "\n";
		}
		for (Tarefa t : this.tarefas){
			tar += t.toString()+"\n";
		}
		
		return "Tarefas: " + tar + "\n Alunos: "+aluno ;
	}
	public String toString(){
		return getDescricao();
	}
	public String getCodigoGrupo(){
		return this.codigoGrupo;
	}
	public void cadastrarParticipante(Aluno a1) {
		for(Aluno a : this.participantes){
			if(a.equals(a1)){
				throw new RuntimeException("ERRO!");
			}
		}
		this.participantes.add(a1);
		
	}
	public List<Aluno> listParticipantes(){
		return this.participantes;
	}
	
	public Aluno pesquisaParticipante(String id){
		for(Aluno a : this.participantes){
			if(a.getMatricula().equals(id)){
				return a;
			}
		}
		return null;
	}
	
}
 