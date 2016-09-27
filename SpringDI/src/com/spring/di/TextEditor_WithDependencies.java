package com.spring.di;

import com.spring.di.SpellChecker.ISpellChecker;
import com.spring.di.SpellChecker.SpellChecker;

public class TextEditor_WithDependencies {
	
	private ISpellChecker spellChecker;
	
	public TextEditor_WithDependencies(){
		spellChecker = new SpellChecker();
	}
	
	public void ProcessText(String text){
		spellChecker.CheckSpelling(text);
	}
	
}


