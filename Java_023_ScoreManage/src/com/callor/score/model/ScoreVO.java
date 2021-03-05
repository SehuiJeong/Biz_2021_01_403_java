package com.callor.score.model;

public class ScoreVO {
	
	private int order;
	private int kor;
	private int eng;
	private int math;
	private int music;
	private int history;
	
	private int total;
	private float avg;
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMusic() {
		return music;
	}
	public void setMusic(int music) {
		this.music = music;
	}
	public int getHistory() {
		return history;
	}
	public void setHistory(int history) {
		this.history = history;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "ScoreVO [order=" + order + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", music=" + music
				+ ", history=" + history + ", total=" + total + ", avg=" + avg + "]";
	}
	
	

}
