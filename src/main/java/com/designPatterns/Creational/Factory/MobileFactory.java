package com.designPatterns.Creational.Factory;

public class MobileFactory {

	//you can put produce mobile as a static method also
	public static Mobile produceMobile(String type){
		switch (type) {
		case Mobile.IPHONE:
			return new Iphone("Adreno", "6gb", "12nm");
		case Mobile.SONY:
			return new Sony("Adreno", "6gb", "FHD");
		case Mobile.SAMSUNG:
			return new Samsung("6gb", "12nm");
		}
		return null;
	}
}
