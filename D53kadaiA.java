public class D53kadaiA {
    public static void main(String[] args) {
        int sum = 0;

        // 引数が空の場合のエラー処理
        if (args.length == 0) {
            System.out.println("エラー: 整数を入力してください");
            return;
        }
        // コマンドライン引数を合計
        try {
            for (String arg : args) {
                sum += Integer.parseInt(arg);
            }
            System.out.println("合計=" + sum);
        } catch (NumberFormatException e) {
            System.out.println("エラー: 整数以外の値が入力されました");
        }
    }
}