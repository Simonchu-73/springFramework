package com.xzit.dao;

import com.xzit.model.Team;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamDao {
    int save(Team team);
    int delete(Team team);
}
