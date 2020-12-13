package lab21.ex3;

public class ImageDocument extends lab21.ex3.Document {

    public ImageDocument(Status status) {
        super(status);
    }

    @Override
    public String getType() {
        return "image";
    }

}
