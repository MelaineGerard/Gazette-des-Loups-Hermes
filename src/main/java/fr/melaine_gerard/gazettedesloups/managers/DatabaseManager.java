package fr.melaine_gerard.gazettedesloups.managers;

import com.zaxxer.hikari.HikariDataSource;
import fr.blueberry.studio.hermes.api.data.sql.DatabaseCredentials;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseManager {
    private final HikariDataSource ds;

    public DatabaseManager(String url, String user, String pass) {
        ds = new HikariDataSource();
        ds.setJdbcUrl(url);
        ds.setUsername(user);
        ds.setPassword(pass);
    }

    public HikariDataSource getHikariDataSource() {
        return ds;
    }

    public Connection getConnection() {
        try {
            return getHikariDataSource().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void close() {
        try {
            if (getConnection() != null) getConnection().close();
            getHikariDataSource().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
