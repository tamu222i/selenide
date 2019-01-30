package selenide;

import com.codeborne.selenide.Selenide;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Selenide.open("https://www.google.co.jp/");        
    }
}
