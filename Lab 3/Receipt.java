/**
 * This class, written for CPSC2151, stores information 
 * for a receipt. Specifically, the class stores the taxable
 * and nontaxable subtotals, allows users to add items to the
 * receipt, and returns the net receipt total according to 
 * a user-specified tax rate.
 *
 * @authors Ben Curry
 * @version 1.0
 *
 * @invariant taxRateConst >= 0 AND taxableTotal >= 0 AND nontaxableTotal >= 0
 */
 
public class Receipt {

    private final static double taxRateConst;
    private double taxableTotal;
    private double nontaxableTotal;

    /**
     * Constructs a receipt object with a certain taxRate that will be applied to items.
     *
     * @param taxRate is the double that should be applied to each taxable item.
     * @pre taxRate > 0.
     * @post A new receipt object is created with the specified taxRate.
     */
    public Receipt(double taxRate) {
        // Constructor implementation here
    }

    /** 
     * Adds items to the receipt having a cost and quantity.
     * Can be taxable or non-taxable.
     *
     * @param cost is a double that represents the price of an item
     * @param quantity is a double that represents the number of items
     * @param isTaxable is a boolean indicating whether the item is taxable
     *
     * @pre Cost >= 0 AND Quantity > 0,
     *
     * @post The items with the specified cost, quantity, and taxable status are added to the receipt.
     */
    public void addToReceipt(double cost, int quantity, boolean isTaxable) {}

    /** 
     * Returns the sum of all non-taxable items on the receipt.
     *
     * @return the sum of the non-taxable items on the receipt as a double
     *
     * @pre there must be at least one non-taxable item
     *
     * @post the sum of non-taxable items is returned as a double, the object doesn't change
     */
    public double getNonTaxableSubtotal() {}

    /**  
     * Returns the sum of all taxable items on the receipt.
     *
     * @return the sum of all taxable items on the receipt as a double
     *
     * @pre there must be at least one taxable item on the receipt
     *
     * @post the sum of all taxable items on the receipt as a double, the object doesn't change
     */
    public double getTaxableSubtotal() {}

    /** 
     * Returns the taxRate for the receipt object.
     *
     * @return the taxRate for the receipt object as a double
     * 
     * @pre taxRate > 0
     *
     * @post the taxRate for the receipt object is returned, the object doesn't change
     */
    public double getTaxRate() {}

    /** 
     * Returns the total price for the receipt.
     *
     * @return the total price for the receipt as a double.
     *
     * @pre The receipt contains at least one item.
     *
     * @post The total price of all items on the receipt is returned as a double, the object doesn't change
     */
    public double computeTotal() {}
}
