package assingment;

public class SpacedLogger implements Logger {

	@Override
	public void word1(String word1) {
		// TODO Auto-generated method stub
		for (int i=0; i <word1.length(); i++) {
			System.out.print(word1.charAt(i)+ " ");
		}
		System.out.println();
	}

	@Override
	public void word2(String word2) {
		// TODO Auto-generated method stub
		System.out.print("ERROR: ");
		for (int i=0; i <word2.length(); i++) {
			System.out.print(word2.charAt(i)+ " ");
		}
		System.out.println();
	}
	
}