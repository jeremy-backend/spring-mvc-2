package hello.itemservice.domain.item;

public class ItemType {

    BOOK("도서"), FOOD("음식"), ETC("기타");

    private final String decsription;

    ItemType(String decsription) {
        this.decsription = decsription;
    }
}
