package com.designPatterns.Behavioural.Template;

public class Behavioural_Template {

	//https://www.journaldev.com/1763/template-method-design-pattern-in-java
	
	//GIST
	//It is used to abstract out common methods of the implementor classes
	//Also to abstract out the main implementation method of all implementor classes
	
	//USE CASES
	/*
	When we have pre-defined steps to achieve some algorithm.
	When we want to avoid duplicating code, moving the common implementation and steps in the base class.
	
	Avoid code duplication
	
	Problem Statement
	Lets say we have to build a house which generally has certain steps.
	Some steps have default implementation and some steps are very specific to implementer with no default implementation.
	
	
	Steps to create Template Pattern
	--------------------------------
	1. Create a base abstract class having (HouseTemplate)
	some private (default) methods
	some abstract methods
	final buildHouse method
	
	2. Create concrete classes WoodenHouse, GlassHouse etc
	which override these abstract methods
	
	3. Create a TestClass Housing Client
	
	
	Key Design Points
	-----------------
	Mark template method as final so that implementing class can’t override and change the order of steps.
	In base class, implement all the methods with default implementation so the derived classes need not to define them.
	Mark all methods abstract which derived classes must implement.

	Popular implementations of template method pattern
	--------------------------------------------------
	These are few popular existing implementations of template method design pattern.
	
	Non-abstract methods of InputStream, OutputStream, Reader, Writer from Java IO.
	Non-abstract methods of some abstract collection classes like AbstractList, AbstractSet, AbstractMap etc.
	
	*/
}
