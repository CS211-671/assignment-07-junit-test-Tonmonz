package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList

        // TODO: find one of them

        // TODO: assert that UserList found User
        // String expected = "<one of username>";
        // String actual = user.getUsername();
        // assertEquals(expected, actual);
        UserList userList = new UserList();
        userList.addUser("user1", "password1");
        userList.addUser("user2", "password2");
        userList.addUser("user3", "password3");

        User user = userList.findUserByUsername("user2");
        assertEquals("user2", user.getUsername());
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList

        // TODO: change password of one user

        // TODO: assert that user can change password
        // assertTrue(actual);
        UserList userList = new UserList();
        userList.addUser("user1", "password1");
        userList.addUser("user2", "password2");
        userList.addUser("user3", "password3");

        boolean isPasswordChanged = userList.changePassword("user1", "password1", "newPassword1");;
        assertTrue(isPasswordChanged);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with correct username and password

        // TODO: assert that User object is found
        // assertEquals(expected, actual);
        UserList userList = new UserList();
        userList.addUser("user1", "password1");
        userList.addUser("user2", "password2");
        userList.addUser("user3", "password3");

        User expectedUser = userList.findUserByUsername("user2");
        User actualUser = userList.login("user2", "password2");
        assertEquals(expectedUser, actualUser);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with incorrect username or incorrect password

        // TODO: assert that the method return null
        // assertNull(actual);
        UserList userList = new UserList();
        userList.addUser("user1", "password1");
        userList.addUser("user2", "password2");
        userList.addUser("user3", "password3");

        User user = userList.login("user1", "wrongPassword");
        assertNull(user);
    }

}