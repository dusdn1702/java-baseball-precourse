package domain;

public enum RestartFlag {
    RESTART("1", true),
    DONE("2", false);

    private final boolean flag;
    private final String input;

    RestartFlag(String input, boolean flag) {
        this.input = input;
        this.flag = flag;
    }

    public static boolean inputToFlag(String playerInput) {
        for (RestartFlag restartFlag : RestartFlag.values()) {
            if (restartFlag.input.equals(playerInput)) {
                return restartFlag.flag;
            }
        }
        throw new IllegalArgumentException("옳지 않은 입력입니다.");
    }
}
