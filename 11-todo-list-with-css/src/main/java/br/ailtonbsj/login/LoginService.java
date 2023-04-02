package br.ailtonbsj.login;

public class LoginService {
	public boolean isUserValid(String user, String pass) {
		if (user.equals("admin") && pass.equals("admin"))
			return true;
		else
			return false;
	}
}
