package jp.co.cgGenesisZero.Dao;

public interface UserDataDao {
	/**
	 * SQL文を発行してUser_dataからUserIdを取得する。
	 * データがなかった場合‐1を返す。
	 * @param userName
	 * @param password
	 * @return
	 */
	public int getUserId(String userName,String password);
}
