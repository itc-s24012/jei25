enum Udon2 {
    KAKE("かけ", 290),
    KITSUNE("きつね", -380),
    CURRY("カレー", 490),
    TEMPURA("天ぷら", 520);  // 新たに追加した定数

    private String japaneseName;
    int price;

    // コンストラクタ：負の値なら正に直す
    Udon2(String japaneseName, int price) {
        this.japaneseName = japaneseName;
        if (price >= 0) {
            this.price = price;
        } else {
            this.price = -1 * price;
        }
    }

    // toString メソッド：出力形式を指定
    public String toString() {
        return japaneseName + " : " + price + "円";
    }
}

public class D53Q27 {
    public static void main(String[] args) {
        // 新たに追加した TEMPURA を出力
        System.out.println(Udon2.TEMPURA);
    }
}
