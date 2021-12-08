package Main;
import javax.swing.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame janelinha= new JFrame("Trabalho interdisciplinar");
	    JButton calcular= new JButton("Calcular");
	    JTextField nome1,nome2,nome3;
	    JLabel labelNome1,labelNome2,labelNome3,labelResultado;

	    labelNome1= new JLabel("Primeiro nome");
	    labelNome1.setBounds(50,50, 200,30);
	    nome1= new JTextField("");
	    nome1.setBounds(50,100, 200,30);

	    labelNome2= new JLabel("Segundo nome");
	    labelNome2.setBounds(50,150, 200,30);
	    nome2= new JTextField("");
	    nome2.setBounds(50,200, 200,30);

	    labelNome3= new JLabel("Terceiro nome");
	    labelNome3.setBounds(50,250, 200,30); 
	    nome3=new JTextField("");
	    nome3.setBounds(50,300, 200,30);

	    labelResultado= new JLabel("Calcular resultado:");
	    labelResultado.setBounds(50,350, 200,30);
	    calcular.setBounds(50,400,200,30);
	    janelinha.add(labelNome1);
	    janelinha.add(nome1);
	    janelinha.add(labelNome2);
	    janelinha.add(nome2);
	    janelinha.add(labelNome3);
	    janelinha.add(nome3);
	    janelinha.add(calcular);
	    janelinha.setSize(600,600);
	    janelinha.setLayout(null);
	    janelinha.setVisible(true);
	}
		
}