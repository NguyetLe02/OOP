package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc {
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	
	public CompactDisc() {
		super();
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void addTrack(Track track) {
		if(tracks.contains(track)==true) {
			System.out.println("The input track is present in the list of tracks.");
		} else tracks.add(track);
	}
	
	public void removeTrack(Track track) {
		if(tracks.contains(track)==false) {
			System.out.println("The input track is not already in the list of tracks.");
		} else tracks.add(track);
	}

	public int getLength() {
		return tracks.size();
	}
}
