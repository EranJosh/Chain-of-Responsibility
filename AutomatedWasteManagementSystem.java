public class AutomatedWasteManagementSystem {
    public static void main(String[] args) {
        WasteCollectionChain chain = new WasteCollectionChain();

        // Simulate waste containers that are full or need disposal
        WasteContainer c1 = new WasteContainer("organic",    100);
        WasteContainer c2 = new WasteContainer("recyclable",  85);
        WasteContainer c3 = new WasteContainer("hazardous",   90);
        WasteContainer c4 = new WasteContainer("unknown",     70); // validation test

        System.out.println("=== Automated Waste Management System ===\n");

        chain.handle(c1);
        chain.handle(c2);
        chain.handle(c3);
        chain.handle(c4);
    }
}

