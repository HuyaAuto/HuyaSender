package com.skytalking.bean;

public class SocketLoginFinished {
    public static final SocketLoginFinished SUCCESS = new SocketLoginFinished(true);
    public static final SocketLoginFinished FAILED = new SocketLoginFinished(false);
    public boolean loginSuccessful = false;

    public SocketLoginFinished(boolean loginSuccessful) {
        this.loginSuccessful = loginSuccessful;
    }
}
