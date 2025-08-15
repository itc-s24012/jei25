public class D53Q25kadai {
    public static void main(String[] args) {
        char[] ch = {'A', 'B', 'C'};

        // s1 と s2 に同じ String オブジェクトを代入する
        String s1 = new String(ch);
        String s2 = s1;  // s2 は s1 と同じ参照を指す

        // s1 == s2 は参照が同じなので true
        boolean b1 = s1 == s2;

        // s1.equals(s2) は内容が同じなので true
        boolean b2 = s1.equals(s2);

        System.out.print(b1 + " " + b2); // 出力: true true
    }
}
