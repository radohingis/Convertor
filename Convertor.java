package sk.kosickaakademia.hingis.math.planimetry.cycle;

public class Convertor{
    public static int decimalToBinary(int n){
        int b = 0;
        if (n <=0) return 0;
        while (n > 0) {
                int p = 0;
                b = (int) (n % 2 * Math.pow(10, p));
                n = n / 2;
                p++;
            }
        return b;
        }
    public static int decimalToOctal(int n){
        int o = 0;
        if (n <=0) return 0;
        while (n > 0) {
            int p = 0;
            o = (int) (n % 8 * Math.pow(10, p));
            n = n / 8;
            p++;
        }
        return o;
    }
        public static String decimalToHex(int n){
        if(n<=0) return "0";
            String h = "";
            while(n>0){
                int z = n%16;
                n = n/16;
                switch (z) {
                    case 10:
                        h = "A" + h;
                        break;
                    case 11:
                        h = "B" + h;
                        break;
                    case 12:
                        h = "C" + h;
                        break;
                    case 13:
                        h = "D" + h;
                        break;
                    case 14:
                        h = "E" + h;
                        break;
                    case 15:
                        h = "F" + h;
                        break;
                    default:
                        h = "" + z + "" + h;
                }
            }
            return h;
    }

    public static int binaryToDecimal (int n) {
        if (n <= 0)
            return 0;
        int i = 0;
        int res = 0;
        while(n>0){
            int last = n%10;
            res = res+last+(int)Math.pow(2, i);
            n=n/10;
            i++;
        }
        return res;
    }
    public static int octalToDecimal (int n) {
        if (n <= 0)
            return 0;
        int i = 0;
        int res = 0;
        while(n>0){
            int last = n%10;
            res = res+last+(int)Math.pow(8, i);
            n=n/10;
            i++;
        }
        return res;
    }
    public static int convertHexToDec(String number){
        int length = number.length();
        int result = 0;
        int exp = 0;
        for (int i = length-1; i>=0; i--){
            char z = number.charAt(i);
            switch (z){
                case '0':result=result*(int)Math.pow(16, exp);
                case '1':result=result+1*(int)Math.pow(16, exp); break;
                case '2':result=result+2*(int)Math.pow(16, exp); break;
                case '3':result=result+3*(int)Math.pow(16, exp); break;
                case '4':result=result+4*(int)Math.pow(16, exp); break;
                case '5':result=result+5*(int)Math.pow(16, exp); break;
                case '6':result=result+6*(int)Math.pow(16, exp); break;
                case '7':result=result+7*(int)Math.pow(16, exp); break;
                case '8':result=result+8*(int)Math.pow(16, exp); break;
                case '9':result=result+9*(int)Math.pow(16, exp); break;
                case 'A':result=result+10*(int)Math.pow(16, exp); break;
                case 'B':result=result+11*(int)Math.pow(16, exp); break;
                case 'C':result=result+12*(int)Math.pow(16, exp); break;
                case 'D':result=result+13*(int)Math.pow(16, exp); break;
                case 'E':result=result+14*(int)Math.pow(16, exp); break;
                case 'F':result=result+15*(int)Math.pow(16, exp); break;
            }
            exp++;
        }
            return result;
    }

    public boolean isDecimal(String n){
        boolean bin = false;
        for (int i = 0; i < n.length(); i++){
            char x = n.charAt(i);
            if (x == '1' || x == '2') bin = true;
            else {
                bin = false;
                break;
            }
        }
        return bin;
    }
    public boolean isOctal(String n){
        boolean oct = false;
        for (int i = 0; i < n.length(); i++){
            char x = n.charAt(i);
            if (x >=0 && x<8) oct = true;
            else {
                oct = false;
                break;
            }
        }
        return oct;
    }
    public boolean isHexadecimal(String n){
        boolean hex = false;
        n = n.toUpperCase();
        for (int i = 0; i < n.length(); i++){
            char x = n.charAt(i);
            if(x>=0 && x<10) hex = true;
            if(x == 'a' || x == 'b' || x == 'c' || x == 'd' || x == 'e' || x == 'f') hex = true;
            else{
                hex = false;
                break;
            }
        }
        return hex;
    }
}

