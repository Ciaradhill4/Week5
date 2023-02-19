package assingment;

public class AsteriskLogger implements Logger {

	@Override
	public void word1(String word1) {
		// TODO Auto-generated method stub
		System.out.println("***" + word1 + "***");
	}

	@Override
	public void word2(String word2) {
		// TODO Auto-generated method stub
		System.out.println("******************");
		System.out.println("***" + "Error: " + word2 + "***");
		System.out.println("******************");
	}

}