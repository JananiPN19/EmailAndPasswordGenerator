package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email em1 = new Email("Jane","Doe");
		//em1.setMailBoxCapacity(100);
		//em1.setAlternateEmail("jd@virtusa.com");
		//em1.resetPassword("ABC@V@101112");
		System.out.println(em1.showInfo());
	}

}
