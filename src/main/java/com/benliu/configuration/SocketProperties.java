package com.benliu.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "benliu.socket")
public class SocketProperties {

	/**
	 * 服务器地址
	 */
	private String address;
	/**
	 * 服务器端口
	 */
	private Integer port;
	/**
	 * 超时时间，默认为3秒，单位为毫秒
	 */
	private Integer timeout = 3000;

	public SocketProperties() {
		super();
	}

	public SocketProperties(String address, Integer port) {
		super();
		this.address = address;
		this.port = port;
	}

	public SocketProperties(String address, Integer port, Integer timeout) {
		super();
		this.address = address;
		this.port = port;
		this.timeout = timeout;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public Integer getTimeout() {
		return timeout;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
	}

}
