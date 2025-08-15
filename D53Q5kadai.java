public class D53Q5kadai {
    public static void main(String[] args) {
        // 引数の数が正しいかチェック（商品数 * 3）
        if (args.length < 1 || (args.length - 1) % 3 != 0) {
            System.out.println("引数の数が正しくありません");
            return;
        }

        // 商品の総数を取得
        int numItems = Integer.parseInt(args[0]);
        if (args.length != 1 + numItems * 3) {
            System.out.println("引数の数が商品数と一致しません");
            return;
        }

        // 合計を保持する変数
        int totalExTax = 0; // 税抜合計
        int totalInTax = 0; // 税込合計

        // ヘッダー出力
        System.out.println("商品名     税抜     税込     タイプ");

        // 商品情報を処理
        for (int i = 0; i < numItems; i++) {
            // 引数からデータ取得
            String name = args[1 + i * 3];          // 商品名
            int quantity = Integer.parseInt(args[2 + i * 3]); // 個数
            String type = args[3 + i * 3];          // タイプ
            int unitPrice = Integer.parseInt(args[4 + i * 3]); // 単価

            // 税抜価格の計算
            int exTaxPrice = unitPrice * quantity;

            // 税率の決定（食品等: 8%, その他: 10%）
            double taxRate = (type.equals("f")) ? 0.08 : 0.10;
            // 税込価格の計算（税抜価格 * (1 + 税率)、小数点以下切り捨て）
            int inTaxPrice = (int) (exTaxPrice * (1 + taxRate));

            // タイプの表示名
            String typeName = type.equals("f") ? "食品等" : "その他";

            // 商品情報の出力
            System.out.printf("%-10s %d円    %d円    %s%n",
                    name, exTaxPrice, inTaxPrice, typeName);

            // 合計に加算
            totalExTax += exTaxPrice;
            totalInTax += inTaxPrice;
        }

        // 合計の出力
        System.out.printf("合計        %d円    %d円%n", totalExTax, totalInTax);
    }
}