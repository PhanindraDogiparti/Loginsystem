import java.util.HashMap;

public class IDandPasswords {
    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPasswords() {
        logininfo.put(" ", " "); //Login info with your username and password in that empty Spaces
        logininfo.put(" ", " "); //Login info with your username and password in that empty Spaces
        logininfo.put(" ", " "); //Login info with your username and password in that empty Spaces
        logininfo.put(" ", " "); //Login info with your username and password in that empty Spaces

    }

    protected HashMap<String, String> getLogininfo() {
        return logininfo;
    }
}
