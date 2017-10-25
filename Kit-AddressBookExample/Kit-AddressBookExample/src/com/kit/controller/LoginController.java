package com.kit.controller;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.kit.models.User;
import com.kit.services.LoginService;

public class LoginController {

//	public boolean girisKontrol(String kullaniciAdi, String parola) throws ClassNotFoundException, SQLException {
	public boolean girisKontrol(User user) throws ClassNotFoundException, SQLException {

//		if(kullaniciAdi.isEmpty() || parola.isEmpty()){
		if(user.getUsername().isEmpty() || user.getPassword().isEmpty()){

			JOptionPane.showMessageDialog(null, "Kullan�c� Ad� veya Parola bo� ge�ilemez!");
		}else {
//			boolean result = new LoginService().girisKontrol(kullaniciAdi, parola);
			boolean result = new LoginService().girisKontrol(user);

			if(result){
				JOptionPane.showMessageDialog(null, "Giri� ba�ar�l�!");
				return true;
			}else {
				
				JOptionPane.showMessageDialog(null, "Kullan�c� Ad� veya Parola hatal�!");
				return false;
			}
			
		}
		return false;
		
		
		
		
	}

}
