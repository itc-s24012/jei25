public class D53Q20 {
    public static void main(String[] args) {
        int i = 8;
        float f = 3.27f;

        // int n = i + f; はコンパイルエラーになる（float型をintに直接代入できない）
        // 修正: floatをintにキャストすることで明示的に型変換を行う
        int n = (int)(i + f);

        System.out.print(n);
    }
}
