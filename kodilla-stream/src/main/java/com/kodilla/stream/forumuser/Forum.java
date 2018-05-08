package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(123456, "Johny", (1988), 0, 'M'));
        theUserList.add(new ForumUser(464654, "Brian", (1966), 8, 'M'));
        theUserList.add(new ForumUser(828687, "Bob", (1972), 12, 'M'));
        theUserList.add(new ForumUser(123789, "Dylan", 1976, 1, 'M'));
        theUserList.add(new ForumUser(123777, "Madelynn", 1989, 2, 'F'));
        theUserList.add(new ForumUser(123878, "Matilda", 1999, 0, 'F'));
        theUserList.add(new ForumUser(123978, "Johny", 2000, 3, 'M'));
    }
    public List<ForumUser> getUserList () {
        return new ArrayList<>(theUserList);
    }

}
