package com.kit.ifelse;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {

		String ad = JOptionPane.showInputDialog("L�tfen Ad�n�z� giriniz:");
		
		if (ad.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Ad bo� ge�ilemez!");
		} else {
			
			String parola = JOptionPane.showInputDialog("L�tfen Parolan�z� giriniz:");

			if (parola.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Parola bo� ge�ilemez!");
			} else {
				JOptionPane.showMessageDialog(null, "Ho�geldiniz " + ad);
			}
			
		}

	}
}
