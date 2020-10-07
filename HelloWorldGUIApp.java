import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;

public class HelloWorldGUIApp
{
	public static void main(String[] args)
	{
		javax.swing.SwingUtilities.invokeLater
		(	
			new Runnable() 
			{
				public void run()	
				{
					final int window_width = 250;
					final int window_height = 150;
					final String window_name = "Anthony Jo";
					final String message = "JAVA PC APP made by Anthony Jo";
					
					JFrame frame = new JFrame(window_name);								/*	Window Label Name	*/
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setPreferredSize(new Dimension(window_width, window_height));	/*	Define the size of a Window	*/
					JLabel label = new JLabel(message, SwingConstants.CENTER);			/*	Message to output and location of text	*/
					frame.getContentPane().add(label);
					Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
					frame.setLocation( (dim.width / 2) - (window_width / 2), 
							(dim.height / 2) - (window_height / 2) );					/*	Text Start Point Coordinate	*/
				
					frame.pack();
					frame.setVisible(true);
				}
			}
		);
	}
}