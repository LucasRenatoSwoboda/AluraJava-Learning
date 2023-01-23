
package br.com.alura.threads;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class AcaoBotao implements ActionListener {

	JTextField primeiro = new JTextField(10);
	JTextField segundo = new JTextField(10);
	private JLabel resultado;
	
	public AcaoBotao(JTextField primeiro, JTextField segundo, JLabel resultado) {
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.resultado = resultado;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Runnable tarefa = new TarefaMultiplicacao(primeiro, segundo, resultado);
		Thread threadCalculo = new Thread(tarefa, "Thread Calculador");
		threadCalculo.start();
	}

}