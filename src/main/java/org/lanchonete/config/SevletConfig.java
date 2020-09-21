package org.lanchonete.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SevletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	//Classes de configuração do spring
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {AppWebConfiguration.class};
	}

	@Override
	//Mapeamento dos endpoints
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/categoria"};
	}


}
