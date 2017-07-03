package encryptionText.resource;

public class TextResource implements ITextResource {

	private String original;
	private String cipher;
		
	public String getOriginal() {
		return original;
	}
	
	public void setOriginal(String original) {
		this.original = original;
	}
	
	public String getCipher() {
		return cipher;
	}
	
	public void setCipher(String cipher) {
		this.cipher = cipher;
	}
}
