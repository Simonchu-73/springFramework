package com.xzit.service;

import com.xzit.dao.TeamDao;
import com.xzit.dao.TeamDaoImpl;
import com.xzit.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
    private final TeamDao teamDao;
    private final Team team;

    @Autowired
    public TeamService(TeamDaoImpl teamDaoImpl, Team team) {
        this.teamDao = teamDaoImpl;
        this.team = team;
    }

    public int save() {
        return teamDao.save(team);
    }

    public int delete() {
       return teamDao.delete(team);
    }
}
