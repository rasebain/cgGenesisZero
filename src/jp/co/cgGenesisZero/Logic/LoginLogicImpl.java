package jp.co.cgGenesisZero.Logic;

import jp.co.cgGenesisZero.Dao.UserDataDao;
import jp.co.cgGenesisZero.Dao.UserDataDaoImpl;

public class LoginLogicImpl implements LoginLogic {

	@Override
	public boolean checkIfAlreadyLoggedIn(String sessionId) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public int logIn(String userName, String password, String sessionId) {
		UserDataDao dao = new UserDataDaoImpl();
		dao.getUserId(userName, password);
		return 0;
	}

}
