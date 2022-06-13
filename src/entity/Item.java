package entity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;
import java.util.Set;

//parse and clean event array to only save data we want.

public class Item {
    private String itemId;
    private String name;
    private double rating;
    private String address;
    private Set<String> categories;
    private String imageUrl;
    private String url;
    private double distance;

    //如果用public，每次创建item，需要把8个参数都写进去
    private Item(ItemBuilder builder) {
        this.itemId = builder.itemId;
        this.name = builder.name;
        this.rating = builder.rating;
        this.address = builder.address;
        this.categories = builder.categories;
        this.imageUrl = builder.imageUrl;
        this.url = builder.url;
        this.distance = builder.distance;
    }
    public JSONObject toJSONObject() {
        JSONObject obj = new JSONObject();
        try {
            obj.put("item_id", itemId);
            obj.put("name", name);
            obj.put("rating", rating);
            obj.put("address", address);
            obj.put("categories", new JSONArray(categories));
            obj.put("image_url", imageUrl);
            obj.put("url", url);
            obj.put("distance", distance);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public String getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public String getAddress() {
        return address;
    }

    public Set<String> getCategories() {
        return categories;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getUrl() {
        return url;
    }

    public double getDistance() {
        return distance;
    }




    // 需要太多constructors use Builder Pattern to solve


    // Itembuilder 存在的目的是为了创建item，如果不要static，则需要ITEM才可以创建ItemBUILDER, 互斥
    public static class ItemBuilder {
        private String itemId;
        private String name;
        private double rating;
        private String address;
        private Set<String> categories;
        private String imageUrl;
        private String url;
        private double distance;

        public void setItemId(String itemId) {
            this.itemId = itemId;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setCategories(Set<String> categories) {
            this.categories = categories;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setDistance(double distance) {
            this.distance = distance;
        }

        public Item build() {
            return new Item(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Objects.equals(getItemId(), item.getItemId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getItemId());
    }
}
