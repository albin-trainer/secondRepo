package com.cg.threads;

public class FileDownloader implements Runnable {

	public void run() {
		System.out.println("File Downloader thread starts working ....");	
		for(int i=1;i<=1000;i++) {
			System.out.println("Child : "+i);
		}
	}

}
