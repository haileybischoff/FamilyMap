package model;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by haileybischoff on 12/14/17.
 */

public class Login {

    private String userName;
    private String password;

    private String serverHost;
    private int serverPort;

    private String authToken;
    private String personID;

    public Login() {
    }

    public Login(String userName, String password, String serverHost, int serverPort) {
        this.userName = userName;
        this.password = password;
        this.serverHost = serverHost;
        this.serverPort = serverPort;
    }

    public static void getUserInfo(Login login, JSONObject root) throws JSONException {
        String aAuthToken = root.getString("authToken");
        String aPersonID = root.getString("personId");

        login.setAuthToken(aAuthToken);
        login.setPersonID(aPersonID);
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getServerHost() {
        return serverHost;
    }

    public int getServerPort() {
        return serverPort;
    }

    public String getAuthToken() {
        return authToken;
    }

    public String getPersonID() {
        return personID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setServerHost(String serverHost) {
        this.serverHost = serverHost;
    }

    public void setServerPort(int serverPort) {
        this.serverPort = serverPort;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String toJSON(){
        return "{" + "username:\"" + userName + "\"," +
                     "password:\"" + password + "\"" +
                "}";
    }


    @Override
    public String toString() {
        return "Login{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", serverHost='" + serverHost + '\'' +
                ", serverPort=" + serverPort +
                '}';
    }
}
