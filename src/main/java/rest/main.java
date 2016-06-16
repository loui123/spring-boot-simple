package rest;

import java.util.HashMap;

import org.springframework.boot.builder.SpringApplicationBuilder;

import controller.SimpleController;

public class main {

	public static void main(String[] args) {
		HashMap<String, Object> props = new HashMap<>();
		props.put("server.port", 9999);

		new SpringApplicationBuilder().sources(SimpleController.class).properties(props).run(args);
	}
}
