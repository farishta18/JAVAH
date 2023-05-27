package GroupWoek2;

public class WebDriverTest {
    public static void main(String[] args) {

        RemoteWebdriver[] Webdriver={new ChromeDriver(), new SafariDriver() , new FireFoxDriver()};
        for (RemoteWebdriver remoteWebdriver : Webdriver) {

            System.out.println(remoteWebdriver.getTitle());
            remoteWebdriver.open();
            remoteWebdriver.close();
            remoteWebdriver.navigate();
        }

    }
}
