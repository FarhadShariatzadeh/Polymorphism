package Masterpieces;

import java.util.ArrayList;

/**
 * Represent the common properties of an MasterpieceSelection.
 * A MasterpieceSelection has a name and list of Artists.
 */
public class MasterpieceSelection extends Creator {

  protected String nameOfGroup;
  protected ArrayList<Artist> artists;

  /**
   * Construct a new MasterpieceSelection object and initializes
   * it with the given name of a group and list of Artists.
   * @param nameOfGroup
   * @param artists
   */
  public MasterpieceSelection(String nameOfGroup, ArrayList<Artist> artists) {
    this.nameOfGroup = nameOfGroup;
    this.artists = artists;
  }

  /**
   * @return the name of group
   */
  public String getNameOfGroup() {
    return nameOfGroup;
  }

  /**
   * @return the list of Artist
   */
  public ArrayList<Artist> getArtists() {
    return artists;
  }
}
