package org.manager;

import java.util.ServiceLoader;

import org.People;

/**
 * @ClassName: MainApp
 * @Description: spi 应用demo
 * @author yalonz
 *
 */
public class MainApp {
	public static void main(String[] args) {
		ServiceLoader<People> serviceLoader = ServiceLoader.load(People.class);
		for (People p : serviceLoader) {
			p.shopping();
		}
	}
}
