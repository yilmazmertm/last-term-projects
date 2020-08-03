package jsondata;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbOperations {

    private Connection conn;
    private final String url;
    private final String dbName;
    private final String driver;
    private final String userName;
    private final String password;
    Statement stmt;

    public DbOperations() {
        conn = null;
        url = "jdbc:mysql://localhost:3306/";
        dbName = "rest-users";
        driver = "com.mysql.jdbc.Driver";
        userName = "root";
        password = "admin";
        stmt = null;
    }

    public Connection getConnection(){
        return conn;
    }

    public Statement openConnection() throws Exception {
        Class.forName(driver).newInstance();
        conn = DriverManager.getConnection(url + dbName, userName, password);
        return conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
    }

    public void closeConnection() throws Exception{
        conn.close();
    }

    public CachedRowSet createStatement() {
        Statement st1;
        CachedRowSet resWanted = null;

        try {
            st1 = conn.createStatement();
            resWanted = RowSetProvider.newFactory().createCachedRowSet();
        }
        catch (SQLException ex) {
            Logger.getLogger(DbOperations.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resWanted;
    }
}
