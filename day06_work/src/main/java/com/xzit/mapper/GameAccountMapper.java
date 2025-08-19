package com.xzit.mapper;

import com.xzit.model.GameAccount;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameAccountMapper {
    int insert(GameAccount account);
    List<GameAccount> selectList();
    GameAccount login(GameAccount account);
    int couponUpdate(GameAccount account);
}
