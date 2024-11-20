import java.util.*;
import java.sql.*;
import java.io.*;

class JDBCUtils {
    static String URL = "jdbc:mysql://localhost:3307/food";
    static String USER = "root";
    static String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

class FoodOrderingSystem1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Admin");
            System.out.println("2. Customer");
            System.out.println("3. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    Admin.adminMenu();
                    break;
                case 2:
                    Customer.customerMenu();
                    Customer.customerOptions();
                    break;
                case 3:
                    System.out.println("Thank you for using the Food Ordering System.");
                    break;
            }
        } while (choice != 3);
    }
}

class Admin {
    static Scanner scanner = new Scanner(System.in);

    public static void adminMenu() {
        System.out.println("Enter Username : ");
        String username = scanner.nextLine();
        System.out.println("Enter Password : ");
        String password = scanner.nextLine();
        if (authenticateAdmin(username, password)) {
            System.out.println(" Welcome, Admin! ");
            int choice;
            do {
                System.out.println("1. Add Restaurants");
                System.out.println("2. Remove Restaurants");
                System.out.println("3. Add Menu Items");
                System.out.println("4. Remove Menu Items");
                System.out.println("5. Change Price of Food");
                System.out.println("6. Exit");
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        addRestaurant();
                        break;
                    case 2:
                        removeRestaurant();
                        break;
                    case 3:
                        addMenuItem();
                        break;
                    case 4:
                        removeMenuItem();
                        break;
                    case 5:
                        changePrice();
                        break;
                }
            } while (choice != 6);
        } else {
            System.out.println("Invalid Username or Password!");
        }
    }

    static boolean authenticateAdmin(String username, String password) {
        String query = "SELECT * FROM Admin WHERE username = ? AND password = ?";
        try {
            Connection connection = JDBCUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    static void addRestaurant() {
        System.out.println("Enter Restaurant Name : ");
        String name = scanner.nextLine();
        System.out.println("Enter Restaurant Address : ");
        String address = scanner.nextLine();
        System.out.println("Enter Restaurant Phone No : ");
        String phone = scanner.nextLine();
        String query = "INSERT INTO Restaurant (name, address, phone_no) VALUES (?, ?, ?)";
        try {
            Connection connection = JDBCUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, address);
            preparedStatement.setString(3, phone);
            int a1 = preparedStatement.executeUpdate();
            if (a1 > 0) {
                System.out.println("Restaurant added successfully.");
            } else {
                System.out.println("Restaurant NOT added.");
            }
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                int restaurantId = generatedKeys.getInt(1);
                System.out.println("Enter Menu Items name and price. IF No Other Items Add When Type 'done' when finished.");
                while (true) {
                    System.out.println("Enter Item Name: ");
                    String itemName = scanner.nextLine();
                    if (itemName.equalsIgnoreCase("done"))
                        break;
                    System.out.println("Enter Item Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    addMenuItem(restaurantId, itemName, price);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void addMenuItem(int restaurantId, String itemName, double price) {
        String query = "INSERT INTO MenuItem (restaurant_id, item_name, price) VALUES (?, ?, ?)";
        try {
            Connection connection = JDBCUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, restaurantId);
            preparedStatement.setString(2, itemName);
            preparedStatement.setDouble(3, price);
            int a1 = preparedStatement.executeUpdate();
            if (a1 > 0) {
                System.out.println("Item added successfully.");
            } else {
                System.out.println("Item NOT added.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void removeRestaurant() {
        System.out.println("Enter Restaurant ID to Remove: ");
        int restaurantId = scanner.nextInt();
        scanner.nextLine();
        String deleteMenuItemsQuery = "DELETE FROM MenuItem WHERE restaurant_id = ?";
        String deleteRestaurantQuery = "DELETE FROM Restaurant WHERE restaurant_id = ?";
        try {
            Connection connection = JDBCUtils.getConnection();
            PreparedStatement preparedStatement1 = connection.prepareStatement(deleteMenuItemsQuery);
            PreparedStatement preparedStatement2 = connection.prepareStatement(deleteRestaurantQuery);
            preparedStatement1.setInt(1, restaurantId);
            int a1 = preparedStatement1.executeUpdate();
            preparedStatement2.setInt(1, restaurantId);
            int a2 = preparedStatement2.executeUpdate();
            if (a1 > 0 && a2 > 0) {
                System.out.println("Restaurant and its menu items removed successfully.");
            } else {
                System.out.println("Restaurant and its menu items  NOT removed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void addMenuItem() {
        System.out.println("Enter Restaurant ID: ");
        int restaurantId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Item Name: ");
        String itemName = scanner.nextLine();
        System.out.println("Enter Item Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        addMenuItem(restaurantId, itemName, price);
        System.out.println("Menu item added successfully.");
    }

    static void removeMenuItem() {
        System.out.println("Enter Item ID to Remove: ");
        int itemId = scanner.nextInt();
        scanner.nextLine();
        String query = "DELETE FROM MenuItem WHERE item_id = ?";
        try {
            Connection connection = JDBCUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, itemId);
            int a1 = preparedStatement.executeUpdate();
            if (a1 > 0) {
                System.out.println("Menu item removed successfully.");
            } else {
                System.out.println("Menu item NOT removed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void changePrice() {
        System.out.println("Enter Item ID : ");
        int itemId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter New Price : ");
        double newPrice = scanner.nextDouble();
        scanner.nextLine();
        String query = "UPDATE MenuItem SET price = ? WHERE item_id = ?";
        try {
            Connection connection = JDBCUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDouble(1, newPrice);
            preparedStatement.setInt(2, itemId);
            int a1 = preparedStatement.executeUpdate();
            if (a1 > 0) {
                System.out.println("Price updated successfully.");
            } else {
                System.out.println("Price NOT updated.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void adminLogin() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adminLogin'");
    }
}

class Customer {
    static Scanner scanner = new Scanner(System.in);
    static int tempCustomerId;
    static LinkedList<CartItem> cart = new LinkedList<>();
    static CustomQueue<RestaurantRating> restaurantQueue = new CustomQueue<>();

    public static void customerMenu() {
        System.out.println("1. New Customer");
        System.out.println("2. Existing Customer");
        int choice = scanner.nextInt();
        if (choice == 1) {
            newCustomer();
        } else if (choice == 2) {
            existingCustomer();
        }
    }

    private static void newCustomer() {
        String name = validateName();
        String email = validateEmail();
        String password = validatePassword();
        String phone = validatePhone();
        System.out.println("Enter your address: ");
        String address = scanner.next();

        String query = "INSERT INTO Customer (name, email, phone, address, password) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = JDBCUtils.getConnection();PreparedStatement preparedStatement = connection.prepareStatement(query,Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, phone);
            preparedStatement.setString(4, address);
            preparedStatement.setString(5, password);
            preparedStatement.executeUpdate();
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                tempCustomerId = generatedKeys.getInt(1);
                System.out.println("Welcome, " + name + "! Your customer ID is " + tempCustomerId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void existingCustomer() {
        int attempts = 0;
        while (attempts < 3) {
            System.out.println("Enter Email: ");
            String email = scanner.next();
            System.out.println("Enter Password: ");
            String password = scanner.next();

            String query = "SELECT customer_id FROM Customer WHERE email = ? AND password = ?";
            try (Connection connection = JDBCUtils.getConnection();
                    PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, email);
                preparedStatement.setString(2, password);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    tempCustomerId = resultSet.getInt(1);
                    System.out.println("Welcome back! Your customer ID is " + tempCustomerId);
                    customerOptions();
                    return;
                } else {
                    attempts++;
                    System.out.println("Invalid Email or Password!");
                    if (attempts == 3) {
                        System.out.println("You have exceeded the maximum number of attempts.");
                        System.out.println("Would you like to reset your password? (yes/no)");
                        String reset = scanner.next();
                        if (reset.equalsIgnoreCase("yes")) {
                            forgotPassword();
                            return;
                        } else {
                            System.exit(0);
                        }
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void forgotPassword() {
        String email = validateEmail();
        String newPassword = validatePassword();
        System.out.println("Enter conform Password (Length must be 8 and contain at least 1 special character): ");
        String conformPassword = scanner.next();
        if (!newPassword.equals(conformPassword)) {
            while (true) {
                System.out.println("Enter conform Password (new password and conform password must be same): ");
                String password = scanner.next();
                if (newPassword == conformPassword) {
                    break;
                } else {
                    System.out.println(
                            "Invalid password. new password and conform password must be same.");
                }
            }
        }

        String query = "UPDATE Customer SET password = ? WHERE email = ?";
        try (Connection connection = JDBCUtils.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, newPassword);
            preparedStatement.setString(2, email);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Password reset successful. You can now log in with your new password.");
                existingCustomer();
            } else {
                System.out.println("Error resetting password. Please try again.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void customerOptions() {
        int choice;
        do {
            System.out.println("1. Add to Cart");
            System.out.println("2. Remove from Cart");
            System.out.println("3. Place Order");
            System.out.println("4. Cancel Order");
            System.out.println("5. Check Order Status");
            System.out.println("6. Check Order History");
            System.out.println("7. Show Most Rated Restaurant");
            System.out.println("8. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addToCart();
                    break;
                case 2:
                    removeFromCart();
                    break;
                case 3:
                    placeOrder();
                    break;
                case 4:
                    cancelOrder();
                    break;
                case 5:
                    checkOrderStatus();
                    break;
                case 6:
                    checkOrderHistory();
                    break;
                case 7:
                    showMostRatedRestaurant();
                    break;
            }
        } while (choice != 8);
    }

    private static void addToCart() {
        // Display categories
        String categoryQuery = "SELECT * FROM Category";
        try (Connection connection = JDBCUtils.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(categoryQuery)) {
            System.out.println("Categories:");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("category_id") + ". " + resultSet.getString("category_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }

        // Get category selection
        System.out.println("Select Category ID: ");
        int categoryId = scanner.nextInt();

        // Display restaurants for selected category
        String restaurantQuery = "SELECT restaurant_id, name FROM Restaurant";
        try (Connection connection = JDBCUtils.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(restaurantQuery)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("Restaurants:");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("restaurant_id") + ". " + resultSet.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }

        // Get restaurant selection
        System.out.println("Select Restaurant ID: ");
        int restaurantId = scanner.nextInt();

        // Display menu items for selected category and restaurant
        String menuItemQuery = "SELECT item_id, item_name, price FROM MenuItem WHERE restaurant_id = ?";
        try (Connection connection = JDBCUtils.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(menuItemQuery)) {
            preparedStatement.setInt(1, restaurantId);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("Menu Items:");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("item_id") + ". " + resultSet.getString("item_name") + " - "
                        + resultSet.getDouble("price"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }

        // Get item selection
        System.out.println("Select Item ID: ");
        int itemId = scanner.nextInt();

        System.out.println("Enter Quantity: ");
        int quantity = scanner.nextInt();

        // Retrieve item details
        String itemDetailsQuery = "SELECT item_name, price FROM MenuItem WHERE item_id = ?";
        try (Connection connection = JDBCUtils.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(itemDetailsQuery)) {
            preparedStatement.setInt(1, itemId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String itemName = resultSet.getString("item_name");
                double price = resultSet.getDouble("price");

                // Retrieve restaurant name
                String restaurantNameQuery = "SELECT name FROM Restaurant WHERE restaurant_id = ?";
                try (PreparedStatement restaurantPreparedStatement = connection.prepareStatement(restaurantNameQuery)) {
                    restaurantPreparedStatement.setInt(1, restaurantId);
                    ResultSet restaurantResultSet = restaurantPreparedStatement.executeQuery();
                    if (restaurantResultSet.next()) {
                        String restaurantName = restaurantResultSet.getString("name");

                        // Add to cart
                        cart.add(new CartItem(itemId, restaurantId, itemName, restaurantName, price, quantity));
                        System.out.println("Item added to cart.");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void removeFromCart() {
        // Print the current cart
        System.out.println("Current Cart:");
        for (CartItem item : cart) {
            System.out.println("Item ID: " + item.getItemId() + ", Item Name: " + item.getItemName() +
                    ", Restaurant Name: " + item.getRestaurantName() + ", Quantity: " + item.getQuantity() +
                    ", Price: " + item.getPrice());
        }

        // Ask user for input item ID to remove
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Item ID to remove: ");
        int itemIdToRemove = scanner.nextInt();

        // Ask user for input quantity to remove
        System.out.print("Enter Quantity to remove: ");
        int quantityToRemove = scanner.nextInt();

        // Remove item or update quantity
        for (CartItem item : cart) {
            if (item.getItemId() == itemIdToRemove) {
                int updatedQuantity = item.getQuantity() - quantityToRemove;
                if (updatedQuantity <= 0) {
                    cart.remove(item);
                    System.out.println("Item removed from cart.");
                } else {
                    item.setQuantity(updatedQuantity);
                    System.out.println("Item quantity updated in cart.");
                }
                break;
            }
        }
    }

    private static void placeOrder() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        // Get order details
        double totalAmount = 0;
        for (CartItem item : cart) {
            totalAmount += item.getPrice() * item.getQuantity();
        }
        System.out.println("Total Amount: " + totalAmount);

        System.out.println("Do you want to place the order? (yes/no)");
        String choice = scanner.next();
        if (!choice.equalsIgnoreCase("yes")) {
            return;
        }

        // Ask for payment method
        System.out.println("Select Payment Method: ");
        System.out.println("1. Credit Card");
        System.out.println("2. Debit Card");
        System.out.println("3. PayPal");
        System.out.println("4. Cash on Delivery");
        int paymentMethodChoice = scanner.nextInt();
        String paymentMethod = "";
        switch (paymentMethodChoice) {
            case 1:
                paymentMethod = "Credit Card";
                break;
            case 2:
                paymentMethod = "Debit Card";
                break;
            case 3:
                paymentMethod = "PayPal";
                break;
            case 4:
                paymentMethod = "Cash on Delivery";
                break;
            default:
                System.out.println("Invalid payment method. Order not placed.");
                return;
        }

        // Insert order and payment details
        String orderQuery = "INSERT INTO Orders (customer_id, item_name, quantity, total_price, order_date) VALUES (?, ?, ?, ?, CURRENT_TIMESTAMP)";
        String paymentQuery = "INSERT INTO Payment (payment_type, customer_id, item_name, quantity, total_price) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = JDBCUtils.getConnection();
                PreparedStatement orderStatement = connection.prepareStatement(orderQuery,
                        Statement.RETURN_GENERATED_KEYS);
                PreparedStatement paymentStatement = connection.prepareStatement(paymentQuery)) {

            Set<Integer> restaurantIds = new HashSet<>();
            Set<Integer> itemIds = new HashSet<>();
            for (CartItem item : cart) {
                // Insert order details into Orders table
                orderStatement.setInt(1, tempCustomerId);
                orderStatement.setString(2, item.getItemName());
                orderStatement.setInt(3, item.getQuantity());
                orderStatement.setDouble(4, item.getPrice() * item.getQuantity());
                orderStatement.addBatch();

                // Insert payment details into Payment table
                paymentStatement.setString(1, paymentMethod);
                paymentStatement.setInt(2, tempCustomerId);
                paymentStatement.setString(3, item.getItemName());
                paymentStatement.setInt(4, item.getQuantity());
                paymentStatement.setDouble(5, item.getPrice() * item.getQuantity());
                paymentStatement.addBatch();

                // Collect restaurant IDs and item IDs
                restaurantIds.add(item.getRestaurantId());
                itemIds.add(item.getItemId());
            }

            orderStatement.executeBatch();
            paymentStatement.executeBatch();

            // Retrieve the generated order_id
            ResultSet generatedKeys = orderStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                int orderId = generatedKeys.getInt(1);
                System.out.println("Order placed and payment processed successfully.");
                System.out.println("Order ID: " + orderId);

                // Ask for feedback
                System.out.println("Would you like to provide feedback for the menu items? (yes/no)");
                String menuItemFeedbackChoice = scanner.next();
                if (menuItemFeedbackChoice.equalsIgnoreCase("yes")) {
                    for (int itemId : itemIds) {
                        System.out.println("Rate the item with ID " + itemId + " (1 to 5 stars): ");
                        int rating = scanner.nextInt();

                        // Insert feedback into Feedback table
                        String feedbackQuery = "INSERT INTO Feedback (customer_id, restaurant_id, item_id, rating) VALUES (?, ?, ?, ?)";
                        try (PreparedStatement feedbackStatement = connection.prepareStatement(feedbackQuery)) {
                            feedbackStatement.setInt(1, tempCustomerId);
                            feedbackStatement.setInt(2, getRestaurantIdForItemId(itemId)); // Helper method to get
                                                                                           // restaurant ID
                            feedbackStatement.setInt(3, itemId);
                            feedbackStatement.setInt(4, rating);
                            feedbackStatement.executeUpdate();

                            // Update MenuItem table
                            String updateMenuItemQuery = "UPDATE MenuItem SET rating(out of 5 star) = rating + ?, rating_count = rating_count + 1 WHERE item_id = ?";
                            try (PreparedStatement menuItemStatement = connection
                                    .prepareStatement(updateMenuItemQuery)) {
                                menuItemStatement.setInt(1, rating);
                                menuItemStatement.setInt(2, itemId);
                                menuItemStatement.executeUpdate();
                            }

                            System.out.println("Thank you for your feedback for item ID " + itemId + "!");
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }

                System.out.println("Would you like to provide feedback for the restaurant? (yes/no)");
                String restaurantFeedbackChoice = scanner.next();
                if (restaurantFeedbackChoice.equalsIgnoreCase("yes")) {
                    for (int restaurantId : restaurantIds) {
                        System.out.println("Rate the restaurant with ID " + restaurantId + " (1 to 5 stars): ");
                        int rating = scanner.nextInt();

                        // Insert feedback into Feedback table
                        String feedbackQuery = "INSERT INTO Feedback (customer_id, restaurant_id, item_id, rating) VALUES (?, ?, ?, ?)";
                        try (PreparedStatement feedbackStatement = connection.prepareStatement(feedbackQuery)) {
                            feedbackStatement.setInt(1, tempCustomerId);
                            feedbackStatement.setInt(2, restaurantId);
                            feedbackStatement.setInt(3, -1); // Use -1 for restaurant feedback
                            feedbackStatement.setInt(4, rating);
                            feedbackStatement.executeUpdate();

                            // Update Restaurant table
                            String updateRestaurantQuery = "UPDATE Restaurant SET rating = rating + ?, rating_count = rating_count + 1 WHERE restaurant_id = ?";
                            try (PreparedStatement restaurantStatement = connection.prepareStatement(updateRestaurantQuery)) {
                                restaurantStatement.setInt(1, rating);
                                restaurantStatement.setInt(2, restaurantId);
                                restaurantStatement.executeUpdate();
                            }

                            System.out.println("Thank you for your feedback for restaurant ID " + restaurantId + "!");
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Helper method to get restaurant ID for a given item ID
    private static int getRestaurantIdForItemId(int itemId) {
        String query = "SELECT restaurant_id FROM MenuItem WHERE item_id = ?";
        try (Connection connection = JDBCUtils.getConnection();
                PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, itemId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt("restaurant_id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1; // Default value if no result is found
    }

    private static void cancelOrder() {
        System.out.println("Enter Order ID to Cancel: ");
        int orderId = scanner.nextInt();

        // Step 1: Fetch quantities from Orders table for the given order ID
        String fetchQuery = "SELECT item_name, quantity FROM Orders WHERE order_id = ?";
        Map<String, Integer> itemQuantities = new HashMap<>();

        try (Connection connection = JDBCUtils.getConnection();
                PreparedStatement fetchStatement = connection.prepareStatement(fetchQuery)) {

            fetchStatement.setInt(1, orderId);
            ResultSet resultSet = fetchStatement.executeQuery();

            while (resultSet.next()) {
                String itemName = resultSet.getString("item_name");
                int quantity = resultSet.getInt("quantity");
                itemQuantities.put(itemName, quantity);
            }

            // Step 2: Remove the order from Orders table
            String deleteQuery = "DELETE FROM Orders WHERE order_id = ?";
            try (PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery)) {
                deleteStatement.setInt(1, orderId);
                deleteStatement.executeUpdate();
                System.out.println("Order cancelled successfully.");
            }

            // Step 3: Update the MenuItem table
            String updateQuery = "UPDATE MenuItem SET quantity = quantity + ? WHERE item_name = ?";
            try (PreparedStatement updateStatement = connection.prepareStatement(updateQuery)) {
                for (Map.Entry<String, Integer> entry : itemQuantities.entrySet()) {
                    updateStatement.setInt(1, entry.getValue()); // Add quantity back
                    updateStatement.setString(2, entry.getKey());
                    updateStatement.executeUpdate();
                }
                System.out.println("Menu items updated successfully.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void checkOrderStatus() {
        // Implement check order status functionality
    }

    private static void checkOrderHistory() {
        String query = "SELECT order_id, item_name, quantity, total_price, order_date FROM Orders WHERE customer_id = ? ORDER BY order_date";
        try (Connection connection = JDBCUtils.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, tempCustomerId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Order ID: " + resultSet.getInt("order_id"));
                System.out.println("Item Name: " + resultSet.getString("item_name"));
                System.out.println("Quantity: " + resultSet.getInt("quantity"));
                System.out.println("Total Price: " + resultSet.getDouble("total_price"));
                System.out.println("Order Date: " + resultSet.getTimestamp("order_date"));
                System.out.println("-----------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void showMostRatedRestaurant() {
        String query = "SELECT restaurant_id, AVG(rating) as avg_rating FROM Feedback GROUP BY restaurant_id HAVING AVG(rating) >= 4";

        try (Connection connection = JDBCUtils.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query)) {

            // Populate the queue
            while (resultSet.next()) {
                int restaurantId = resultSet.getInt("restaurant_id");
                double avgRating = resultSet.getDouble("avg_rating");
                restaurantQueue.enqueue(new RestaurantRating(restaurantId, avgRating));
            }

            // Sort the queue using a temporary array
            RestaurantRating[] ratings = new RestaurantRating[restaurantQueue.size()];
            int index = 0;
            while (!restaurantQueue.isEmpty()) {
                ratings[index++] = restaurantQueue.dequeue();
            }

            // Sort the array in descending order of avgRating
            quickSort(ratings, 0, ratings.length - 1);

            // Print sorted results
            for (RestaurantRating rating : ratings) {
                System.out.println("Restaurant ID: " + rating.restaurantId + " with Average Rating: " + rating.avgRating);

                // Fetch restaurant details
                String restaurantQuery = "SELECT name FROM Restaurant WHERE restaurant_id = ?";
                try (PreparedStatement restaurantStatement = connection.prepareStatement(restaurantQuery)) {
                    restaurantStatement.setInt(1, rating.restaurantId);
                    ResultSet restaurantResultSet = restaurantStatement.executeQuery();
                    if (restaurantResultSet.next()) {
                        String restaurantName = restaurantResultSet.getString("name");
                        System.out.println("Restaurant Name: " + restaurantName);
                    }
                }

                // Fetch menu items for the restaurant
                String menuItemQuery = "SELECT item_id, item_name, price FROM MenuItem WHERE restaurant_id = ?";
                try (PreparedStatement menuItemStatement = connection.prepareStatement(menuItemQuery)) {
                    menuItemStatement.setInt(1, rating.restaurantId);
                    ResultSet menuItemResultSet = menuItemStatement.executeQuery();
                    System.out.println("Menu Items:");
                    while (menuItemResultSet.next()) {
                        int itemId = menuItemResultSet.getInt("item_id");
                        String itemName = menuItemResultSet.getString("item_name");
                        double price = menuItemResultSet.getDouble("price");
                        System.out.println("Item ID: " + itemId + ", Item Name: " + itemName + ", Price: " + price);
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Helper method for quick sort
    private static void quickSort(RestaurantRating[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(RestaurantRating[] array, int low, int high) {
        RestaurantRating pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j].avgRating > pivot.avgRating) {
                i++;
                RestaurantRating temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        RestaurantRating temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    private static String validateName() {
        while (true) {
            System.out.println("Enter Name (Only alphabets): ");
            String name = scanner.next();
            if (isAlpha(name)) {
                return name;
            } else {
                System.out.println("Invalid name. Name should contain only alphabets.");
            }
        }
    }

    // Method to validate email (minimum length 15 and ends with '@gmail.com')
    private static String validateEmail() {
        while (true) {
            System.out.println("Enter Email (Minimum length 15 and ends with '@gmail.com'): ");
            String email = scanner.next();
            if (email.length() >= 15 && email.endsWith("@gmail.com")) {
                return email;
            } else {
                System.out.println("Invalid email. Email must be at least 15 characters long and end with '@gmail.com'.");
            }
        }
    }

    // Method to validate password (length must be 8 and must contain at least 1
    // special character)
    private static String validatePassword() {
        while (true) {
            System.out.println("Enter Password (Length must be 8 and contain at least 1 special character): ");
            String password = scanner.next();
            if (password.length() == 8 && containsSpecialCharacter(password)) {
                return password;
            } else {
                System.out.println("Invalid password. Password must be exactly 8 characters long and contain at least 1 special character.");
            }
        }
    }

    // Method to validate phone number (length must be 10 and contain only digits)
    private static String validatePhone() {
        while (true) {
            System.out.println("Enter Phone (Length must be 10 and contain only digits): ");
            String phone = scanner.next();
            if (phone.length() == 10 && isNumeric(phone)) {
                return phone;
            } else {
                System.out.println("Invalid phone number. Phone number must be exactly 10 digits long.");
            }
        }
    }

    // Helper method to check if a string contains only alphabets
    private static boolean isAlpha(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    // Helper method to check if a string contains only digits
    private static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    // Helper method to check if a string contains at least one special character
    private static boolean containsSpecialCharacter(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }
}

class CustomLinkedList {
    class Node {
        CartItem data;
        Node next;

        Node(CartItem data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Add an item to the linked list
    public void add(CartItem data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Remove an item by its index from the linked list
    public void remove(int index) {
        if (head == null) {
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            return;
        }

        current.next = current.next.next;
    }

    // Check if the linked list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Get the size of the linked list
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Get an item at a specific index
    public CartItem get(int index) {
        Node current = head;
        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }
        return current != null ? current.data : null;
    }

    // Print all items in the linked list (for debugging purposes)
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data.getItemName() + " - " + current.data.getPrice());
            current = current.next;
        }
    }
}

class CustomQueue<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public CustomQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (rear != null) {
            rear.next = newNode;
        }
        rear = newNode;
        if (front == null) {
            front = newNode;
        }
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        T item = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        return front.data;
    }
}

class CartItem {
    private int itemId;
    private int restaurantId;
    private String itemName;
    private String restaurantName;
    private double price;
    private int quantity;

    public CartItem(int itemId, int restaurantId, String itemName, String restaurantName, double price,int quantity) {
        this.itemId = itemId;
        this.restaurantId = restaurantId;
        this.itemName = itemName;
        this.restaurantName = restaurantName;
        this.price = price;
        this.quantity = quantity;
    }

    public int getItemId() {
        return itemId;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int updatedQuantity) {
        quantity = updatedQuantity;
    }
}

class RestaurantRating {
    int restaurantId;
    double avgRating;

    RestaurantRating(int restaurantId, double avgRating) {
        this.restaurantId = restaurantId;
        this.avgRating = avgRating;
    }
}