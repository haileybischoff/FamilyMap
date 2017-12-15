package model;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by haileybischoff on 12/14/17.
 */

public class Register {

    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;

    private String serverHost;
    private int serverPort;

    private String authToken;
    private String personID;

    public Register() {
    }

    public Register(String userName, String password, String firstName, String lastName, String email, String gender, String serverHost, int serverPort) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
        return "{" + "username:\""  + userName  + "\"," +
                     "password:\""  + password  + "\"," +
                     "email:\""     + email     + "\"," +
                     "firstName:\"" + firstName + "\"," +
                     "lastName:\""  + lastName  + "\"," +
                     "gender:\""    + gender    + "\"" +
                "}";
    }

    @Override
    public String toString() {
        return "Register{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", serverHost='" + serverHost + '\'' +
                ", serverPort=" + serverPort +
                ", authToken='" + authToken + '\'' +
                ", personID='" + personID + '\'' +
                '}';
    }
}
