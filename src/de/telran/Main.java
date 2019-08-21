package de.telran;

public class Main {

    public static void main(String[] args){

       /* String apple = "apple";
        String theSameApple = apple;
        System.out.println("apple==TheSameApple:" + (apple==theSameApple));

        String anotherApple = new String("apple");
        System.out.println("apple == anotherApple:" + (apple == anotherApple));
        System.out.println("apple.equals(anotherApple):" + (apple.equals(anotherApple)));*/


    /*Word word = new Word("apple","Fruit");
    System.out.println(word);
    System.out.println(word.getWordWithStars());
    word.openLetter('p');
    System.out.println(word.getWordWithStars());
    word.openLetter('e');
    System.out.println(word.getWordWithStars());
    word.openLetter('z');
    System.out.println(word.getWordWithStars());
    word.openWord("apple");
    System.out.println(word.getWordWithStars());*/

    Game game = new Game();
    game.startNewGame();
    }
}

