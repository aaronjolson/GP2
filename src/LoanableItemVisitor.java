/**
 * 
 * @author Brahma Dathan and Sarnath Ramnath
 * @Copyright (c) 2010
 
 * Redistribution and use with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - the use is for academic purpose only
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *   - Neither the name of Brahma Dathan or Sarnath Ramnath
 *     may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * The authors do not make any claims regarding the correctness of the code in this module
 * and are not responsible for any loss or damage resulting from its use.  
 */
/**
 * This is the standard Visitor interface for the visitor pattern.
 * 
 * @author Brahma Dathan
 *
 */
public interface LoanableItemVisitor {
	/**
	 * This is the method for catching all LoanableItem objects that may be
	 * added in the future.
	 * 
	 * @param item the item to be processed
	 */
	public void visit(LoanableItem item);

	/**
	 * This method processes Book objects
	 * 
	 * @param book the Book to be processed
	 */
	public void visit(Book book);

	/**
	 * The method processes Periodical objects
	 * 
	 * @param periodical the Periodical to be processed
	 */
	public void visit(Periodical periodical);

  /**
   * This method processes Dvd objects
   *
   * @param dvd the Dvd to be processed
   */
  public void visit(Dvd dvd);

  /**
   * This method processes Camera objects
   *
   * @param camera the camera to be processed
   */
  public void visit(Camera camera);

  /**
   * This method processes Laptop objects
   *
   * @param laptop the Laptop to be processed
   */
  public void visit(Laptop laptop);

  /**
   * This method processes reservedBook objects
   *
   * @param reservedBook the Laptop to be processed
   */
  public void visit(ReservedBook reservedBook);
}
