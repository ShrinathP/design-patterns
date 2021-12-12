package com.designPatterns.S_Bridge;

public interface FileDownloadImplementor {

	public Object downloadFile(String path);
    
    public boolean storeFile(Object object);
}
