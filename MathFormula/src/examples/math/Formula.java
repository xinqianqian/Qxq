package examples.math;

import java.awt.HeadlessException;
import java.awt.image.BufferedImage;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;

public class Formula extends JFrame {

	
	
	public Formula() throws HeadlessException {
		super();
		// TODO Auto-generated constructor stub
		setTitle("Formula Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1000, 100, 500, 530);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Formula app = new Formula();

		String math = "\\frac{x_a+y^2}{e^{lnx}}";


		TeXFormula formula = new TeXFormula(math);
		TeXIcon ti = formula.createTeXIcon(TeXConstants.STYLE_DISPLAY, 40);
		BufferedImage b = new BufferedImage(ti.getIconWidth(), ti.getIconHeight(), BufferedImage.TYPE_4BYTE_ABGR);

		ti.paintIcon(new JLabel(), b.getGraphics(), 0, 0);

		JPanel mainPanel = new JPanel();
		JLabel fLabel = new JLabel();
		fLabel.setIcon(ti);
		mainPanel.add(fLabel);
		app.add(mainPanel);
		app.setVisible(true);
		app.pack();
	}

}
