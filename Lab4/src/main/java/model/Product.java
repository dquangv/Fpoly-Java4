package model;

public class Product {
    private int id;
    private String name;
    private String photo;
    private float price;

    public Product(int id, String name, String photo, float price) {
        super();
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
