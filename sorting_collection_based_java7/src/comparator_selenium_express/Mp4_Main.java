package comparator_selenium_express;

import java.util.ArrayList;
import java.util.Collections;

import com.song.mycomparator.ArtistNameCompartor;
import com.song.mycomparator.SortByYearComparator;

import MyUtility.MyUtil;
import sorting_custom_object.Song;

public class Mp4_Main {
	public static void main(String[] args) {

		ArrayList<Song> list = new ArrayList<Song>();

		Song song1 = new Song("CCC", "BBB", 2014);
		Song song2 = new Song("AAA", "DDD", 2018);
		Song song3 = new Song("EEE", "FFF", 2024);
		Song song4 = new Song("XXX", "HHH", 2017);
		Song song5 = new Song("LLL", "JJJ", 2013);

		list.add(song1);
		list.add(song2);
		list.add(song3);
		list.add(song4);
		list.add(song5);
		System.out.println("Before sorting =====================");
		MyUtil.interateList(list);
		
	//	SortByYearComparator yearComparator = new SortByYearComparator();
		
	//	Collections.sort(list, yearComparator);
		Collections.sort(list, new SortByYearComparator());
		Collections.sort(list, new ArtistNameCompartor());
		System.out.println("After sorting =====================");
		System.out.println();
		MyUtil.interateList(list);

	}
}
