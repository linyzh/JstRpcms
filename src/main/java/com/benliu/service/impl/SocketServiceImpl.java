package com.benliu.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.benliu.configuration.SocketProperties;
import com.benliu.service.SocketService;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author LinYunZhi
 * @since 2018年12月25日
 */
@Slf4j
@Service
public class SocketServiceImpl implements SocketService {
	
	@Autowired
	private SocketProperties socketProperties;

	@Override
    public String getContextViaSocket(String order) {

        Socket client = null;
        PrintWriter printWriter = null;
        BufferedReader reader = null;
        try {
            client = new Socket(socketProperties.getAddress(), socketProperties.getPort());
            client.setSoTimeout(socketProperties.getTimeout());

            printWriter = new PrintWriter(client.getOutputStream());
            printWriter.println(order);
            printWriter.flush();

            InputStreamReader streamReader = new InputStreamReader(client.getInputStream());
            reader = new BufferedReader(streamReader);

            String line = "";
            synchronized (line) {
                for (int i = 0; i < 5; i++) {
                    line = reader.readLine();
                }
                if(log.isDebugEnabled()) {
                	log.debug(line);
                }
            }

            return line;

        } catch (Exception e) {
        	log.error(e.getMessage(), e);
            return "";

        } finally {
            try {
                if (printWriter != null) printWriter.close();
                if (reader != null) reader.close();
                if (client != null) client.close();
            } catch (IOException e) {
            	log.error(e.getMessage(), e);
            }
        }
    }
}
