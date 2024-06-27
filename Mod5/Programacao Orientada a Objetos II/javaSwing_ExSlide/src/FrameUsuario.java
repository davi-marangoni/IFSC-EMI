
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameUsuario extends JFrame implements ActionListener {

	private JPanel pnUsuario;
	private JLabel lbId;
	private JLabel lbNome;
	private JLabel lbEmail;
	private JTextField txId;
	private JTextField txNome;
	private JTextField txEmail;
	private JButton btSalvar;

	// Método construtor
	public FrameUsuario() {
		this.pnUsuario = new JPanel();
		this.pnUsuario.setPreferredSize(new Dimension(250, 150));
		this.pnUsuario.setLayout(null);
		// Desabilitar o redimensionamento
		this.setResizable(false);
		// Definir o painel de fundo do JFrame
		this.setContentPane(pnUsuario);

		this.lbId = new JLabel("Código:");
		this.lbNome = new JLabel("Nome:");
		this.lbEmail = new JLabel("Email:");
		// x y
		this.lbId.setBounds(5, 10, 60, 15);
		this.lbNome.setBounds(5, 40, 60, 15);
		this.lbEmail.setBounds(5, 70, 60, 15);
		
		this.pnUsuario.add(lbId);
		this.pnUsuario.add(lbNome);
		this.pnUsuario.add(lbEmail);
		
		this.txId = new JTextField();
		this.txNome = new JTextField();
		this.txEmail = new JTextField();
		
		this.txId.setBounds(55, 0, 135, 30);
		this.txNome.setBounds(55, 30, 135, 30);
		this.txEmail.setBounds(55, 60, 135, 30);
		
		this.pnUsuario.add(txId);
		this.pnUsuario.add(txNome);
		this.pnUsuario.add(txEmail);
		
		this.btSalvar = new JButton("Salvar");
		this.btSalvar.setBounds(5, 100, 120, 30);
		this.btSalvar.addActionListener(this);
		this.pnUsuario.add(btSalvar);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// Verificando se o evento veio do botão
		if (e.getSource().equals(btSalvar)) {
			// imprimindo os dados dos campos
			System.out.println(txId.getText());
			System.out.println(txNome.getText());
			System.out.println(txEmail.getText());
			JOptionPane.showMessageDialog(null,"Sucesso!");
			txId.setText(" ");
			txNome.setText(" ");
			txEmail.setText(" ");
		}
		/*if (e.getSource().equals(btCancelar)) {
			// imprimindo os dados dos campos
			txId.setText(" ");
			txNome.setText(" ");
		}*/
	}
}