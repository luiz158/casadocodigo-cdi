package br.com.casadocodigo.cdi.logger;

public class MyLogger {

	private static MyLogger myLogger;
	
	private static Class<? extends Object> clazz;

	public static MyLogger getLogger(Class<? extends Object> clazz) {
		MyLogger.clazz = clazz;
		myLogger = new MyLogger();
		
		return myLogger;
	}

	public void info(String info) {
		System.out.println("LOGGER INFO: " + clazz.getName());
		System.out.println(info);
	}

}
