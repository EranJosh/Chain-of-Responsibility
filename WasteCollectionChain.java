public class WasteCollectionChain implements WasteHandler {
    private WasteHandler firstHandler;

    public WasteCollectionChain() {
        // Initialize handlers
        WasteHandler organic    = new OrganicWasteCollector();
        WasteHandler recyclable = new RecyclableWasteCollector();
        WasteHandler hazardous  = new HazardousWasteCollector();

        // Build the chain
        organic.setNextHandler(recyclable);
        recyclable.setNextHandler(hazardous);

        this.firstHandler = organic;
    }

    @Override
    public void setNextHandler(WasteHandler nextHandler) {
        // Not used at chain level
    }

    @Override
    public void handle(WasteContainer container) {
        firstHandler.handle(container);
    }
}