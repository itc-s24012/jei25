public class D52Q5 {
    public static void main(String[] args) {
        // 引数の1番目以降を整数として受け取る（0番目はプログラム名）
        for (int i = 1; i < args.length; i++) {
            int value = Integer.parseInt(args[i]);
            System.out.printf("%3d : ", value);
            int stars = value / 10; // 10単位で星の数を決定
            if (stars == 0 && value > 0) {
                stars = 1; // 10未満でも1つは表示
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
