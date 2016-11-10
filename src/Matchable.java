/**
 * @author Brahma Dathan and Sarnath Ramnath
 * @Copyright (c) 2010
 * <p>
 * Redistribution and use with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * <p>
 * - the use is for academic purpose only
 * - Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 * - Neither the name of Brahma Dathan or Sarnath Ramnath
 * may be used to endorse or promote products derived
 * from this software without specific prior written permission.
 * <p>
 * The authors do not make any claims regarding the correctness of the code in this module
 * and are not responsible for any loss or damage resulting from its use.
 */

/**
 * The interface to check if two items are "equal." This circumvents the
 * restrictions of the equals method, which must always implement an equivalence
 * relation.
 *
 * @param <K> the key type
 * @author Brahma Dathan
 */
public interface Matchable<K> {
  /**
   * Checks whether an item's key matches the given key.
   *
   * @param key the key value
   * @return true iff the item's key matches the given key
   */
  public boolean matches(K key);
}
