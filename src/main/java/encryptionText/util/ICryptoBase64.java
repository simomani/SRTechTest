package encryptionText.util;

public interface ICryptoBase64 {

	/**
	 * @param text The String to be encrypted
	 * @return The encrypted base64 string
	 */
	String encryptText(String text);

}