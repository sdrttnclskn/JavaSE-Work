package com.sdrttnclskn.ifelse;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {

		String ad= JOptionPane.showInputDialog("L�tfen ad�n�z giriniz:");
		
		if (ad.isEmpty()) {
		
			JOptionPane.showMessageDialog(null, "Ad Bo� ge�iilmez.");
		} else {
        
			String parola= JOptionPane.showInputDialog("L�tfen parolan�z�  giriniz:");
            if (parola.isEmpty()) {
    			JOptionPane.showMessageDialog(null, "parola Bo� ge�iilmez.");

			} else {
 
				JOptionPane.showMessageDialog(null,"Ho�geldinz " +ad);
			}
		}
		
	}

}
