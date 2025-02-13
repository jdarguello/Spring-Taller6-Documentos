package com.BancoC.Documentos;

import org.springframework.boot.SpringApplication;

public class TestDocumentosApplication {

	public static void main(String[] args) {
		SpringApplication.from(DocumentosApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
