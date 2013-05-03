package jp.co.cgGenesisZero.Logic;

public interface LoginLogic {
	public boolean checkIfAlreadyLoggedIn(String sessionId);
	/**
	 * ログインできた場合に、userIdを返すメソッド。
	 * ‐1が返った場合には、ログイン失敗ということ。
	 * @param userId
	 * @param password
	 * @param sessionId
	 * @return
	 */
	public int logIn(String userName,String password,String sessionId);
}
