package pl.jaceksysiak.spring.test;

public class ConsoleWriter implements LogWriter {

	public void write(String text) {

			System.out.println("$: " + text);
		
	}

}
