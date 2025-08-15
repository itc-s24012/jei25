public class D53Q5kadai {
    private static int[] taxes = {8, 10};  // 税率：食品等=8%、その他=10%
    private static int FOODS = 0;
    private static int OTHER = 1;

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("コマンドライン引数が不足しています。");
            System.out.println("例: java D53Q5kadai 3 A 216 3 f B 47 2 o C 98 4 f");
            return;
        }

        int dataSize = Integer.parseInt(args[0]);

        // データ格納用配列
        String[] names = new String[dataSize];
        int[] prices = new int[dataSize];
        int[] nums = new int[dataSize];
        char[] types = new char[dataSize];

        // データ読み込み
        int idx = 1;
        for (int i = 0; i < dataSize; i++) {
            names[i] = args[idx++];
            prices[i] = Integer.parseInt(args[idx++]);
            nums[i] = Integer.parseInt(args[idx++]);
            types[i] = args[idx++].charAt(0);
        }

        // ヘッダ出力
        System.out.println("商品名\t税抜\t税込\tタイプ");

        // 合計計算用
        int totalZeinuki = 0;
        int totalZeikomi = 0;

        for (int i = 0; i < dataSize; i++) {
            int zeinuki = prices[i] * nums[i];

            int taxType = (types[i] == 'f') ? FOODS : OTHER;
            int taxRate = taxes[taxType];

            // 税込価格（端数切り捨て）
            int zeikomi = (int)(zeinuki * (100 + taxRate) / 100.0);

            totalZeinuki += zeinuki;
            totalZeikomi += zeikomi;

            // 出力（整列）
            System.out.printf("%-6s\t%4d円\t%4d円\t%s\n",
                    names[i], zeinuki, zeikomi, viewType(types[i]));
        }

        // 合計出力
        System.out.printf("合計\t%4d円\t%4d円\n", totalZeinuki, totalZeikomi);
    }

    // タイプ表示変換
    private static String viewType(char c) {
        return (c == 'f') ? "食品等" : "その他";
    }
}
