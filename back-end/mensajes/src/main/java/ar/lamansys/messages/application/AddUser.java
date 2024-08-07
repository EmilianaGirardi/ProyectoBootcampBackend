package ar.lamansys.messages.application;

import ar.lamansys.messages.application.exception.UserExistsException;
import ar.lamansys.messages.infrastructure.output.UserStorage;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AddUser {
    private final UserStorage userStorage;
    private final AssertUserNotExists assertUserNotExists;

    public void run(String userId) throws UserExistsException {
        assertUserNotExists.run(userId);
        userStorage.save(userId);
    }
}