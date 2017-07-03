package encryptionText.util;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class CryptoBase64 implements ICryptoBase64 {

	Base64.Encoder encoder = Base64.getEncoder();

	public CryptoBase64(){}
	
	public String encryptText(String text){
		return encoder.encodeToString(text.getBytes(StandardCharsets.UTF_8) );
	}
}
