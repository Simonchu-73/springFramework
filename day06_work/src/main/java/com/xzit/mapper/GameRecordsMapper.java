package com.xzit.mapper;

import com.xzit.model.GameAccount;
import com.xzit.model.GameRecords;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRecordsMapper {
   int insertRecord(GameRecords record);
}
