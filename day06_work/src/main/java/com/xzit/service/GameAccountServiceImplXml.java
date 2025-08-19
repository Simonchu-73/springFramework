package com.xzit.service;

import com.xzit.mapper.GameAccountMapper;
import com.xzit.mapper.GameRecordsMapper;
import com.xzit.model.GameAccount;
import com.xzit.model.GameRecords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;
@Service
public class GameAccountServiceImplXml implements GameAccountService {
    private GameAccountMapper accountMapper;
    private GameRecordsMapper recordsMapper;

    @Autowired
    public GameAccountServiceImplXml(GameAccountMapper accountMapper, GameRecordsMapper recordsMapper) {
        this.accountMapper = accountMapper;
        this.recordsMapper = recordsMapper;
    }


    @Override
    public int insert(GameAccount account) {
        return accountMapper.insert(account);
    }

    @Override
    public List<GameAccount> selectList() {
        return accountMapper.selectList();
    }

    @Override
    public GameAccount login(GameAccount account) {
        return accountMapper.login(account);
    }

    @Override
    public int couponUpdate(GameAccount account, int num)  {
        //新增点券流动记录
        GameRecords records = new GameRecords();
        if (num > 0) {
            records.setAccount(account.getAccount());
            records.setUpdateTime(LocalDateTime.now());
            records.setNum(num);
            records.setCategory("充值");

        } else {
            records.setAccount(account.getAccount());
            records.setUpdateTime(LocalDateTime.now());
            records.setNum(num);
            records.setCategory("消费");
        }
        recordsMapper.insertRecord(records);
        if (num == 500) {
            try {
                TimeUnit.SECONDS.sleep(6);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else if(num==-300){
            System.out.println("正常提交的测试");
        }
        //修改账号点券
        account.setCoupon(account.getCoupon()+num);
        return accountMapper.couponUpdate(account);


    }
}
