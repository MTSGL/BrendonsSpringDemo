package com.spring.di.SpellChecker;

public class SpellChecker implements ISpellChecker {

	@Override
	public String CheckSpelling(String text){
		System.out.println("Checking the spelling of : " + text);
		//Replace fox with cat
		return text.replace("fox", "cat");
	}
	
}
