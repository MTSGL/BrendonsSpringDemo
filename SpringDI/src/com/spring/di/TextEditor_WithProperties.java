package com.spring.di;

import com.spring.di.SpellChecker.ISpellChecker;

public class TextEditor_WithProperties {
	public ISpellChecker spellChecker;

	// Getter
	public ISpellChecker getSpellChecker() {
		return spellChecker;
	}

	// Setter
	public void setSpellChecker(ISpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	// Empty Constructor
	public TextEditor_WithProperties() {
	}

	public String ProcessText(String text) {
		text = spellChecker.CheckSpelling(text);
		return text;
	}

}
