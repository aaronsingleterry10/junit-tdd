public class CodeupCrypt {
    public static double VERSION;

    public static String hashPassword(String originalString) {
        String output = "";
        for (int i = 0; i < originalString.length(); i++) {
            char currentCar = Character.toLowerCase(originalString.charAt(i));
            if (currentCar == 'a') {
                output += 4;
            } else if (currentCar == 'e') {
                output += 3;
            } else if (currentCar == 'i') {
                output += 1;
            } else if (currentCar == 'o') {
                output += 0;
            } else if (currentCar == 'u') {
                output += 9;
            } else {
                output += originalString.charAt(i);
            }
        }
        return output;
    }
}
