package rest;

import java.util.HashMap;
import java.util.Properties;

import org.springframework.boot.builder.SpringApplicationBuilder;

import controller.SimpleController;

public class main {

	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.setProperty("java.runtime.version", "1.7");
		HashMap<String, Object> props = new HashMap<String, Object>();
		props.put("server.port", 9999);

		new SpringApplicationBuilder().sources(SimpleController.class).properties(props).run(args);
	}
}
