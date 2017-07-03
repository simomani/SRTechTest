package encryptionText.service;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import encryptionText.resource.ILetterResource;
import encryptionText.resource.ITextResource;
import encryptionText.resource.LetterResource;
import encryptionText.resource.TextResource;
import encryptionText.util.CryptoBase64;
import encryptionText.util.ICryptoBase64;

@Path("encryption")
@Singleton
public class EncryptionText {

	private ICryptoBase64 crypto;
	private ITextResource textResource;
	private ILetterResource letterResource;
	
	public EncryptionText(){
		crypto = new CryptoBase64();
		textResource = new TextResource();
		letterResource = new LetterResource();
	}
	
	@GET
	@Path("/encrypt")
	@Produces(MediaType.APPLICATION_JSON)
	public ITextResource getEncryptionText(@QueryParam("text") String text){

		textResource.setOriginal(text);
		textResource.setEncrypted(crypto.encryptText(text));
		letterResource.parseTextEncrypted(text);
		return textResource;
	}
	
	@GET
	@Path("/count")
	@Produces(MediaType.TEXT_PLAIN)
	public String getCharacterEncryptedCount(@QueryParam("letter") String letter){
		
		try {
			if(letter.length() != 1){
				throw new Exception("You need to provide only 1 character");
			}
		} 
		catch (Exception e) 
		{
			return e.getMessage();
		}
		
		Integer count = letterResource.getEncryptionNumberPerChar(letter.charAt(0));
		return count.toString();
	}
}
