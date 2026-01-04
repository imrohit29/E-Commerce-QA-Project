package utils;

import java.sql.*;

public class DBValidation {
    private Connection conn;

    public void connectDB(String url, String user, String pass) throws SQLException {
        conn = DriverManager.getConnection(url, user, pass);
    }

    public ResultSet runQuery(String query) throws SQLException {
        Statement stmt = conn.createStatement();
        return stmt.executeQuery(query);
    }

    public void closeDB() throws SQLException {
        if(conn != null) conn.close();
    }
}
