package com.designPatterns.S_Bridge;

public class Structural_Bridge {

	//https://howtodoinjava.com/design-patterns/structural/bridge-design-pattern/

	/*
	//GIST
	Bridge is used to decouple a class in 2 parts - abstraction  and its implementation
	so that both can evolve in the future without affecting each other
	
	Increases loose coupling betwen abstraction and its implementation
	
	IMP BRIDGE IS AN APPLICATION OF OLD ADVICE _ Prefer composition over inheritance	
	//USE CASE
	
	Without Bridge Pattern
				-----------Shape-------------------
				|								|
			Rectangle						Circle
	BlueRectangle RedRectangle          BlueCircle  Redcircle
	
	Above solution has one problem, 
	If you want to change The rectangle class you will have to change the
	Bluerectange and RedRectangle as well
	If the change is color specific then you may have to change the Circle classes as well
	
	
	YOu can change this using decoupling Shape and Color
		-----Shape------							----Color----
		|				|							|			|
	Rectangle(Color)   Circle(Color)			Blue			Red
	
	Now when you change any Shape , color would be unchanged and vice cersa
	
	//Steps to Create a Bridge pattern
	
	1. Abstraction class  ABSTRACT CLASS (IMP - THIS HAS THE INSTANCE OF THE IMPLEMENTOR)
	2. Refined abstraction  (implements/extends above class) NORMAL CLASS
		|
		| Connected via an Implementor instance 
		|
	3. Implementer (Interface)
	4. Concrete Implementor (Implementing above Impslementor)
	
	//USE CASE
	 Most used when we need to give platform independence
	 
	 Let’s say, we are designing an application which can be download and store files on any operating system. 
	 I want to design the system in such a way, I should be able to add more platform support in future with minimum change. 
	 Additionally, If I want to add more support in downloader class (e.g. delete the download in windows only), 
	 then It should not affect the client code as well as linux downloader.
	 
	 */
}
