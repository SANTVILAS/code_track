package com.song.mycomparator;

import java.util.Comparator;

import sorting_custom_object.Song;

public class ArtistNameCompartor implements Comparator<Song> {

	@Override
	public int compare(Song song1, Song song2) {

		return -song1.getArtist().compareTo(song2.getArtist());
	}



}
