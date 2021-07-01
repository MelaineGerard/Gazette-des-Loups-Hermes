package fr.melaine_gerard.gazettedesloups;

import fr.blueberry.studio.hermes.api.plugins.Plugin;
import fr.melaine_gerard.gazettedesloups.managers.DatabaseManager;


public final class GazetteDesLoups extends Plugin {
    private static DatabaseManager databaseManager;
    @Override
    public void onEnable() {
        databaseManager = new DatabaseManager(getConfiguration().getString("db.jdbcurl"), getConfiguration().getString("db.username"), getConfiguration().getString("db.password"));
    }


    @Override
    public void onDisable() {
        databaseManager.close();
    }
}
