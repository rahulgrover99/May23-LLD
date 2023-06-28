package prototype;

public class DronaConfig {

    private String user;
    private String password;
    private String url;
    private int port;
    public String sessionName;
    public int account;

    public DronaConfig(String user, String password, String url, int port, String sessionName, int account) {
        this.user = user;
        this.password = password;
        this.url = url;
        this.port = port;
        this.sessionName = sessionName;
        this.account = account;
    }

    // Copy Constructor
    public DronaConfig(DronaConfig other) {
        this.user = other.user;
        this.password = other.password;
        this.url = other.url;
        this.port = other.port;
        this.sessionName = other.sessionName;
        this.account = other.account;
    }


    @Override
    public DronaConfig clone() {
        return new DronaConfig(this);
    }



}
