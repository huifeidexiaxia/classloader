package com.study.j2se.classpath;

import java.net.URL;

public class Test2 {
public static void main(String[] args) {
	
		// URL[] urls=sun.misc.Launcher.getBootstrapClassPath().getURLs();
		// for (int i = 0; i < urls.length; i++) {
		//
		// System.out.println(urls);
		// }
	
	System.out.println(System.getProperty("java.ext.dirs"));
	   ClassLoader extensionClassloader=ClassLoader.getSystemClassLoader().getParent();
	   System.out.println("the parent of extension classloader : "+extensionClassloader.getParent());
	   
	   
	   System.out.println(System.getProperty("java.class.path"));
	   System.out.println( System.getProperty("sun.boot.class.path"));
	  
}
}
