package services;


public interface GestiondeLogin {
	
	boolean createLogin(String login, String password);
	boolean verifLogin(String login, String password);
	boolean changePassword (String login, String OldPassword, String NewPassword);
	boolean deleteLogin (String login);

}
