package org.infinity.server.v2.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.infinity.server.v2.entity.User;

import java.util.List;

@Builder
@Getter @Setter
public class UserListResponse {
    List<User> userList;
}
