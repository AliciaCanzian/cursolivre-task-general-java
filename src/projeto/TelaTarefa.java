package projeto;

import javax.swing. *;
import java.awt.*;
import java.util.ArrayList;

//Classe responsavel pela tela principal do sistema
// Estamos herdando o jFrame, ou seja, teremos uma janela grafica
public class TelaTarefa extends JFrame {
	// Lista interna que armazena todas as tarefas cadastradas pelo usuario
	private ArrayList<Tarefa> tarefas = new ArrayList<>();
	
	// Campo onde o usuario digitará o titulo da tarefa
	private JTextField compoTitulo;
	
	// Campo onde o usuario digitará a descrição da tarefa
	private JTextArea campoDescricao;
	
	// Modelo responsavel por armazenar os dados exibidos na lista visual
	private DefaultListModel<Tarefa> modeloLista;
	
	// Lista visual que exibe as tarefas cadastradas na tela
	private JList<Tarefa> listaTarefas;
	
	// Construtor da nossa interface
	public TelaTarefa() {
		
		// Define o titulo da janela
		setTitle("Gerenciador de Tarefas");
		
		// defina o tamanho da janela (largura x altura)
		setSize(850, 550);

		// Encerra o programa ao clicar no botão de fechar da interface
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Centraliza a janela na tela
		setLocationRelativeTo(null);
		
		//Impede que o usuario redimensionar a janela
		setResizable(false);
		
		// Chama o metodo responsavel por montar a interface grafica
		criarInterfacE();
		
		// Deixará nossa janela visivel
		setVisible(true);
	}
	
	// Metodo reponsalvel por criar e organizar todos os componentes visuais
	private void criarInterfacE() {
		
		// Painel principal da nossa tela
		JPanel painelPrincipal = new JPanel(new BorderLayout(20, 20));
		
		// DEfina o espaçamento interno do painel principal
		painelPrincipal.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
		
		// Define a cor de fundo de aplicação
		painelPrincipal.setBackground(new Color(236,240,243));
		
		// Titulo principal da aplicação
		JLabel titulo = new JLabel("Geenciador de Tarefas");
		titulo.setFont(new Font("segoe UI", Font.BOLD, 30));
		titulo.setForeground(new Color(44,62,80));
		
		// Subtitulo principal da aplicação
		JLabel subtitulo = new JLabel("Organize suas tarefas de forma simples e" + "pratica");
		subtitulo.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		subtitulo.setForeground(new Color(100,116,139));
		
		//Painel superior para agrupar titulo e subtitulo
				JPanel painelTopo = new JPanel(new GridLayout(2,1));
				painelTopo.setBackground(new Color(236,240,243));
				painelTopo.add(titulo);
				painelTopo.add(subtitulo);
				
				// Adiciona o painel superior no topo da tela
				painelPrincipal.add(painelTopo, Borderlayout.NORTH);
				
				
		
	}
}
