package encryptionText.resource;

public interface ILetterResource {

	/**
	 * @param text Parses every single character of the encrypted text and 
	 * keeps track of their occurrence
	 */
	void parseTextEncrypted(String text);

	/**
	 * @param ch The character to be evaluated
	 * @return The character's occurrence
	 */
	int getEncryptionNumberPerChar(char ch);

}