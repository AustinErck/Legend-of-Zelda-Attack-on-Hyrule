package loz.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.TextArea;
import java.awt.Toolkit;

public class GameWindow {

	private JFrame window;
	JPanel cards;

	/**
	 * Create the application.
	 */
	public GameWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 406, 517);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GameWindow gameWindow = new GameWindow();
		gameWindow.addComponentToPane(window.getContentPane());
		window.pack();
		window.setVisible(true);
	}

	public JFrame getFrame() {
		return window;
	}

	public void setFrame(JFrame frame) {
		this.window = frame;
		window.setResizable(false);
		window.setAutoRequestFocus(false);
		window.setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						"F:\\Documents\\Projects\\Legend-of-Zelda-Attack-on-Hyrule\\src\\loz\\resources\\icon.png"));
		window.setTitle("Legend of Zelda: Attack on Hyrule");
		window.setSize(396, 452);
	}

	public void addComponentToPane(Container pane) {
		JPanel comboBoxPane = new JPanel();
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		comboBoxPane.add(textArea);

		JPanel cardMainMenuControls = new JPanel();
		cardMainMenuControls.add(new JButton("Button 1"));
		cardMainMenuControls.add(new JButton("Button 2"));
		cardMainMenuControls.add(new JButton("Button 3"));

		JPanel cardGameControls = new JPanel();
		cardGameControls.add(new JButton("Button 1"));
		cardGameControls.add(new JButton("Button 2"));
		cardGameControls.add(new JButton("Button 3"));

		cards = new JPanel(new CardLayout());
		cards.add(cardMainMenuControls);
		cards.add(cardGameControls);

		pane.add(comboBoxPane, BorderLayout.PAGE_START);
		pane.add(cards, BorderLayout.CENTER);
	}
}
