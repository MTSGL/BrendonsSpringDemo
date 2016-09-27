package com.spring.di;

import com.spring.di.SpellChecker.ISpellChecker;

public class TextEditor_WithOutDependencies {
	private ISpellChecker spellChecker;
	
	public TextEditor_WithOutDependencies(ISpellChecker spellChecker){
		this.spellChecker = spellChecker;
	}
	
	public String ProcessText(String text){
		text = spellChecker.CheckSpelling(text);
		return text;
	}
	
}


