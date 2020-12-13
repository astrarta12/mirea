package lab21.ex3;

public class TextDocument extends Document {

    public TextDocument(Status status) {
        super(status);
    }

    @Override
    public String getType() {
        return "text";
    }

}
