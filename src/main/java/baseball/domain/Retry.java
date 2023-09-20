package baseball.domain;

public enum Retry {
    RETRY(1),
    STOP(2);

    private final int command;

    Retry(int command) {
        this.command = command;
    }

    public int getCommand() {
        return command;
    }
}
