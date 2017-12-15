package com.example.haileybischoff.familymap;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import model.Login;
import model.Register;

/**
 * Created by haileybischoff on 12/12/17.
 */

public class LoginFragment extends Fragment {

    private Button mSignInButton;
    private Button  mRegisterButton;
    private EditText mServerHostField;
    private EditText mServerPortField;
    private EditText mUserNameField;
    private EditText mPasswordField;
    private EditText mFirstNameField;
    private EditText mLastNameField;
    private EditText mEmailField;
    private RadioButton mMaleButton;
    private RadioButton mFemaleButton;

    private Login oLogin;
    private Register oRegister;

    private static String userName;
    private static String password;
    private static String firstName;
    private static String lastName;
    private static String email;
    private static String gender;
    private static String serverHost;
    private static int serverPort;

    public LoginFragment() {
    }

    public static LoginFragment newInstance(Login thisLogin, Register thisRegister){
        LoginFragment fragment = new LoginFragment();
        Bundle args = new Bundle();
        if(thisLogin != null) {
            args.putString(userName, thisLogin.getUserName());
            args.putString(password, thisLogin.getPassword());
            args.putString(serverHost, thisLogin.getServerHost());
            args.putInt(String.valueOf(serverPort), thisLogin.getServerPort());

        }

        if(thisRegister != null) {
            args.putString(userName, thisRegister.getUserName());
            args.putString(password, thisRegister.getPassword());
            args.putString(firstName, thisRegister.getFirstName());
            args.putString(lastName, thisRegister.getLastName());
            args.putString(email, thisRegister.getEmail());
            args.putString(gender, thisRegister.getGender());
            args.putString(serverHost, thisRegister.getServerHost());
            args.putInt(String.valueOf(serverPort), thisRegister.getServerPort());
        }

        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(getArguments() != null){
            if(getArguments().getString(firstName) != null) {
                oRegister = new Register();
                oRegister.setUserName(getArguments().getString(userName));
                oRegister.setPassword(getArguments().getString(password));
                oRegister.setFirstName(getArguments().getString(firstName));
                oRegister.setLastName(getArguments().getString(userName));
                oRegister.setEmail(getArguments().getString(userName));
                oRegister.setGender(getArguments().getString(userName));
                oRegister.setServerHost(getArguments().getString(serverHost));
                oRegister.setServerPort(getArguments().getInt(String.valueOf(serverPort)));
            }
            else {
                oLogin = new Login();
                oLogin.setUserName(getArguments().getString(userName));
                oLogin.setPassword(getArguments().getString(password));
                oLogin.setServerHost(getArguments().getString(serverHost));
                oLogin.setServerPort(getArguments().getInt(String.valueOf(serverPort)));
            }
        }
    }

    public void onLoginButtonClicked(){
        // Figure out what the crap to do
    }

    public void onRegisterButtonClicked(){
        // Figure out what the crap to do
    }

    public void onMaleButtonClicked(){
        // Figure out what the crap to do
    }

    public void onFemaleButtonClicked(){
        // Figure out what the crap to do
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_login, container, false);

        mUserNameField = (EditText) v.findViewById(R.id.user_name_id);
        mPasswordField = (EditText) v.findViewById(R.id.password_id);
        mFirstNameField = (EditText) v.findViewById(R.id.first_name_id);
        mLastNameField = (EditText) v.findViewById(R.id.last_name_id);
        mEmailField = (EditText) v.findViewById(R.id.email_id);
        mServerHostField = (EditText) v.findViewById(R.id.server_host_id);
        mServerPortField = (EditText) v.findViewById(R.id.server_port_id);

        mSignInButton = (Button) v.findViewById(R.id.sign_in);
        mSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLoginButtonClicked();
            }
        });

        mRegisterButton = (Button) v.findViewById(R.id.register);
        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegisterButtonClicked();
            }
        });

        mMaleButton = (RadioButton) v.findViewById(R.id.male_button_id);
        mMaleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onMaleButtonClicked();
            }
        });

        mFemaleButton = (RadioButton) v.findViewById(R.id.female_button_id);
        mFemaleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFemaleButtonClicked();
            }
        });

        return v;
    }

    public Login getLoginInfo(){
        oLogin.setUserName(mUserNameField.getText().toString());
        oLogin.setPassword(mPasswordField.getText().toString());
        oLogin.setServerHost(mServerHostField.getText().toString());
        oLogin.setServerPort(Integer.parseInt(mServerPortField.getText().toString()));

        return oLogin;
    }

    public Register getRegisterInfo(){
        oRegister.setUserName(mUserNameField.getText().toString());
        oRegister.setPassword(mPasswordField.getText().toString());
        oRegister.setPassword(mFirstNameField.getText().toString());
        oRegister.setPassword(mLastNameField.getText().toString());
        oRegister.setPassword(mEmailField.getText().toString());
        oRegister.setServerHost(mServerHostField.getText().toString());
        oRegister.setServerPort(Integer.parseInt(mServerPortField.getText().toString()));

        return oRegister;
    }

    public void onLogin(boolean loggedIn){
        Toast loginStatus;
        if(loggedIn){
            loginStatus = Toast.makeText(this.getContext(), "Login succesful!", Toast.LENGTH_SHORT);
            // add what to do
        }
        else {
            loginStatus = Toast.makeText(this.getContext(), "Login failed!", Toast.LENGTH_SHORT);
        }

        loginStatus.show();

    }
}
