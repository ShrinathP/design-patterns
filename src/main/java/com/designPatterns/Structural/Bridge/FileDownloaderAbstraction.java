package com.designPatterns.Structural.Bridge;
//Abstraction (abstract/interface)
public interface FileDownloaderAbstraction {
	
	public Object download(String path);
    
    public boolean store(Object object);
}
