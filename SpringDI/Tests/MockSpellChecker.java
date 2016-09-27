import com.spring.di.SpellChecker.ISpellChecker;

public class MockSpellChecker implements ISpellChecker {

	@Override
	public String CheckSpelling(String text) {
		return text.replace("fox", "dog");
	}

}
