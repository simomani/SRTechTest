package encryptionText.resource;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LetterResource implements ILetterResource {
	
	// map to keep track of characters' occurrences
	Map<Character, Integer> countLetters = new ConcurrentHashMap <>();
	
	public LetterResource(){}
	
	public void parseTextEncrypted(String text){
		for (char ch: text.toCharArray()) {
			Integer numOfTimes = countLetters.get(ch);
			int count = (numOfTimes == null) ? 1 : ++numOfTimes;
			countLetters.put(ch, count);
		}
	}

	public int getEncryptionNumberPerChar(char ch){
		Integer count = countLetters.get(ch);
		return (count == null) ? 0 : count;
	}
}
