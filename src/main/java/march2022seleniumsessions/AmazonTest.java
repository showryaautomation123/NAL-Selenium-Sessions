package march2022seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {
		BrowserUtil bw=new BrowserUtil();
		bw.init_driver("chrome");
		bw.launchUrl("https://www.google.com");
		System.out.println(bw.getPageTiltle());
		System.out.println(bw.getPageUrl());
		bw.closeBrowser();

	}

}
