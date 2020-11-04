package hello.core.Order;

public class Order {
    private Long memberId;
    private String itemName;
    private int itemPirce;
    private int discountPrice;


    public Order(Long memberId, String itemName, int itemPirce, int discountPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPirce = itemPirce;
        this.discountPrice = discountPrice;
    }

    public int calculatePrice() {
        return itemPirce - discountPrice;
    }

    public int getDiscountPirce() {
        return discountPrice;
    }

    public int getItemPirce() {
        return itemPirce;
    }

    public Long getMemberId() {
        return memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setDiscountPirce(int discountPirce) {
        this.discountPrice = discountPirce;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPirce(int itemPirce) {
        this.itemPirce = itemPirce;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itemPirce=" + itemPirce +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
