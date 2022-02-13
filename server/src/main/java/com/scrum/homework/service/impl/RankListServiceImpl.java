package com.scrum.homework.service.impl;

import com.scrum.homework.dao.RankListMapper;
import com.scrum.homework.domain.RankList;
import com.scrum.homework.service.RankListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RankListServiceImpl implements RankListService {

    @Autowired
    private RankListMapper rankMapper;

    @Override
    public int rankOfSongListId(Long songListId) {
        return rankMapper.selectScoreSum(songListId) / rankMapper.selectRankNum(songListId);
    }

    @Override
    public boolean addRank(RankList rankList) {

        return rankMapper.insertSelective(rankList) > 0 ? true:false;
    }
}
