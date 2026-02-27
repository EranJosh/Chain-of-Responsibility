public class WasteContainer {
    private String type;   // "organic", "recyclable", "hazardous"
    private int capacity;  // percentage full (0–100)

    public WasteContainer(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }
}