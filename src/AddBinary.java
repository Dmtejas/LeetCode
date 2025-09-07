public class AddBinary {
    public static String addBinary(String a, String b) {
        char carry = '0';
        int length = 0;
        if(a.length() > b.length()) {
            StringBuilder temp = new StringBuilder(b);
            length = a.length();
            for(int i=0;i<(length - b.length());i++) {
                temp.insert(i, '0');
            }
            b = temp.toString();

        } else {
            StringBuilder temp = new StringBuilder(a);
            length = b.length();
            for(int i=0;i<(length - a.length());i++) {
                temp.insert(i, '0');
            }
            a = temp.toString();
        }
        System.out.println(a);
        System.out.println(b);
        StringBuilder str = new StringBuilder();
        for(int i=a.length()-1;i>=0;i--) {
            if(a.charAt(i) == '1' && b.charAt(i) == '1') {
                if(carry == '1') {
                    str.append('1');
                } else {
                    str.append('0');
                    carry = '1';
                }
            } else if(a.charAt(i) == '0' && b.charAt(i) == '0') {
                if(carry == '1') {
                    str.append('1');
                    carry = '0';
                } else {
                    str.append('0');
                    carry = '0';
                }
            } else {
                if(carry == '1') {
                    str.append('0');
                    carry = '1';
                } else {
                    str.append('1');
                    carry = '0';
                }
            }
        }
        if(carry == '1') {
            str.append(carry);
        }
        return str.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }
}
