package com.example.demo.config;

public class DemoBean {
	
	private String message;

    public DemoBean(String message) {
        this.message = message;
    }

    public void showMessage() {
        System.out.println(message);
    }

}
