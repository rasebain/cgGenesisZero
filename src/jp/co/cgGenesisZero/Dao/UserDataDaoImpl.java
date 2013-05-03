package jp.co.cgGenesisZero.Dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public final class UserDataDaoImpl implements UserDataDao {

	private DataSource dataSource;
	private static final String GET_SQL = "SELECT USER_ID FROM USER_DATA WHERE USER_NAME = ? AND USER_PASS = ?";

	@Override
	public int getUserId(String userName, String password) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		Integer result = jdbcTemplate.queryForObject(GET_SQL, Integer.class, userName, password);
		if (result != null) {
			return result;
		}
		return -1;
	}

	@Autowired
	public void setDataSource(DataSource dataSource){
		this.dataSource = dataSource;
	}
}
