package runamountdue;
class AmountDue {
    double computeAmountDue(double itemPrice){
        double totalDue = itemPrice + (itemPrice * 0.12);
        return totalDue;
    }
    double computeAmountDue(double itemPrice, int quantity){
        double totalPrice = itemPrice * quantity;
        double totalDue = totalPrice + (totalPrice * 0.12);
        return totalDue; 
    }
    double computeAmountDue(double itemPrice, int quantity, double discAmount){
        double totalPrice = (quantity * itemPrice) - discAmount;
        double totalDue = totalPrice + (itemPrice * 0.12);
        return totalDue;
    }
}
