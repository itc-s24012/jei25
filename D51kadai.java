public class D51kadai {
    public static void main(String[] args) {
        try {
            // コマンドライン引数の2番目（インデックス1）を取得
            double number = Double.parseDouble(args[1]);
            // 切り上げ処理
            System.out.println(Math.ceil(number));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("エラー: 2番目の引数が不足しています。");
        } catch (NumberFormatException e) {
            System.out.println("エラー: 2番目の引数は実数である必要があります。");
        }
    }
}