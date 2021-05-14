package org.example.service;

import org.example.entity.Groups;

public interface GroupService extends Service<Groups> {
    Groups readByName(String name);
}
