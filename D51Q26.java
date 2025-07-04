public class D51Q26 {
    public static void main(String[] args) {
        int n = 1;
        String s = "";
        switch (n) {
            case 1: // caseラベル：nが1と一致する場合に実行
                s += "one"; // 文字列に"one"を追加
                break; // break文：switchブロックを終了し、fall-throughを防ぐ
            case 2: // caseラベル：nが2と一致する場合に実行
                s += "two"; // 文字列に"two"を追加
                break; // break文：switchブロックを終了
            default: // デフォルト：どのcaseにも一致しない場合に実行
                s += "?"; // 文字列に"?"を追加
                break; // break文：switchブロックを終了（ここでは省略可能）
        }
        System.out.println(s);
    }
    /*
     * switch、case、break、fall-throughの説明：
     * - case：switch文内のラベルで、switchの式（この場合はn）の値と一致する場合に実行されます。
     *   一致したcaseから実行が始まり、break文またはswitchブロックの終わりまで続きます。
     * - break：switchブロックを終了する文です。これがないと、次のcaseやdefaultのコードも実行される「fall-through」が発生します。
     * - fall-through：caseブロックの後にbreakがない場合に、プログラムが次のcaseやdefaultブロックのコードを続けて実行する現象です。
     */
}