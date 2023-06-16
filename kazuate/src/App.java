import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    final static int ANSWER = 50;

    public static void main(String[] args) {
        System.out.println("数を当ててください！");
        for (int cnt = 5; cnt > 0; cnt--) {
            System.out.println("========== あと" + cnt + "回入力できます ==========");

            int n = inputTwoDigitInteger();

            if (n == ANSWER) {
                System.out.println("正解！おめでとうございます！");
                return;
            } else if (n < ANSWER) {
                System.out.println("正解より小さいです．");
            } else {
                System.out.println("正解より大きいです．");
            }

            if (Math.abs(n - ANSWER) >= 20) {
                System.out.println("正解と20以上の差があります．");
            }

            System.out.println();
        }
        System.out.println("残念！正解は" + ANSWER + "でした～．");
    }

    public static int inputTwoDigitInteger() {
        int number;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("2桁の正の整数を入力してください．");
            String line = br.readLine();
            number = Integer.parseInt(line);
            if (number < 10 || 100 <= number) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            System.err.println("フォーマット例外です．もう一度．");
            number = inputTwoDigitInteger(); // 再帰呼び出し
        } catch (IOException e) {
            System.err.println("入出力例外です．もう一度．");
            number = inputTwoDigitInteger(); // 再帰呼び出し
        }

        return number;
    }
}
