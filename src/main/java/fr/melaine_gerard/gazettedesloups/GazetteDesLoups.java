package fr.melaine_gerard.gazettedesloups;

import fr.blueberry.studio.hermes.api.plugins.Plugin;
import fr.melaine_gerard.gazettedesloups.managers.CacheManager;
import fr.melaine_gerard.gazettedesloups.managers.DatabaseManager;


public final class GazetteDesLoups extends Plugin {
    private static DatabaseManager databaseManager;
    private static CacheManager cacheManager;
    private static GazetteDesLoups instance;
    @Override
    public void onEnable() {
        instance = this;
        cacheManager = new CacheManager(getConfiguration().getString("cache.address"));
        databaseManager = new DatabaseManager(getConfiguration().getString("db.jdbcurl"), getConfiguration().getString("db.username"), getConfiguration().getString("db.password"));
    }


    @Override
    public void onDisable() {
        databaseManager.close();
    }

    public static GazetteDesLoups getInstance() {
        return instance;
    }

    public static DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public static CacheManager getCacheManager() {
        return cacheManager;
    }
}
