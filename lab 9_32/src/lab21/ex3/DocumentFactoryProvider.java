package lab21.ex3;

public class DocumentFactoryProvider {

    public static lab21.ex3.AbstractDocumentFactory getFactory(String type) {
        if (type.equals("image")) {
            return new ImageDocumentFactory();
        }
        if (type.equals("music")) {
            return new MusicDocumentFactory();
        }
        if (type.equals("text")) {
            return new TextDocumentFactory();
        }
        return null;
    }

}
