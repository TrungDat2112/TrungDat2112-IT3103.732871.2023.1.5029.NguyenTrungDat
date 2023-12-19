package hust.soict.hedspi.aims.media;

//Nguyen Trung Dat 20215029
public abstract class Media {
    public Media() {
        // TODO Auto-generated constructor stub
    }

    protected int id;
    protected String title;
    protected String category;
    protected float cost;

    public Media(String title) {
        this();
        this.title = title;
    }

    public Media(String title, String category, float cost) {
        this(title);
        this.category = category;
        this.cost = cost;
    }

    // Nguyen Trung Dat 20215029
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    public abstract String toString();

}
