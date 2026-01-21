package org.joonzis.test;

public class SingerSongMain {
	public static void main(String[] args) {
		Song song = new Song("별뭐시기", "한국");
		Singer singer = new Singer("김종국");
		singer.setSong(song);
		singer.output();
	}
}
