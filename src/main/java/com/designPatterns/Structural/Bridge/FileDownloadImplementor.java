package com.designPatterns.Structural.Bridge;

public interface FileDownloadImplementor {

	public Object downloadFile(String path);
    
    public boolean storeFile(Object object);
}
