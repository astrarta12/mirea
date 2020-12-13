package lab21.ex3;

public class MusicDocumentFactory implements lab21.ex3.AbstractDocumentFactory {

    @Override
    public lab21.ex3.Document create() {
        return new lab21.ex3.MusicDocument(Status.NEW);
    }

    @Override
    public lab21.ex3.Document open() {
        return new lab21.ex3.MusicDocument(Status.OPENED);
    }
}
