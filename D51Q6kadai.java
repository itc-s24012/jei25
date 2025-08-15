public class D51Q6kadai {
    public static void main(String[] args) {
        Item2[] li = { new Item2("AA", "魚類"), new Item2("BB", "肉類") };
        Item2[] si = { new Item2("A1", "さば"), new Item2("A2", "さんま"),
                new Item2("B1", "牛肉"), new Item2("B2", "鶏肉"),
                new Item2("B3", "豚肉"), new Item2("B4", "加工肉") };
        ItemMaster2 im = new ItemMaster2(li, si);

        // 商品コードを配列にまとめる（例として3つ）
        String[] codes = {
                "AAA2009X",
                "B1B30001",
                "BBB400FF"
        };

        for (String code : codes) {
            String lcode = code.substring(0, 2);
            String scode = code.substring(2, 4);
            String details = code.substring(4);

            String lname = im.getItemName(im.MAJOR, lcode);
            String sname = im.getItemName(im.MINOR, scode);

            System.out.println("商品コード：" + code);
            System.out.println("大分類：" + lname);
            System.out.println("小分類：" + sname);
            System.out.println("詳細コード：" + details);
            System.out.println();
        }
    }
}

class Item2 {
    private String code;
    private String name;
    Item2(String code, String name) {
        this.code = code;
        this.name = name;
    }
    public String getCode() { return code; }
    public String getName() { return name; }
}

class ItemMaster2 {
    public int MAJOR = 0;
    public int MINOR = 1;
    private Item2[][] items;
    ItemMaster2(Item2[] major, Item2[] minor) {
        items = new Item2[2][];
        items[MAJOR] = major;
        items[MINOR] = minor;
    }

    public String getItemName(int codeLevel, String code) {
        for (int i = 0; i < items[codeLevel].length; i++) {
            if (items[codeLevel][i].getCode().equals(code)) {
                return items[codeLevel][i].getName();
            }
        }
        return "該当なし";
    }
}
