package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
	String value = System.getProperty ("java.specification.version");
        double version = Double.parseDouble (value);
        return version;
    }

    public static void main(String[] args) {
	HelloWorld obj = new HelloWorld ();
//	System.out.println (obj.getVersion ());
    }
}
