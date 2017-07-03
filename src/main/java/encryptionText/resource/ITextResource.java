package encryptionText.resource;

public interface ITextResource {

	/**
	 * @return The original text before encryption
	 */
	String getOriginal();

	/**
	 * @param original Set the original text before encryption
	 */
	void setOriginal(String original);

	/**
	 * @return the encrypted base64 value of the text
	 */
	String getEncrypted();

	/**
	 * @param encrypted Set the encrypted value of text
	 */
	void setEncrypted(String encrypted);

}