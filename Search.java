import java.util.Scanner;

class Search {
    public void search() {
        System.out.println("検索したいワードを入力して下さい");
        String keyWord = scanner.next();

        File recipes = new File("../Recipe/Search.java");

        for (String a : array) {
            if (list.contains(keyWord)) {
                System.out.println("検索ワードに該当あり"); 
                System.out.println(list);
            } else {
                System.out.println("検索ワードに該当なし");
            }
        }
    }
}
