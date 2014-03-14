package br.com.ufpb.poo.projeto.pibid;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class GerenciadorPibid{
	
	private List<Aluno> alunos=new LinkedList<Aluno>();
	private List<Coordenador> coordenadores=new LinkedList<Coordenador>();
	private List<Grupo> grupos= new LinkedList<Grupo>();
	private List<Tarefa> tarefas= new LinkedList<Tarefa>();


	public void cadastraCoordenador(Coordenador coo1) throws CoordenadorExistenteException {
		boolean existe=false;
		for (Coordenador c: this.coordenadores){
			if(c.getMatricula().equals(coo1.getMatricula())){
				existe=true;
				break;
			}
		}
		if(existe==false){
			this.coordenadores.add(coo1);
		}
		else{
			throw new CoordenadorExistenteException("Coordenador Existente!");
		}
	}
	
	public List<Coordenador> getListaDeCoordenadoresCriados(){
		return this.coordenadores;	
	}
	
	public void cadastraAluno(Aluno aluno){
		this.alunos.add(aluno);
	}
	
	public List<Aluno> getListaDeAlunosCriados(){
		return this.alunos;
	}
	
	public void cadastraTarefa(Tarefa tarefa) {
		this.tarefas.add(tarefa);	
	}
	
	public List<Tarefa> getListaDeTarefas() {
		return this.tarefas;
	}
	
	public void cadastrarGrupo(Grupo grupo){
		this.grupos.add(grupo);
	}
	
	public List<Grupo> getListaDeGrupos(){
		return this.grupos;
	}
	
	public void cadastrarAlunosEmGrupo(){
		//TERMINAR
	}
	
	public Grupo pesquisarGrupo(String codigo){
		for(Grupo i: this.grupos){
			if(i.getCodigoGrupo().equals(codigo)){
				return i;
			}
		}
		return null;
	}
	
	public Aluno pesquisaAluno(String matricula){
		for ( Aluno a: alunos){
			if(a.getMatricula().equalsIgnoreCase(matricula)){
				
				return a;
			}
		}
		return null;
	}

	public void removerAlunoPelaMatricula(String matricula) throws AlunoInexistenteException {
		
		boolean removeu=false;
		
		for (Aluno x: this.alunos){
			
			if (x.getMatricula().equalsIgnoreCase(matricula)){
				removeu = true;
				alunos.remove(x);
			}
			
			
		}
		if(removeu ==false){
			throw new AlunoInexistenteException("Imposs�vel remover,pois n�o existe!");
		}
			
	}
	
	public void removerCoordenador(Coordenador c){
		this.coordenadores.remove(c);
	}	
}