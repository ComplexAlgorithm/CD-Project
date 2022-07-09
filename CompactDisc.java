/**
 * The first step in this development process is to develop the Compact Disc class which would
hold the name of the artist, the name of the album, and the language of the lyrics. This should
class should exhibit object-oriented principles by making the instance variables private and
having the appropriate accessor and mutator methods to allow access and manipulation of the
attributes of a CD. This class also should override the toString method from the Object class so
that all information about the CD is returned in String form. 
 * @author Joshua
 *
 */
public class CompactDisc {
	private String artist;
	private String album;
	private String language;
	
	public CompactDisc() {
		super();
		artist = " "; 
		album = " ";
		language = " ";
	}
	public void  setArtist(String newArtist) {
		artist = newArtist;
	}
	public String getArtist() {
		return artist;
	}
	public void setAlbum(String newAlbum) {
		album = newAlbum;
	}
	public String getAlbum() {
		return album;
	}
	public void setLanguage(String newLanguage) {
		language = newLanguage;
	}
	public String getLanguage() {
		return language;
	}
	
	public String toString() {
		return "Artist:" + artist + "Album:" + album + "Language:" + language;
	}
}
