public class D53Q6 {
    private static String hex = "0123456789ABCDEF";

    public static void main(String[] args) {
        if (args.length < 5) { // (33) : コマンドライン引数が5個未満なら終了
            return;
        }

        if (args[0].equals("b")) { // ビットを表す16進数字が入力された
            for (int i = 1; i < args.length; i++) { // (34)
                int num = hex.indexOf(args[i]);    // 16進数→整数
                System.out.println(intToStr(num));
            }
        } else if (args[0].equals("g")) { // 2値画像が入力された
            for (int i = 1; i < args.length; i++) { // (34)
                System.out.println(strToInt(args[i]));
            }
        }
    }

    public static String intToStr(int x) {
        String s = "";
        for (int i = 0; i < 4; i++) {
            if ((x % 2) == 0) { // (35) : 最下位ビットが0なら白（.）
                s = "." + s;
            } else {
                s = "o" + s;
            }
            x /= 2;
        }
        return s;
    }

    public static String strToInt(String s) {
        int x = 1, sum = 0;
        for (int i = 3; i >= 0; i--) {
            if (s.charAt(i) == 'o') {
                sum += x;
            }
            x *= 2; // (36)
        }
        return hex.substring(sum, sum + 1); // (37)
    }
}
