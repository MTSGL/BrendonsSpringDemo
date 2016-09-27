import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.spring.di.TextEditor_WithOutDependencies;
import com.spring.di.SpellChecker.SpellChecker;

//@Ignore
public class TextEditorTests {

	@BeforeClass
	public static void init(){
		//eg create a file
		System.out.println("Running init before test");
	}
	
	
	@Test
	public void test_SpellCheck() {
		TextEditor_WithOutDependencies te = new TextEditor_WithOutDependencies(new SpellChecker());
	    String target = te.ProcessText("The quick brown fox"); 
		assertEquals("Error ProcessTest did not return the expected result", "The quick brown cat", target);
	}

	
	@Test
	public void test_SpellCheck2() {
		TextEditor_WithOutDependencies te = new TextEditor_WithOutDependencies(new MockSpellChecker());
	    String target = te.ProcessText("The quick brown fox"); 
		assertEquals("Error ProcessTest did not return the expected result", "The quick brown dog", target);
	}	
	
	@After
	public void complete(){
		//eg delete the file
		System.out.println("Running complete after test");
	}	
	
}
