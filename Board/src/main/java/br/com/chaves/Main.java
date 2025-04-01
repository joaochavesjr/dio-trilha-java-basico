package br.com.chaves;

import br.com.chaves.persistence.migration.MigrationStrategy;
import br.com.chaves.ui.MainMenu;

import java.sql.SQLException;

import static br.com.chaves.persistence.config.ConnectionConfig.getConnection;

public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }
}
