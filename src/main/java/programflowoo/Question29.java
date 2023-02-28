package programflowoo;

public class Question29 {

    public static void main(String[] args) {
        String[][] countries = {{"SINGAPORE", "AUSTRALIA"}, {"CHINA", "RUSSIA"}};
//        for (int i = 0; i < countries.length; i++) {
//            for (int j = 0; j < countries[i].length; j++) {
//                System.out.println(countries[i][j] + " ");
//            }
//        }

            for(String [] arr : countries)
                for(String country : arr)
                    System.out.print(country + " ");

    }
}
