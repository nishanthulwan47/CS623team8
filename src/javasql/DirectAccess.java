package javasql;

import java.sql.SQLException;
import java.sql.Statement;

public class DirectAccess {
	private Statement statement;

	public DirectAccess(Statement statement) {
		super();
		this.statement = statement;
	}

	public void Delete(String str) throws SQLException {
		statement.executeUpdate(str);
	}
	
	public void endStatement() throws SQLException {
		statement.close();
	}
	
	public Statement getStatement() {
		return this.statement;
	}
}
