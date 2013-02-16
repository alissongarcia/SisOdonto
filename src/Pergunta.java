import negocio.Grupo_I;
import javax.swing.JOptionPane;


public class Pergunta {
	public Grupo_I grupo = new Grupo_I();
	String aux = "";
	int rq3, somaq8, somaq10, rq1, rq4a, rq4b, rq4c, rq4d;
	
	public void perguntas(){
		aux = JOptionPane.showInputDialog("Q3 - Você já teve dor na face, nos maxilares, têmpora, na frente do ouvido, ou no ouvido no mês passado?");
		rq3 = Integer.parseInt(aux);
		
		aux = JOptionPane.showInputDialog("QE8 - Dor muscular extra-oral com palpação");
		somaq8 = Integer.parseInt(aux);
		
		aux = JOptionPane.showInputDialog("QE8 - Dor muscular intra-oral com palpação");
		somaq10 = Integer.parseInt(aux);
		
		aux = JOptionPane.showInputDialog("QE1 - Você tem dor no lado direito da sua face, lado esquerdo ou ambos os lados?");
		rq1 = Integer.parseInt(aux);
		
		aux = JOptionPane.showInputDialog("QE4a - Abertura sem auxilio sem dor___ ___mm");
		rq4a = Integer.parseInt(aux);
		
		aux = JOptionPane.showInputDialog("QE4b - Abertura máxima sem auxilio___ ___mm");
		rq4b = Integer.parseInt(aux);
		
		aux = JOptionPane.showInputDialog("QE4c - Abertura máxima com auxilio___ ___mm");
		rq4c = Integer.parseInt(aux);
		
		aux = JOptionPane.showInputDialog("QE4d - Trespasse incisal vertical___ ___mm");
		rq4d = Integer.parseInt(aux);
		
		//grupo.diagnostico(rq3, somaq8, somaq10, rq1, rq4a, rq4b, rq4c, rq4d);
	}
	

}
