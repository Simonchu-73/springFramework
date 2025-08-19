package com.xzit.service;

import com.xzit.model.GameAccount;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GameAccountService {
    int insert(GameAccount account);
    List<GameAccount> selectList();
    GameAccount login(GameAccount account);
    int couponUpdate(GameAccount account,int num);
    
}
