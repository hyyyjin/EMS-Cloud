package com.mir.vtn.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mir.ems.GUI.Initial;
import com.mir.ems.GUI.MainFrame;
import com.mir.ems.coap.CoAPServer;
import com.mir.ems.globalVar.global;
import com.mir.ems.main.EmsMainClass;
import com.mir.pushServer.PushHttpServer;

@SpringBootApplication
public class Run {

	static void eventIDFileIO() {
		
		FileReader fileReader;
		
		try {
			fileReader = new FileReader("EVENTID.txt");
			BufferedReader br = new BufferedReader(fileReader);
			
			String type=null;
			
			while((type=br.readLine()) != null) {
				
				int seq = Integer.parseInt(type.split("=>")[0]);
				String eventID = type.split("/")[1];
				
				global.eventID.put(seq, eventID);
				
			}
			
		}catch (IOException e) {
			
			
			
			
		}
		
	}
	
	public static void main(String... args) throws Exception {

		try {
			eventIDFileIO();
			FileReader fileReader = new FileReader("ems.cfg");

			BufferedReader br = new BufferedReader(fileReader);

			global.summaryReport = Boolean.parseBoolean(br.readLine().split(":")[1]);
			global.summaryInterval = Integer.parseInt(br.readLine().split(":")[1]);

			if (br.readLine().split(":")[1].equals("COAP")) {
				new CoAPServer();
			}
			
			global.autoDR = Boolean.parseBoolean(br.readLine().split(":")[1]);
			
			br.close();
		} catch (Exception e) {

		}

		new EmsMainClass();
//		new CoAPServer();

		SpringApplication.run(Run.class, args);

		PushHttpServer server = new PushHttpServer();
		server.start();

//		Initial initial;
//		new EmsMainClass();
//		main.initial = new Initial();
//		main.initial.setMain(main);

		// Global.setBrokerIP("166.104.28.51");
		// Global.setParentnNodeID("SERVER_EMS1");

		// boolean pullModel = true;

		// Thread emapExcute = new Thread(new Connection("VTN1", "EMAP1.0b", "MQTT"));
		// emapExcute.start();
		// new Connection("CLIENTEMA1").start();

		// Global.databaseConnection.start();
		// new StoreData_cema();

	}

}
