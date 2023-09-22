package fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.enums;

public enum ProductStatus {
    ACTIVE(1),
    PAUSED(0),
    NOT_ACTIVE(-1)  ;

    private int value;

    ProductStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
