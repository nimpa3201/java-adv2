package chat.server;

import java.io.IOException;

public interface CommendManager {
    void execute(String totalMessage, Session session) throws IOException;
}
