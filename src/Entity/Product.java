package Entity;

import java.util.Objects;

public class Product {
    public int id;
    public String title;
    public String image ;
    public double price;
    public int category_id;
/***********
* GETTERS & SETTERS
* */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }


    /*****
     * TOSTRING
     * **********/


    @Override
    public String toString() {
        return "products{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", price='" + price + '\'' +
                ", category_id=" + category_id +
                '}';
    }

    /*******
     * CONSTRUCTORS
     * *****/
    public Product() {
    }

    public Product(int id, String title, String image, double price, int category_id) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.price = price;
        this.category_id = category_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product Product = (Product) o;
        return getId() == Product.getId() && getCategory_id() == Product.getCategory_id() && Objects.equals(getTitle(), Product.getTitle()) && Objects.equals(getImage(), Product.getImage()) && Objects.equals(getPrice(), Product.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getImage(), getPrice(), getCategory_id());
    }
}


