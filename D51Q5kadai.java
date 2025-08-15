public class D51Q5kadai {
    public static void main(String[] args) {
        try {
            // コマンドライン引数から使用量を取得
            double usage = Double.parseDouble(args[0]);
            // 値上げ後の基本料金と従量単価
            double baseCharge = 1150.0; // 仮定: 値上げ後（1050 + 100）
            double unitPrice = 9.7;     // 仮定: 値上げ後（8.7 + 1）
            // ガス代金の計算
            double total = baseCharge + unitPrice * usage;
            // 整数に丸めて出力
            System.out.println("今月のガス代金は" + (int)Math.round(total) + "円");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("エラー: 使用量を入力してください。");
        } catch (NumberFormatException e) {
            System.out.println("エラー: 使用量は実数で入力してください。");
        }
    }
}