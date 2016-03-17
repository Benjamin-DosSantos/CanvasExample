


/*
Example illustrating the use of canvases.

This applet has two canvases (of two different kinds)
The basic fuinctionality is implemented here for illustration
purposes. Experiment with this...to learn more!
*/

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CanvasExample extends Applet implements ActionListener {

	// GUI Widgets
	private Button goButton;
	private DrawingCanvas canvas;
	private JLabel  xLabel, yLabel; 
	
	private JTextField xTF, yTF;
	
	private Panel bPanel;
	
	public void init() {
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		
		this.setSize(screensize);
		
		setLayout(new BorderLayout());
		
		createCoordinatePanel();
		
		add("North", bPanel);
		goButton.addActionListener(this);
		
		// add the two canvases
		Panel centerPanel = new Panel();
		centerPanel.setLayout(new GridLayout(1,2));
		
		canvas = new DrawingCanvas();
		centerPanel.add(canvas);
		
		add("Center", centerPanel);
	} // init
	
	public void createCoordinatePanel(){
		bPanel = new Panel();
		bPanel.setLayout(new GridLayout(1,5));
		
		xLabel = new JLabel("X");
		yLabel = new JLabel("Y"); 
		xTF = new JTextField("0", 8);
		yTF = new JTextField("0", 8);

		bPanel.add(xLabel);
		bPanel.add(xTF);
		bPanel.add(yLabel); 
		bPanel.add(yTF);
		
		goButton = new Button("DRAW!!");
		
		bPanel.add(goButton);
	}
	
	public void actionPerformed(ActionEvent e) {
	
		if (e.getSource() == goButton) {
			repaint();		// repaint this applet
			
			canvas.x = Integer.parseInt(xTF.getText());
			canvas.y = Integer.parseInt(yTF.getText());
			canvas.repaint();	// also repaint the canvases
		}
			
	} // actionPerformed

} // CanvasExample


