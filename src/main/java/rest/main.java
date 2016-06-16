package rest;

import org.springframework.boot.builder.SpringApplicationBuilder;

import controller.SimpleController;

public class main {
	public static void main(String[] args) {
		new SpringApplicationBuilder().sources(SimpleController.class).run(args);
	}
}
