package enTreizeJanvier;

public class TestCQMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*		try{

			Lyes pA =  new Tchinou();
			pA.QuiSuisJe();
			
		}
		catch (Exception e){
			System.out.println(e);
		}*/
		{ try {
			int division = 1 / 0;
			System.out.println("OK");
			} catch (java.lang.NullPointerException npe){
			System.out.println("NPE");
			} catch (java.lang.ArithmeticException npe){
			System.out.println("AE, ");
			return; } finally {
			System.out.println("Finally");
			} }
	}

}
