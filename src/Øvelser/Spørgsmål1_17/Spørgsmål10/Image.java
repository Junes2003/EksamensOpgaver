package Øvelser.Spørgsmål1_17.Spørgsmål10;

public class Image {
    private String fileName;
    private int width;
    private int height;

    public Image(String fileName, int width, int height){
        this.fileName = fileName;
        this.width = width;
        this.height = height;
    }

    public String getFileName(){
        return fileName;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public boolean isKnownFileType(){
        return fileName.endsWith(".gif") ||
                fileName.endsWith(".jpg") ||
                fileName.endsWith(".jpeg") ||
                fileName.endsWith(".png") ||
                fileName.endsWith(".webp") ||
                fileName.endsWith(".bmp");
    }

    public boolean isPortrait(){
        return width < height;
    }

    public boolean isLandscape(){
        return width > height;
    }

    public String toString(){
        return "Filename: " + fileName +
                "Witdth: " + width +
                "Height: " + height;
    }
}
