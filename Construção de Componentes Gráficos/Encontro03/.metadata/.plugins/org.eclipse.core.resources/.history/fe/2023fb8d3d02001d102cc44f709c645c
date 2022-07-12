package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controles.ControleAluno;

public class TelaCadastroAluno extends JFrame {

	private JPanel contentPane;
	private JTextField txtMatricula;
	private JTextField txtNome;
	private JTextField txtTeste;
	private JTextField txtProva;
	private JTextField txtMedia;

	private ControleAluno controle;

	public TelaCadastroAluno() {
		controle = new ControleAluno();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMatricula = new JLabel("Digite a matricula do Aluno:");
		lblMatricula.setBounds(35, 29, 136, 14);
		contentPane.add(lblMatricula);

		txtMatricula = new JTextField();
		txtMatricula.setBounds(35, 56, 126, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);

		JLabel lblNome = new JLabel("Digite o nome do Aluno:");
		lblNome.setBounds(201, 29, 184, 14);
		contentPane.add(lblNome);

		txtNome = new JTextField();
		txtNome.setBounds(201, 56, 283, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblTeste = new JLabel("Teste:");
		lblTeste.setBounds(35, 113, 126, 14);
		contentPane.add(lblTeste);

		txtTeste = new JTextField();
		txtTeste.setBounds(35, 138, 126, 20);
		contentPane.add(txtTeste);
		txtTeste.setColumns(10);

		JLabel lblProva = new JLabel("Prova:");
		lblProva.setBounds(201, 113, 46, 14);
		contentPane.add(lblProva);

		txtProva = new JTextField();
		txtProva.setBounds(201, 138, 126, 20);
		contentPane.add(txtProva);
		txtProva.setColumns(10);

		JLabel lblMedia = new JLabel("Média:");
		lblMedia.setBounds(359, 113, 46, 14);
		contentPane.add(lblMedia);

		txtMedia = new JTextField();
		txtMedia.setBounds(359, 138, 126, 20);
		contentPane.add(txtMedia);
		txtMedia.setColumns(10);

		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				controle.incluir(txtMatricula.getText(), txtNome.getText(), txtTeste.getText(), txtProva.getText());
			}
		});
		btnIncluir.setBounds(35, 200, 89, 23);
		contentPane.add(btnIncluir);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controle.excluir(txtMatricula.getText());
			}
		});
		btnExcluir.setBounds(158, 200, 89, 23);
		contentPane.add(btnExcluir);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controle.alterar(txtMatricula.getText(), txtNome.getText(), txtTeste.getText(), txtProva.getText());
			}
		});
		btnAlterar.setBounds(277, 200, 89, 23);
		contentPane.add(btnAlterar);

		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controle.consultar(null);
			}
		});
		btnConsultar.setBounds(395, 200, 89, 23);
		contentPane.add(btnConsultar);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMatricula.setText(null);
				txtNome.setText(null);
				txtTeste.setText(null);
				txtProva.setText(null);
				txtMedia.setText(null);
			}
		});
		btnLimpar.setBounds(277, 251, 89, 23);
		contentPane.add(btnLimpar);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Obrigado por usar nosso Sistema");
				dispose();
			}
		});
		btnSair.setBounds(395, 251, 89, 23);
		contentPane.add(btnSair);
	}
}
