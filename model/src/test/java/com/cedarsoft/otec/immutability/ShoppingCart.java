package com.cedarsoft.otec.immutability;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Johannes Schneider (<a href="mailto:js@cedarsoft.com">js@cedarsoft.com</a>)
 */
public class ShoppingCart {
  private Map<Book,Integer> entries = new HashMap<Book, Integer>();

  public Map<Book, Integer> getEntries() {
    return entries;
  }
}
