package main.image_library;

import java.util.HashMap;

public class ImageCacheProxy implements IImageLibrary {
    private final IImageLibrary imageService;
    private HashMap<String, Image> cache = new HashMap<String, Image>();

    public ImageCacheProxy() {
        this.imageService = new ImageLibrary();
    }

    @Override
    public HashMap<String, Image> popularImages() {
        if (cache.isEmpty()) {
            cache = imageService.popularImages();
        }
        return cache;
    }

    @Override
    public Image getImage(String id) {
        Image image = cache.get(id);
        if (image != null) return image;
        image = imageService.getImage(id);
        cache.put(image.getId(), image);
        return image;
    }

    public void reset(){
        cache.clear();
    }
}
