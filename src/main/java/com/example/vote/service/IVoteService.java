package com.example.vote.service;

import com.example.vote.entity.Vote;

import java.util.List;

/**
 * @author th
 */
public interface IVoteService {

    /**
     * 加载投票
     * @return list of votes
     */
    List<Vote> loadVoter();

    /**
     * 统计投票
     * @param votes 投票列表
     * @return 同意的票数
     */
    int countVotes(List<Vote> votes);

    /**
     * 统计投票
     * @return 同意的票数
     */
    int countVotes();

    /**
     * 打印投票结果
     */
    void displayResults();
}
