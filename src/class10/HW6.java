package class10;

public class HW6 {
    public static void main(String[] args) {
        /*
        Create 2D array of countries: north america countries, south america countries, europe countries,
       asian countries, african countries. Then print all values from that array using 2 different loops
         and calculate how many total countries been stored.
         */
          String[][] countries={
                {"Canada", "Costa Rica", "Cuba", "Mexico","United States"},
                {"Colombia", "Ecuador", "Guyana", "Paraguay", "Peru", "Suriname"},
                {"Austria", "Belgium", "Bulgaria", "Croatia", "Cyprus"},
                {"Cyprus", "Bhutan", "Maldives", "Brunei"},
                {"Comoros", "Cabo Verde", "Botswana", "Burkina Faso", "Burundi",},
        };

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (String[] country : countries) {
            for (String s : country) {
                System.out.print(s+" ");

            }
            System.out.println();
        }
        System.out.println();

        int count=0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                count++;

            }

        }
        System.out.print("The total count is "+count);
        System.out.println();
    }

}
