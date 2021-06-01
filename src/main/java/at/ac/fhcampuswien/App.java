package at.ac.fhcampuswien;

public class App {

    public static void main(String[] args){

        if (checkPassword("@(tell12Me111Why22)")==true){
            System.out.println("Passwort geht");
        }else
            System.out.println("Passwort geht nicht");
    }

    public static boolean checkPassword(String password) {
        char ch;
        boolean capitalFlag = false;
        boolean lowerCaseFlag = false;
        boolean numberFlag = false;
        boolean specialCharacterFlag=false;
        String specialCharactersString = "()#$?!%/@";
        int a = 0;

        //check length
        if (password.length() >= 8 && password.length() <= 25) {

            for (int i = 0; i < password.length(); i++) {
                ch = password.charAt(i);

                //check upper and lowercase
                if (Character.isUpperCase(ch)) {
                    capitalFlag = true;
                } else if (Character.isLowerCase(ch)) {
                    lowerCaseFlag = true;
                }

                //check digit
                if (Character.isDigit(ch)) {
                    numberFlag = true;
                    a = Character.getNumericValue(ch);

                    //check fortlaufend
                    if (password.length() > i+2 && Character.getNumericValue(password.charAt(i + 1)) == a + 1 && Character.getNumericValue(password.charAt(i + 2)) == a + 2) {
                        return false;
                    //check wiederholung
                    } else if (password.length() > i+3 && Character.getNumericValue(password.charAt(i + 1)) == a && Character.getNumericValue(password.charAt(i + 2)) == a && Character.getNumericValue(password.charAt(i + 3)) == a) {
                        return false;
                    }
                }

                //check special character
                if (specialCharactersString.contains(Character.toString(ch))) {
                    specialCharacterFlag = true;
                }
            }

            if (capitalFlag & lowerCaseFlag & numberFlag & specialCharacterFlag) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
