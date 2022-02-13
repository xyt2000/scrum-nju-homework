package com.scrum.homework.service;

import com.scrum.homework.domain.RankList;

public interface RankListService {

    int rankOfSongListId(Long songListId);

    boolean addRank(RankList rankList);
}
