import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Register {

    public void printData(Scanner scanner) {
        List<String> list = new ArrayList<String>();

        //ファイル生成
        // File newFile = new File("./Recipe/xx.txt");
        // newFile.createNewFile();
        
        //ファイル書き込み
        // FileWriter filewriter = new FileWriter(newFile);

        System.out.println("タイトルを決めましょう");
        String title = scanner.next();
        // filewriter.write(title);
        

        System.out.println("レシピの内容を入力して下さい");
        System.out.println("終了するには exit を入力して下さい");
        
        while (true) {
            String recipes = scanner.next();

            if ("exit".equals(recipes)) {
                System.out.println("タイトル：" + title);
                System.out.println(list);
                System.out.println("登録完了！最初に戻ります。Enterを押して下さい。");

                String enter = scanner.nextLine(); 
                // filewriter.close();
                scanner.close();
                break;
            }

            list.add(recipes);
            // filewriter.write(recipes);
        }
    }
}
