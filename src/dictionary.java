//import java.util.Objects;
//
////STUDYING THIS CODE TO TACKLE IT
//
//import org.graalvm.compiler.word.Word;
//
///**
// * Wrapper around String to facilitate Lingo manipulations
// *
// * @author omar
// */
//public class dictionary {
//
//	private final String word;
//
//	public int length() {
//		return word.length();
//	}
//
//	/**
//     * Word Constructor. Other validation (like dictionary checking could happen
//     * here as well)
//     *
//     * @param word String with word candidate.
//     */
//    public Word(String word) {
//        this.word = word.toLowerCase();
//    }
//
//	@Override
//	public String toString() {
//		return word;
//	}
//
//	public char[] toArray() {
//		return word.toCharArray();
//	}
//
//	/**
//	 * Equality overridden to facilitate comparison
//	 *
//	 * @param otherword
//	 *            other word in comparison
//	 * @return true if words represent the same string, false otherwise
//	 */
//	@Override
//	public boolean equals(Object otherword) {
//		Word ow = (Word) otherword;
//		return this.toString().equals(ow.toString());
//	}
//
//	/**
//	 * HashCode overridden in accordance to equals method I think I read
//	 * somewhere that overriding equals() means overriding hashCode()
//	 *
//	 * @return
//	 */
//	@Override
//	public int hashCode() {
//		int hash = 3;
//		hash = 59 * hash + Objects.hashCode(this.word);
//		return hash;
//	}
//
//	/**
//	 * Static method. Returns a word with a char replaced in the given position.
//	 * Used in updating words with hints.
//	 *
//	 * @param word
//	 *            Old word
//	 * @param i
//	 *            Position in string that needs changing
//	 * @param c
//	 *            New char
//	 * @return New word (and new object) with char c on position i
//	 */
//	public static Word changeLetter(Word word, int i, char c) {
//		char[] newWord = word.toArray();
//		newWord[i] = c;
//		return new Word(new String(newWord));
//	}
//
//	/**
//	 * Returns a new word of all spaces (empty)
//	 *
//	 * @param length
//	 *            Length of empty word
//	 * @return word with spaces of length `length`
//	 */
//	public static Word emptyWord(int length) {
//		String s = "";
//		for (int i = 0; i < length; i++) {
//			s = s.concat(" ");
//		}
//		return new Word(s);
//	}
//}
