class Dominos {

    public static int search(String item) {
        System.out.println("Search Started");
        int price = 0;

        if (item.equals("Classic pizza")) {
            price = 49;
        } 
        else if (item.equals("Garlic pizza")) {
            price = 99;
        } 
        else {
            System.out.println(item + " is not available");
        }

        System.out.println("Search Ended");
        return price;
    }

    public static int search(String item, int quantity) {
        System.out.println("Search Started");
        int price = 0;

        if (item.equals("Classic pizza")) {
            price = 49 * quantity;
        } 
        else if (item.equals("Garlic pizza")) {
            price = 99 * quantity;
        } 
        else {
            System.out.println(item + " is not available");
        }

        System.out.println("Search Ended");
        return price;
    }

    public static void main(String[] args) {
        System.out.println("Main Starts Here");

        String item = "Classic pizza";

        int price = search(item);
        System.out.println("The price of " + item + " is ₹" + price);

        int totalPrice = search(item, 3);
        System.out.println("The price of " + item + " for 3 quantities is ₹" + totalPrice);

        System.out.println("Main Ends Here");
    }
}