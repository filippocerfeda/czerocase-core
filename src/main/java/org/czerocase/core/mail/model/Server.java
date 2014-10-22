/*
 *  Czero Case is the Open Source Platform, realized by ImagoItalia Srl,
 *  to quickly develop and deploy innovative Case Management solutions.
 *  Czero Case framework, based on Java environment, enables designer
 *  and developers to build advanced solutions for document and process
 *  management ensuring compliance with government regulations
 *  and industry standards.
 * 
 *  Copyright (C) 2012 ImagoItalia srl <http://www.imagoitalia.com>
 *  
 *  This file is part of Czero Case.
 *  
 *  Czero Case is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *   
 *  Czero Case is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *   
 *  You should have received a copy of the GNU General Public License
 *  along with Czero Case.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.czerocase.core.mail.model;

public class Server {
    
    String protocol;
    boolean doAuth;
    String hostname;
    String port;
    boolean enableStartTsl;

    public Server(){
    }

    public Server(String protocol, boolean doAuth, String hostname, String port, boolean enableStartTsl) {
        this.protocol = protocol;
        this.doAuth = doAuth;
        this.hostname = hostname;
        this.port = port;
        this.enableStartTsl = enableStartTsl;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public boolean isDoAuth() {
        return doAuth;
    }

    public void setDoAuth(boolean doAuth) {
        this.doAuth = doAuth;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public boolean isEnableStartTsl() {
        return enableStartTsl;
    }

    public void setEnableStartTsl(boolean enableStartTsl) {
        this.enableStartTsl = enableStartTsl;
    }
}