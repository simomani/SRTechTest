package encryptionText.resource;

public class TextResource implements ITextResource {

	private String original;
	private String encrypted;
		
	public String getOriginal() {
		return original;
	}
	
	public void setOriginal(String original) {
		this.original = original;
	}
	
	public String getEncrypted() {
		return encrypted;
	}
	
	public void setEncrypted(String encrypted) {
		this.encrypted = encrypted;
	}
}
