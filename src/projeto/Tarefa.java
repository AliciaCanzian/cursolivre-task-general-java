package projeto;

public class Tarefa {

	    // Atributos da tarefa
	    private String titulo;
	    private String descricao;
	    private String status;

	    // Construtor
	    public Tarefa(String titulo, String descricao) {
	        this.titulo = titulo;
	        this.descricao = descricao;
	        this.status = "Pendente";
	    }

	    public String getTitulo() {
	        return titulo;
	    }

	    public String getDescricao() {
	        return descricao;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void concluir() {
	        this.status = "Concluída";
	    }

	    @Override
	    public String toString() {
	        return titulo + " - " + status;
	    }
	}


