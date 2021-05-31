package at.ac.fhcampuswien;

public class App {

    public static void main(String[] args){

        if (checkPassword("@(tellMeWhy)83")==true){
            System.out.println("cool");
        }else
            System.out.println("nicht cool");
    }
    public static boolean checkPassword(String password) {
        char ch;
        boolean capitalFlag = false;
        boolean lowerCaseFlag = false;
        boolean numberFlag = false;
        boolean flag=false;
        String specialCharactersString = "()#$?!%/@";
        int a = 0;

        //check length
        if (password.length() >= 8 && password.length() <= 25) {

            //check upper and lowercase
            for (int i = 0; i < password.length(); i++) {
                ch = password.charAt(i);
                if (Character.isUpperCase(ch)) {
                    capitalFlag = true;
                } else if (Character.isLowerCase(ch)) {
                    lowerCaseFlag = true;
                }
                if (capitalFlag && lowerCaseFlag) {

                    //check digit
                    for(int j=0;j < password.length();j++) {
                        char che = password.charAt(j);
                        if(Character.isDigit(che)) {
                            numberFlag = true;
                             //a=Character.getNumericValue(che);
                        }
                        if(numberFlag==true) {
                            for(int l=0;l < password.length();l++) {
                                char w = password.charAt(l);
                                if(Character.isDigit(w)) {
                                    a=Character.getNumericValue(w);
                                    if (Character.getNumericValue(password.charAt(l+1))==a+1 && Character.getNumericValue(password.charAt(l+2))==a+2){
                                        flag=true;
                                    }else if(Character.getNumericValue(password.charAt(l+1))==a && Character.getNumericValue(password.charAt(l+2))==a&& Character.getNumericValue(password.charAt(l+3))==a){
                                        flag=true;
                                    }
                                }
                            }
                            if (flag==true){
                                return false;
                            } else {
                                for (int k = 0; k < password.length(); k++) {
                                    char chi = password.charAt(k);
                                    if (specialCharactersString.contains(Character.toString(chi))) {
                                        return true;
                                    }
                                }
                                return false;
                            }

                            //check specialCharacters

                        }
                    }
                }
            }
            return false;
        } else {
            return false;
        }





    }
}
