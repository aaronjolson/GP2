import java.io.Serializable;
import java.util.Calendar;

class Dvd extends LoanableItem implements Serializable, Matchable<String> {
	private static final long serialVersionUID = 1L;

	public Dvd(String title, String id) {
		super(title, id);

	}

	/**
	 * Marks the book as issued to a member
	 *
	 * @param member
	 *            the borrower
	 * @return true iff the book could be issued. True currently
	 */
	@Override
	public boolean issue(Member member) {
		if (super.issue(member)) {
			dueDate.add(Calendar.MONTH, 1);
			return true;
		}
		return false;
	}

	/**
	 * String form of the book
	 */
	@Override
	public String toString() {
		return super.toString() + " borrowed by " + borrowedBy;
	}

	/**
	 * Implements the accept method of the Visitor pattern.
	 *
	 * @param visitor
	 *            the Visitor that will process the Book object
	 */
	@Override
	public void accept(LoanableItemVisitor visitor) {
		visitor.visit(this);
	}

}
