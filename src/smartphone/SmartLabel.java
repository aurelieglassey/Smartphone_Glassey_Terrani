package smartphone;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

/**
 * Classe qui met en forme l'apparence d'un label
 * @author Aurélie Glassey
 */
public class SmartLabel extends JLabel
{

	/**
	 * Constructeur de la classe SmartLabel
	 * Mise en forme des bords, de la couleur et de l'écriture d'un label
	 * @param text Le texte affiché par le label
	 */
	public SmartLabel(String text)
	{
		super(text);
		setBorder(BorderFactory.createEmptyBorder(10, 10 , 10, 10));
		setFont( Smartphone.getSmartFont("medium") );
		setBackground(new Color(250, 250, 250));
		setOpaque(true);
	}
}
