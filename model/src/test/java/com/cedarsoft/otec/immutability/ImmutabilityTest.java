package com.cedarsoft.otec.immutability;

import org.junit.*;

import java.util.Map;

/**
 * @author Johannes Schneider (<a href="mailto:js@cedarsoft.com">js@cedarsoft.com</a>)
 */
public class ImmutabilityTest {
  private Book bgb;
  private Book erbarmen;

  @Before
  public void setUp() throws Exception {
    bgb = new Book( "978-3423050012", "Bürgerliches Gesetzbuch BGB" );
    erbarmen = new Book( "978-3423247511", "Erbarmen" );
  }

  @Test
  public void testName() throws Exception {

    ShoppingCart shoppingCart = new ShoppingCart();

    shoppingCart.getEntries().put( bgb, 1 );
    print( shoppingCart );
    shoppingCart.getEntries().put( erbarmen, 3 );
    print( shoppingCart );

//    System.out.println( "--- Evil ---" );
//    printEvil( shoppingCart );
//    System.out.println( "--- /Evil ---" );
//
//    print( shoppingCart );
//
//    System.out.println( "--- SuperEvil ---" );
//    superEvil();
//    System.out.println( "--- /SuperEvil ---" );
//
//    print( shoppingCart );
  }

  private void print( ShoppingCart shoppingCart ) {
    System.out.println();
    System.out.println( "Einkaufswagen:" );
    System.out.println( "--------------" );
    for ( Map.Entry<Book, Integer> entry : shoppingCart.getEntries().entrySet() ) {
      Book book = entry.getKey();
      int amount = entry.getValue();

      System.out.println( amount + " Stück: " + book.getTitle() + " (" + book.getIsbn() + ")" );
    }
  }

  private void superEvil() {
    erbarmen.setIsbn( "999-999999999" );
    erbarmen.setTitle( "Ein peinlicher Titel" );
  }

  private void printEvil( ShoppingCart shoppingCart ) {
    print( shoppingCart );
    int oldAmount = shoppingCart.getEntries().get( erbarmen );
    shoppingCart.getEntries().put( erbarmen, oldAmount + 1 );
  }
}
