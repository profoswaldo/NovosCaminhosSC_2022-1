import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Tela extends JFrame {

	private JMenuBar menuBar;
	private JMenu mnuAcademico;
	private JMenu mnuAluno;
	private JMenuItem mnuInclusao;
	private JMenuItem mnuExclusão;
	private JMenuItem mnuAlteracao;
	private JMenuItem mnuConsulta;
	private JSeparator separator;
	private JMenuItem mnuSair;
	private JButton btnAdcionar;
	private JTextField txtTextoAdcionado;
	private JComboBox cmbUfs;
	
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnuAcademico = new JMenu("Acadêmico");
		menuBar.add(mnuAcademico);
		
		mnuAluno = new JMenu("Aluno");
		mnuAcademico.add(mnuAluno);
		
		mnuInclusao = new JMenuItem("Inclusão");
		mnuAluno.add(mnuInclusao);
		
		mnuExclusão = new JMenuItem("Exclusão");
		mnuAluno.add(mnuExclusão);
		
		mnuAlteracao = new JMenuItem("Alteração");
		mnuAluno.add(mnuAlteracao);
		
		mnuConsulta = new JMenuItem("Consulta");
		mnuAluno.add(mnuConsulta);
		
		separator = new JSeparator();
		mnuAcademico.add(separator);
		
		mnuSair = new JMenuItem("Sair");
		mnuSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(rootPane, "Até á próxima");
				dispose();
			}
		});
		mnuAcademico.add(mnuSair);
		
		cmbUfs = new JComboBox();
		cmbUfs.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				txtTextoAdcionado.setText(cmbUfs.getSelectedItem().toString());
			}
		});
		getContentPane().add(cmbUfs);
		
		btnAdcionar = new JButton("Adicionar UF");
		btnAdcionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmbUfs.addItem(txtTextoAdcionado.getText());
			}
		});
		getContentPane().add(btnAdcionar);
		
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtTextoAdcionado = new JTextField();
		getContentPane().add(txtTextoAdcionado);
		txtTextoAdcionado.setColumns(10);
		
		

	}

}
