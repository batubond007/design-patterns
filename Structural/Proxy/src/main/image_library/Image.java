package main.image_library;

public class Image {
    private final String id;
    private final int[][] pixelArray;

    public Image(String id, int[][] pixelArray) {
        this.id = id;
        this.pixelArray = pixelArray;
    }

    public String getId() {
        return id;
    }

    public int[][] getPixelArray() {
        return pixelArray;
    }
}
