import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class FramePrincipal  extends JFrame implements ActionListener{
	
	private JPanel pnPrincipal;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem miUsuario;
	
	public FramePrincipal(){
		this.pnPrincipal = new JPanel();
		this.pnPrincipal.setPreferredSize(new Dimension(1000, 750));
		this.pnPrincipal.setLayout(null);
		// Encerrar o programa ao acionar o
		// ícone do [x] para fechar a tela
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Barra de menu
		this.menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		this.menu = new JMenu("Usuário");
		this.menuBar.add(menu);
		
		this.miUsuario = new JMenuItem("Usuários");
		this.menu.add(miUsuario);
		
		this.miUsuario.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(miUsuario))
		 {
		 FrameUsuario frame = new FrameUsuario();
		 frame.pack();
		 frame.setVisible(true);
		 }
	}



}