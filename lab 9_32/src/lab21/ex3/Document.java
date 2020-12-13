package lab21.ex3;

public abstract class Document {

    private Status status;

    public Document(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void save() {
        this.status = Status.SAVED;
    }

    public abstract String getType();
}
