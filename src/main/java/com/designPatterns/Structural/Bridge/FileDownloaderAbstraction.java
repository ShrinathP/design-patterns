package com.designPatterns.S_Bridge;
//Abstraction (abstract/interface)
public interface FileDownloaderAbstraction {
	
	public Object download(String path);
    
    public boolean store(Object object);
}
