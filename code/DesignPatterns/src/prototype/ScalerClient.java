package prototype;

import org.w3c.dom.ls.LSOutput;

public class ScalerClient {



    public static void main(String[] args) {
        // Template object that imagine has been provided.

        RegistryConfig registryConfig = new RegistryConfig();

        DronaConfig dronaConfig = registryConfig.get("simpleConfig");

        DronaConfig specialConf = registryConfig.get("specialConfig");

        // Main Part

        DronaConfig copy = dronaConfig.clone();
        copy.account = 91911;

        DronaConfig copy2 = specialConf.clone();

        System.out.println("DEBUG");


    }

}
