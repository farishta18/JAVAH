package GroupWoek2;
/*
10. Provide Implementation for the diagram below. Then create a test
class in which you need to create Objects of ChromeDriver, FirefoxDrive
 and SafariDriver classes and see which methods available to them.
 */
public interface webDriver {
    String getTitle();
   void open();
   void close();

}
interface RemoteWebdriver extends webDriver {
    void navigate();

}
interface TakesScreenshot extends RemoteWebdriver{
    void getScreenshot();
}
class ChromeDriver implements RemoteWebdriver {
    @Override
    public String getTitle() {
        return "Title Chrome";
    }
    @Override
    public void open() {
        System.out.println("Chrome is open!!");
    }

    @Override
    public void close() {
        System.out.println("close Chrome");
    }


    @Override
    public void navigate() {
        System.out.println("navigate Chrome");
    }
}

    class FireFoxDriver implements RemoteWebdriver {
        @Override
        public String getTitle() {
            return "Title FireFox";
        }
        @Override
        public void open() {
            System.out.println("FireFox is open!!");
        }

        @Override
        public void close() {
            System.out.println("close FireFox");
        }


        @Override
        public void navigate() {
            System.out.println("navigate FireFax");
        }
    }
        class SafariDriver implements RemoteWebdriver {
            @Override
            public String getTitle() {
                return "Title Safari";

            }
            @Override
            public void open() {
                System.out.println("Safari is open!!");
            }

            @Override
            public void close() {
                System.out.println("close Safari");
            }

            @Override
            public void navigate() {
                System.out.println("navigate Safari");

            }
        }
