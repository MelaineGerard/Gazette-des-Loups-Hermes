package fr.melaine_gerard.gazettedesloups.managers;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

public class CacheManager {
    private final RedissonClient redisson;
    public CacheManager(String address) {
        Config config = new Config();
        config.useClusterServers().addNodeAddress(address);
        redisson = Redisson.create(config);
    }

    public RedissonClient getRedisson() {
        return redisson;
    }
}
