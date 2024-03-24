package com.song.mycomparator;

import java.util.Comparator;

import sorting_custom_object.Song;

public class SortByYearComparator implements Comparator<Song>{

	@Override
	public int compare(Song song, Song anotherSong) {
		
		if(song.getYear()<anotherSong.getYear()) {
			return -1;
		}else if(song.getYear()>anotherSong.getYear()) {
			return 1;
		}
			return 0;
		
	
	}

}
