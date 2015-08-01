package org.starter.freemarker;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;

public class Starter01 {

	@Test
	public void temp() {
		System.out.println("test");
	}
	
	@Test
	public void t001() throws IOException {
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_22);
		cfg.setDirectoryForTemplateLoading(new File("F:\\git repositories\\starter_src\\src\\test\\java\\org\\starter\\freemarker"));
		cfg.setDefaultEncoding("UTF-8");
		
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
	}
}
