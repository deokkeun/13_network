package edu.kh.network.run;

import javax.swing.table.TableColumn;

import edu.kh.network.model.service.TCPServer;

public class ServerRun {

	public static void main(String[] args) {
		TCPServer server = new TCPServer();
		server.serverStart();
	}

}
