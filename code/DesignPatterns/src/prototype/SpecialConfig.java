package prototype;

public class SpecialConfig extends DronaConfig {

    private String specialToken;

    public SpecialConfig(String user, String password, String url, int port, String sessionName, int account, String specialToken) {
        super(user, password, url, port, sessionName, account);
        this.specialToken = specialToken;
    }


    public SpecialConfig(SpecialConfig config) {
        super(config);
        this.specialToken = config.specialToken;
    }

    @Override
    public SpecialConfig clone() {
        return new SpecialConfig(this);
    }

}
