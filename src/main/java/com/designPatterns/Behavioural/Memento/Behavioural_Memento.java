package com.designPatterns.B_Memento;

public class Behavioural_Memento {
	/*
	https://howtodoinjava.com/design-patterns/behavioral/memento-design-pattern/
	https://www.journaldev.com/1734/memento-design-pattern-java _ IMP read this one 
	
			
	//GIST
	Whenever you have done many operations on an object
	and you want to bring the state of this object back to a state
	he intent of memento pattern is to capture the internal state of an object 
	without violating encapsulation and thus providing a mean for restoring the object into initial state when needed.
	
	//USE CASE
	Lets say you want to do a number of operations on an Object which created once
	Once you do so many operations , you want a mean to set the status of it back to initial state
	
	//REAL LIFE EXAMPLES
	Paint applications undo and redo
	Calculator applications revisit earlier calculations
	
	javax.swing.text.JTextComponent class provides an undo support mechanism. 
	javax.swing.undo.UndoManager can act as a caretaker,
	an implementation of javax.swing.undo.UndoableEdit can act like a memento, 
	and an implementation of javax.swing.text.Document can act like an originator.
	
	
	//Steps to create a memento Pattern
	1_ Originator (Article) is the object which knows how to create and save its state 
	createMemento() //creating memory for the state to be saved
	restore(memento) //to resotre the state 
	
	2_ Caretaker performs the operation on the Originator
	
	3_ Memento an immutable class which is used by the Originator to store its state as a memento
	
	In this example, we are creating memento for an Article object 
	which has three basic attributes – id, title and content. ArticleMemento class is used as memento for Article objects.
	
	*/
}
