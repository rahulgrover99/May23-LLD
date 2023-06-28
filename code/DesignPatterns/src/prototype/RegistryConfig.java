package prototype;

import java.util.HashMap;

public class RegistryConfig {

    private HashMap<String, DronaConfig> map;

    public RegistryConfig() {
        this.map = new HashMap<>();
        DronaConfig dronaConfig = new DronaConfig(
                "abc", "supersecure", "www.com",
                9090, "default", 123);

        DronaConfig specialConf = new SpecialConfig(
                "xyz", "notsupersecure", "www.com",
                1010, "default", 123, "securityismyth");

        this.map.put("simpleConfig", dronaConfig);
        this.map.put("specialConfig", specialConf);

    }

    public void register(String key, DronaConfig config) {
        map.put(key, config);
    }

    public DronaConfig get(String key) {
        return map.get(key);
    }

}
