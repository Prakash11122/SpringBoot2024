package com.it.pradhan;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("my.app")
@Component
public class EmailConfig {
	
	private String host;
	private int port;
	private String username;
	private String pasword;
	
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	@Override
	public String toString() {
		return "EmailConfig [host=" + host + ", port=" + port + ", username=" + username + ", pasword=" + pasword + "]";
	}
	
	
	
	

}
