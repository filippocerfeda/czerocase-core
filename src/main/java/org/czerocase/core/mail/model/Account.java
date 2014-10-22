package org.czerocase.core.mail.model;


public class Account {
    String key;
    String email;
    String username;
    String password;
    Server serverSend;
    Server serverReceive;
    Mail mailDefault;

    public Account(){

    }

    public Account(String key,String email, String username, String password, Server serverSend, Server serverReceive, Mail mailDefault) {
        this.key = key;
        this.email = email;
        this.username = username;
        this.password = password;
        this.serverSend = serverSend;
        this.serverReceive= serverReceive;
        this.mailDefault = mailDefault;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Server getServerSend() {
        return serverSend;
    }

    public void setServerSend(Server server) {
        this.serverSend = server;
    }

    public Server getServerReceive() {
        return serverReceive;
    }

    public void setServerReceive(Server serverReceive) {
        this.serverReceive = serverReceive;
    }

    public Mail getMailDefault() {
        return mailDefault;
    }

    public void setMailDefault(Mail mailDefault) {
        this.mailDefault = mailDefault;
    }
}
