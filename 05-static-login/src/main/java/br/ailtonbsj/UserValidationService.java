package br.ailtonbsj;

public class UserValidationService {
	public static boolean isUserValid(String user, String pass) {
		if (user.equals("admin") && pass.equals("admin"))
			return true;
		else
			return false;
	}
}
