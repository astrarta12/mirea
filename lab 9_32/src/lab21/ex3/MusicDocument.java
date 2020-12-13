package lab21.ex3;

public class MusicDocument extends Document {

    public MusicDocument(Status status) {
        super(status);
    }

    @Override
    public String getType() {
        return "music";
    }

}
