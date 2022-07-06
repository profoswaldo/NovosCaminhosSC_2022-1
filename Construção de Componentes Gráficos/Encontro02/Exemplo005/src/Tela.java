import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JList;

public class Tela extends JFrame {


	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		getContentPane().add(formattedTextField);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		getContentPane().add(rdbtnNewRadioButton);
		
		JList list = new JList();
		getContentPane().add(list);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		getContentPane().add(chckbxNewCheckBox);
		getContentPane().add(btnNewButton_1);

	}

}
