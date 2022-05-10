package com.cg.threads;
public class WaitNotifyProducerConsumerExMain {
public static void main(String[] args) {
	Video video=new Video();
	Audio audio=new Audio();
	
	video.setAudio(audio);
	audio.setVideo(video);
	
	
	Thread t1=new Thread(video);
	Thread t2=new Thread(audio);
	t1.start(); t2.start();
}
static class Video implements Runnable{
	private Audio audio;
	
	public void setAudio(Audio audio) {
		this.audio = audio;
	}
	public void run() {
		playVideo();
	}
	synchronized void playVideo(){
		for (int i = 1; i <= 10000; i++) {
			System.out.println("********** playing Video ****** " +i);
				synchronized (audio) { //acquiring the lock of audio obj
					audio.notify();//signal to waiting thread
				}
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
static class Audio implements Runnable{
	Video video;

	public void setVideo(Video v) {
		this.video = v;
	}
	public void run() {
		playAudio();
	}
	synchronized void playAudio(){
		for (int i = 1; i <= 10000; i++) {
			try {
				wait();//release the lock & block state
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("------ playing Audio -------"+i);
			synchronized (video) { //acquired the lock of video
				video.notify(); //notify the thread 
			}
		}
	}
	
}
}