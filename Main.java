import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Myレシピ帳へようこそ！！");
        System.out.println("選択肢の数字から選んでね。");
        System.out.println("１、新規レシピの登録");
        System.out.println("２、今までのお気に入りレシピ一覧");
        System.out.println("３、レシピを検索");
        int menuChoice = scanner.nextInt();
        
        switch(menuChoice) {
            case 1:
                System.out.println("レシピを登録しよう！");
                Register register = new Register();
                register.printData(scanner);
                
                break;
                
            // case 2:
            //     System.out.println("今までのレシピ一覧です！");
            //     System.out.println();
            //     break;
            // case 3:
            //     System.out.println("作成したレシピを探そう！");
                
                
            //     break;
            // default:
            //     System.out.println("1~3の数字で選んでください！");
            //     //最初に戻る
            //     break;
        }   
    }
}
