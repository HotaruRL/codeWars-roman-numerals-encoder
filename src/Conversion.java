public class Conversion {

    public String solution(int n) {
        String romanNumeral = "";

        while (n > 0) {
            if (n >= 1000) {
                n -= 1000;
                romanNumeral += "M";
            } else if (n >= 900) {
                n -= 900;
                romanNumeral += "CM";
            }  else if (n >= 500) {
                n -= 500;
                romanNumeral += "D";
            }  else if (n >= 400) {
                n -= 400;
                romanNumeral += "CD";
            } else if (n >= 100) {
                n -= 100;
                romanNumeral += "C";
            }  else if (n >= 90) {
                n -= 90;
                romanNumeral += "XC";
            } else if (n >= 50) {
                n -= 50;
                romanNumeral += "L";
            }  else if (n >= 40) {
                n -= 40;
                romanNumeral += "XL";
            } else if (n >= 10) {
                n -= 10;
                romanNumeral += "X";
            }  else if (n >= 9) {
                n -= 9;
                romanNumeral += "IX";
            } else if (n >= 5) {
                n -= 5;
                romanNumeral += "V";
            }  else if (n >= 4) {
                n -= 4;
                romanNumeral += "IV";
            } else {
                n -= 1;
                romanNumeral += "I";
            }
        }
        return romanNumeral;
    }
}
