package codeOfProgram.main;

import codeOfProgram.actions.ActionWithDeck;
import codeOfProgram.actions.AskingForAction;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        Configurations configurations = new Configurations();
        DeckOfCards deck = new DeckOfCards();
        List deckOfCards = null;

        AskingForAction askingForAction = new AskingForAction();
        deckOfCards = askingForAction.askingForStartGame(deckOfCards);
        while (true){
            deckOfCards = askingForAction.askingForTakingCard(deckOfCards);
//            System.out.println("----------------------");
//            System.out.println(deckOfCards.size());
//            System.out.println("----------------------");
        }






//
//        System.out.println(deckOfCards.size());
//        actionWithDeck.printDeck(deckOfCards);
//
//        System.out.println(deck.toString());
    }
}
