package com.cmiurca.saintseiyadeckbuilding.saintseiya;


/**
 * Player class, where the player is created
 * 
 * @author Sirwolf
 * @version 1.0
 * @since 2023-02-04
 */
public class Player {

    /**
     * The name of the player
     */
    private String name;

    /**
     * The hero of the player
     */
    private Hero hero;

    /**
     * The deck of the player
     */
    private Card [] deck;

    /**
     * The hand of the player
     */
    private Card [] hand;
    
    /**
     * The discard of the player
     */
    private Card [] discard;
    
    /**
     * The destroyed Cards of the player
     */
    private Card [] destroyedCards;

    /**
     * The armor of the player
     */
    private Card armor;

    /**
     * The injured characters of the player
     */
    private Card [] injuredCharacters; 


    /**
     * Constructor of the player
     * @param name name of the player
     * @param hero hero of the player
     * @param deck deck of the player
     * @param hand hand of the player
     * @param discard discard of the player
     * @param destroyedCards destroyed cards of the player
     * @param armor armor of the player
     * @param injuredCharacters injured characters of the player
     */
    public Player(String name, Hero hero, Card [] deck, Card [] hand, Card [] discard, Card [] destroyedCards, Card armor, Card [] injuredCharacters) {
        this.name = name;
        this.hero = hero;
        this.deck = deck;
        this.hand = hand;
        this.discard = discard;
        this.destroyedCards = destroyedCards;
        this.armor = armor;
        this.injuredCharacters = injuredCharacters;
    }

    /**
     * Getter for name
     * @return String name
     */
    public String getName() {
        return name;
    }

    
    /**
     * Setter for name
     * @param name name of the player
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for hero
     * @return Hero hero
     */
    public Hero getHero() {
        return hero;
    }

    /**
     * Setter for hero  
     * @param hero hero of the player
     */
    public void setHero(Hero hero) {
        this.hero = hero;
    }


    /**
     * Getter for deck
     * @return Card[] deck
     */
    public Card[] getDeck() {
        return deck;
    }


    /**
     * Setter for deck
     * @param deck deck of the player
     */
    public void setDeck(Card[] deck) {
        this.deck = deck;
    }

    /**
     * Getter for hand
     * @return Card[] hand
     */
    public Card[] getHand() {
        return hand;
    }


    /**
     * Setter for hand
     * @param hand hand of the player
     */
    public void setHand(Card[] hand) {
        this.hand = hand;
    }
    

    /**
     * Getter for discard
     * @return Card[] discard
     */
    public Card[] getDiscard() {
        return discard;
    }

    /**
     * Setter for discard
     * @param discard discard of the player
     */
    public void setDiscard(Card[] discard) {
        this.discard = discard;
    }

    /**
     * Getter for destroyedCards
     * @return Card[] destroyedCards
     */
    public Card[] getDestroyedCards() {
        return destroyedCards;
    }

    /**
     * Setter for destroyedCards
     * @param destroyedCards destroyed cards of the player
     */
    public void setDestroyedCards(Card[] destroyedCards) {
        this.destroyedCards = destroyedCards;
    }
    
    /**
     * Getter for armor
     * @return Card armor
     */
    public Card getArmor() {
        return armor;
    }

    /**
     * Setter for armor
     * @param armor armor of the player
     */
    public void setArmor(Card armor) {
        this.armor = armor;
    } 

    /**
     * Getter for injuredCharacters
     * @return Card[] injuredCharacters
     */
    public Card[] getInjuredCharacters() {
        return injuredCharacters;
    }    
    
    /**
     * Setter for injuredCharacters
     * @param injuredCharacters injured characters of the player
     */
    public void setInjuredCharacters(Card[] injuredCharacters) {
        this.injuredCharacters = injuredCharacters;
    }

    /**
     * Method to draw a card from the deck
     * @return Card card
     */
    public Card drawCard() {
        Card card = deck[0];
        deck[0] = null;
        return card;
    }
    
    /**
     * Method to add a card to the hand
     * @param card card to be added to the hand
     */
    public void addCardToHand(Card card) {
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] == null) {
                hand[i] = card;
                break;
            }
        }

    }

    /**
     * Method to add card to the hand
     * @param id of the card to be added to the hand
     */
    public void addCardToHand(int id) {
        Card card = new Card(id);
        addCardToHand(card);
    }

    
    
    /**
     * Method to add a card to the discard
     * @param card card to be added to the discard
     */
    public void addCardToDiscard(Card card) {
        for (int i = 0; i < discard.length; i++) {
            if (discard[i] == null) {
                discard[i] = card;
                break;
            }
        }
    }

    /**
     * Method to add card to the discard
     * @param id of the card to be added to the discard
     */
    public void addCardToDiscard(int id) {
        Card card = new Card(id);
        addCardToDiscard(card);
    }
    
    /**
     * Method to add a card to the destroyed cards
     * @param card card to be added to the destroyed cards
     */
    public void addCardToDestroyedCards(Card card) {
        for (int i = 0; i < destroyedCards.length; i++) {
            if (destroyedCards[i] == null) {
                destroyedCards[i] = card;
                break;
            }
        }
    }

    /**
     * Method to add card to the destroyed cards
     * @param id of the card to be added to the destroyed cards
     */
    public void addCardToDestroyedCards(int id) {
        Card card = new Card(id);
        addCardToDestroyedCards(card);
    }

    /**
     * Method to add a card to the injured characters
     * @param card card to be added to the injured characters
     */
    public void addCardToInjuredCharacters(Card card) {
        //TODO: card.pointOfInjury++
        for (int i = 0; i < injuredCharacters.length; i++) {
            if (injuredCharacters[i] == null) {
                injuredCharacters[i] = card;
                break;
            }
        }
    }

    /**
     * Method to add card to the injured characters
     * @param id of the card to be added to the injured characters
     */
    public void addCardToInjuredCharacters(int id) {
        Card card = new Card(id);
        addCardToInjuredCharacters(card);
    }

    /**
     * Method to remove a card from the hand
     * @param card card to be removed from the hand
     */
    public void removeCardFromHand(Card card) {
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] == card) {
                hand[i] = null;
                break;
            }
        }
    }

    /**
     * Method to remove a card from the hand
     * @param id of the card to be removed from the hand
     */
    public void removeCardFromHand(int id) {
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getId() == id) {
                hand[i] = null;
                break;
            }
        }
    }

    /**
     * Method to remove a card from the discard
     * @param card card to be removed from the discard
     */
    public void removeCardFromDiscard(Card card) {
        for (int i = 0; i < discard.length; i++) {
            if (discard[i] == card) {
                discard[i] = null;
                break;
            }
        }

    }

    /**
     * Method to remove a card from the discard
     * @param id of the card to be removed from the discard
     */
    public void removeCardFromDiscard(int id) {
        for (int i = 0; i < discard.length; i++) {
            if (discard[i].getId() == id) {
                discard[i] = null;
                break;
            }
        }
    }

    /**
     * Method to remove a card from the destroyed cards
     * @param card card to be removed from the destroyed cards
     */
    public void removeCardFromDestroyedCards(Card card) {
        for (int i = 0; i < destroyedCards.length; i++) {
            if (destroyedCards[i] == card) {
                destroyedCards[i] = null;
                break;
            }
        }

    }

    /**
     * Method to remove a card from the destroyed cards
     * @param id of the card to be removed from the destroyed cards
     */
    public void removeCardFromDestroyedCards(int id) {
        for (int i = 0; i < destroyedCards.length; i++) {
            if (destroyedCards[i].getId() == id) {
                destroyedCards[i] = null;
                break;
            }
        }
    }

    /**
     * Method to remove a card from the injured characters
     * @param card card to be removed from the injured characters
     */
    public void removeCardFromInjuredCharacters(Card card) {
        for (int i = 0; i < injuredCharacters.length; i++) {
            if (injuredCharacters[i] == card) {
                injuredCharacters[i] = null;
                break;
            }
        }
    }

    /**
     * Method to remove a card from the injured characters
     * @param id of the card to be removed from the injured characters
     */
    public void removeCardFromInjuredCharacters(int id) {
        for (int i = 0; i < injuredCharacters.length; i++) {
            if (injuredCharacters[i].getId() == id) {
                injuredCharacters[i] = null;
                break;
            }
        }
    }

    /**
     * Method to remove a card from the deck
     * @param card card to be removed from the deck
     */
    public void removeCardFromDeck(Card card) {
        for (int i = 0; i < deck.length; i++) {
            if (deck[i] == card) {
                deck[i] = null;
                break;
            }
        }
    }

    /**
     * Method to remove a card from the deck
     * @param id of the card to be removed from the deck
     */
    public void removeCardFromDeck(int id) {
        for (int i = 0; i < deck.length; i++) {
            if (deck[i].getId() == id) {
                deck[i] = null;
                break;
            }
        }
    }

    /**
     * Method to add a card to the deck
     * @param card card to be added to the deck
     */
    public void addCardToDeck(Card card) {
        for (int i = 0; i < deck.length; i++) {
            if (deck[i] == null) {
                deck[i] = card;
                break;
            }
        }
    }

    /**
     * Method to add a card to the deck
     * @param id of the card to be added to the deck
     */
    public void addCardToDeck(int id) {
        Card card = new Card(id);
        addCardToDeck(card);
    }

    /**
     * Method that returns the occurence of a card in the hand
     * @param card card to be searched for
     * @return int occurence
     */
    public int occurenceInHand(Card card) {
        int occurence = 0;
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] == card) {
                occurence++;
            }
        }
        return occurence;
    }
    
    /**
     * Method that returns the occurence of a card in the hand
     * @param id of the card to be searched for
     * @return int occurence
     */
    public int occurenceInHand(int id) {
        int occurence = 0;
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getId() == id) {
                occurence++;
            }
        }
        return occurence;
    }

    /**
     * Method that returns the occurence of a card in the discard
     * @param card card to be searched for
     * @return int occurence
     */
    public int occurenceInDiscard(Card card) {
        int occurence = 0;
        for (int i = 0; i < discard.length; i++) {
            if (discard[i] == card) {
                occurence++;
            }
        }
        return occurence;
    }
    
    /**
     * Method that returns the occurence of a card in the discard
     * @param id of the card to be searched for
     * @return int occurence
     */
    public int occurenceInDiscard(int id) {
        int occurence = 0;
        for (int i = 0; i < discard.length; i++) {
            if (discard[i].getId() == id) {
                occurence++;
            }
        }
        return occurence;
    }

    /**
     * Method that returns the occurence of a card in the destroyed cards
     * @param card card to be searched for
     * @return int occurence
     */
    public int occurenceInDestroyedCards(Card card) {
        int occurence = 0;
        for (int i = 0; i < destroyedCards.length; i++) {
            if (destroyedCards[i] == card) {
                occurence++;
            }
        }
        return occurence;

    }

    /**
     * Method that returns the occurence of a card in the destroyed cards
     * @param id id of the card to be searched for
     * @return int occurence
     */
    public int occurenceInDestroyedCards(int id) {
        int occurence = 0;
        for (int i = 0; i < destroyedCards.length; i++) {
            if (destroyedCards[i].getId() == id) {
                occurence++;
            }
        }
        return occurence;
    }


    /**
     * Method that returns the occurence of a card in the injured characters
     * @param card card to be searched for
     * @return int occurence
     */
    public int occurenceInInjuredCharacters(Card card) {
        int occurence = 0;
        for (int i = 0; i < injuredCharacters.length; i++) {
            if (injuredCharacters[i] == card) {
                occurence++;
            }
        }
        return occurence;
    }
    
    /**
     * Method that returns the occurence of a card in the injured characters
     * @param id of the card to be searched for
     * @return int occurence
     */
    public int occurenceInInjuredCharacters(int id) {
        int occurence = 0;
        for (int i = 0; i < injuredCharacters.length; i++) {
            if (injuredCharacters[i].getId() == id) {
                occurence++;
            }
        }
        return occurence;
    }

    /**
     * Method that returns the occurence of a card in the deck
     * @param card card to be searched for
     * @return int occurence
     */
    public int occurenceInDeck(Card card) {
        int occurence = 0;
        for (int i = 0; i < deck.length; i++) {
            if (deck[i] == card) {
                occurence++;
            }
        }
        return occurence;
    }

    /**
     * Method that returns the occurence of a card in the deck
     * @param id of the card to be searched for
     * @return int occurence
     */
    public int occurenceInDeck(int id) {
        int occurence = 0;
        for (int i = 0; i < deck.length; i++) {
            if (deck[i].getId() == id) {
                occurence++;
            }
        }
        return occurence;
    }

    /**
     * Method that returns all the positions of a card in the hand
     * @param card card to be searched for
     * @return int[] positions
     */
    public int[] positionsInHand(Card card) {
        int[] positions = new int[occurenceInHand(card)];
        int j = 0;
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] == card) {
                positions[j] = i;
                j++;
            }
        }
        return positions;
    }

    /**
     * Method that returns all the positions of a card in the hand
     * @param id id of the card to be searched for
     * @return int[] positions
     */
    public int[] positionsInHand(int id) {
        int[] positions = new int[occurenceInHand(id)];
        int j = 0;
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getId() == id) {
                positions[j] = i;
                j++;
            }
        }
        return positions;
    }



    /**
     * Method that returns all the positions of a card in the discard
     * @param card card to be searched for
     * @return int[] positions
     */
    public int[] positionsInDiscard(Card card) {
        int[] positions = new int[occurenceInDiscard(card)];
        int j = 0;
        for (int i = 0; i < discard.length; i++) {
            if (discard[i] == card) {
                positions[j] = i;
                j++;
            }
        }
        return positions;
    }

    /**
     * Method that returns all the positions of a card in the discard
     * @param id of the card to be searched for
     * @return int[] positions
     */
    public int[] positionsInDiscard(int id) {
        int[] positions = new int[occurenceInDiscard(id)];
        int j = 0;
        for (int i = 0; i < discard.length; i++) {
            if (discard[i].getId() == id) {
                positions[j] = i;
                j++;
            }
        }
        return positions;
    }

    /**
     * Method that returns all the positions of a card in the destroyed cards
     * @param card card to be searched for
     * @return int[] positions
     */
    public int[] positionsInDestroyedCards(Card card) {
        int[] positions = new int[occurenceInDestroyedCards(card)];
        int j = 0;
        for (int i = 0; i < destroyedCards.length; i++) {
            if (destroyedCards[i] == card) {
                positions[j] = i;
                j++;
            }
        }
        return positions;

    }

    /**
     * Method that returns all the positions of a card in the destroyed cards
     * @param id of the card to be searched for
     * @return int[] positions
     */
    public int[] positionsInDestroyedCards(int id) {
        int[] positions = new int[occurenceInDestroyedCards(id)];
        int j = 0;
        for (int i = 0; i < destroyedCards.length; i++) {
            if (destroyedCards[i].getId() == id) {
                positions[j] = i;
                j++;
            }
        }
        return positions;
    }

    /**
     * Method that returns all the positions of a card in the injured characters
     * @param card card to be searched for
     * @return int[] positions
     */
    public int[] positionsInInjuredCharacters(Card card) {
        int[] positions = new int[occurenceInInjuredCharacters(card)];
        int j = 0;
        for (int i = 0; i < injuredCharacters.length; i++) {
            if (injuredCharacters[i] == card) {
                positions[j] = i;
                j++;
            }
        }
        return positions;

    }

    /**
     * Method that returns all the positions of a card in the injured characters
     * @param id id of the card to be searched for
     * @return int[] positions
     */
    public int[] positionsInInjuredCharacters(int id) {
        int[] positions = new int[occurenceInInjuredCharacters(id)];
        int j = 0;
        for (int i = 0; i < injuredCharacters.length; i++) {
            if (injuredCharacters[i].getId() == id) {
                positions[j] = i;
                j++;
            }
        }
        return positions;
    }


    /**
     * Method that returns all the positions of a card in the deck
     * @param card card to be searched for
     * @return int[] positions
     */
    public int[] positionsInDeck(Card card) {
        int[] positions = new int[occurenceInDeck(card)];
        int j = 0;
        for (int i = 0; i < deck.length; i++) {
            if (deck[i] == card) {
                positions[j] = i;
                j++;
            }
        }
        return positions;
    }

    /**
     * Method that returns all the positions of a card in the deck
     * @param id id of the card to be searched for
     * @return int[] positions
     */
    public int[] positionsInDeck(int id) {
        int[] positions = new int[occurenceInDeck(id)];
        int j = 0;
        for (int i = 0; i < deck.length; i++) {
            if (deck[i].getId() == id) {
                positions[j] = i;
                j++;
            }
        }
        return positions;
    }

    /**
     * Method thar move one card from the hand to the discard and removes it from the hand
     * @param card card to be moved
     */
    public void moveCardFromHandToDiscard(Card card) {
        int[] positions = positionsInHand(card);
        addCardToDiscard(card);
        removeCardFromHand(card);
    }
    public void moveCardFromDiscardToDestroyedCards(Card card) {
        int[] positions = positionsInDiscard(card);
        addCardToDestroyedCards(card);
        removeCardFromDiscard(card);
    }

    /**
     * Method that move one card from the hand to the discard and removes it from the hand
     * @param id id of the card to be moved
     */
    public void moveCardFromHandToDiscard(int id) {
        int[] positions = positionsInHand(id);
        addCardToDiscard(id);
        removeCardFromHand(id);
    }

    /**
     * Method that move one card from the hand to the injured characters and removes it from the hand
     * @param card card to be moved
     */
    public void moveCardFromHandToInjuredCharacters(Card card) {
        int[] positions = positionsInHand(card);
        addCardToInjuredCharacters(card);
        removeCardFromHand(card);
    }

    /**
     * Method that move one card from the hand to the injured characters and removes it from the hand
     * @param id id of the card to be moved
     */
    public void moveCardFromHandToInjuredCharacters(int id) {
        int[] positions = positionsInHand(id);
        addCardToInjuredCharacters(id);
        removeCardFromHand(id);
    }


    /**
     * Method that move one card from the hand to the destroyed cards and removes it from the hand
     * @param card card to be moved
     */
    public void moveCardFromHandToDestroyedCards(Card card) {
        int[] positions = positionsInHand(card);
        addCardToDestroyedCards(card);
        removeCardFromHand(card);
    }

    /**
     * Method that move one card from the hand to the destroyed cards and removes it from the hand
     * @param id id of the card to be moved
     */
    public void moveCardFromHandToDestroyedCards(int id) {
        int[] positions = positionsInHand(id);
        addCardToDestroyedCards(id);
        removeCardFromHand(id);
    }


    /**
     * Method that move one card from the discard to the hand and removes it from the discard
     * @param card card to be moved
     */
    public void moveCardFromDiscardToHand(Card card) {
        int[] positions = positionsInDiscard(card);
        addCardToHand(card);
        removeCardFromDiscard(card);
    }

    /**
     * Method that move one card from the discard to the hand and removes it from the discard
     * @param id id of the card to be moved
     */
    public void moveCardFromDiscardToHand(int id) {
        int[] positions = positionsInDiscard(id);
        addCardToHand(id);
        removeCardFromDiscard(id);
    }

    /**
     * Method that move one card from the hand to the deck and removes it from the hand
     * @param card card to be moved
     */
    public void moveCardFromHandToDeck(Card card) {
        int[] positions = positionsInHand(card);
        addCardToDeck(card);
        removeCardFromHand(card);
    }

    /**
     * Method that move one card from the hand to the deck and removes it from the hand
     * @param id id of the card to be moved
     */
    public void moveCardFromHandToDeck(int id) {
        int[] positions = positionsInHand(id);
        addCardToDeck(id);
        removeCardFromHand(id); 
    }

    /**
     * Method that move one card from the deck to the hand and removes it from the deck
     * @param card card to be moved
     */
    public void moveCardFromDeckToHand(Card card) {
        int[] positions = positionsInDeck(card);
        addCardToHand(card);
        removeCardFromDeck(card);
    }

    /**
     * Method that move one card from the deck to the hand and removes it from the deck
     * @param id id of the card to be moved
     */
    public void moveCardFromDeckToHand(int id) {
        int[] positions = positionsInDeck(id);
        addCardToHand(id);
        removeCardFromDeck(id);
    }

    /**
     * Method that move one card from the deck to the discard and removes it from the deck
     * @param card card to be moved
     */
    public void moveCardFromDeckToDiscard(Card card) {
        int[] positions = positionsInDeck(card);
        addCardToDiscard(card);
        removeCardFromDeck(card);
    }

    /**
     * Method that move one card from the deck to the discard and removes it from the deck
     * @param id id of the card to be moved
     */
    public void moveCardFromDeckToDiscard(int id) {
        int[] positions = positionsInDeck(id);
        addCardToDiscard(id);
        removeCardFromDeck(id);
    }

    /**
     * Method that move one card from the discard to the deck and removes it from the discard
     * @param card card to be moved
     */
    public void moveCardFromDiscardToDeck(Card card) {
        int[] positions = positionsInDiscard(card);
        addCardToDeck(card);
        removeCardFromDiscard(card);
    }

    /**
     * Method that move one card from the discard to the deck and removes it from the discard
     * @param id id of the card to be moved
     */
    public void moveCardFromDiscardToDeck(int id) {
        int[] positions = positionsInDiscard(id);
        addCardToDeck(id);
        removeCardFromDiscard(id);
    }

    /**
     * Method that move one card from the deck to the injured characters and removes it from the deck
     * @param card card to be moved
     */
    public void moveCardFromDeckToInjuredCharacters(Card card) {
        int[] positions = positionsInDeck(card);
        addCardToInjuredCharacters(card);
        removeCardFromDeck(card);
    }

    /**
     * Method that move one card from the deck to the injured characters and removes it from the deck
     * @param id id of the card to be moved
     */
    public void moveCardFromDeckToInjuredCharacters(int id) {
        int[] positions = positionsInDeck(id);
        addCardToInjuredCharacters(id);
        removeCardFromDeck(id);
    }

    /**
     * Method that move one card from the injured characters to the deck and removes it from the injured characters
     * @param card card to be moved
     */
    public void moveCardFromInjuredCharactersToDeck(Card card) {
        int[] positions = positionsInInjuredCharacters(card);
        addCardToDeck(card);
        removeCardFromInjuredCharacters(card);
    }

    /**
     * Method that move one card from the injured characters to the deck and removes it from the injured characters
     * @param id id of the card to be moved
     */
    public void moveCardFromInjuredCharactersToDeck(int id) {
        int[] positions = positionsInInjuredCharacters(id);
        addCardToDeck(id);
        removeCardFromInjuredCharacters(id);
    }

    /**
     * Method that move one card from the injured characters to the discard and removes it from the injured characters
     * @param card card to be moved
     */
    public void moveCardFromInjuredCharactersToDiscard(Card card) {
        int[] positions = positionsInInjuredCharacters(card);
        addCardToDiscard(card);
        removeCardFromInjuredCharacters(card);
    }

    /**
     * Method that move one card from the injured characters to the discard and removes it from the injured characters
     * @param id id of the card to be moved
     */
    public void moveCardFromInjuredCharactersToDiscard(int id) {
        int[] positions = positionsInInjuredCharacters(id);
        addCardToDiscard(id);
        removeCardFromInjuredCharacters(id);
    }

    /**
     * Method that move one card from the discard to the injured characters and removes it from the discard
     * @param card card to be moved
     */
    public void moveCardFromDiscardToInjuredCharacters(Card card) {
        int[] positions = positionsInDiscard(card);
        addCardToInjuredCharacters(card);
        removeCardFromDiscard(card);
    }

    /**
     * Method that move one card from the discard to the injured characters and removes it from the discard
     * @param id id of the card to be moved
     */
    public void moveCardFromDiscardToInjuredCharacters(int id) {
        int[] positions = positionsInDiscard(id);
        addCardToInjuredCharacters(id);
        removeCardFromDiscard(id);
    }

    

}
