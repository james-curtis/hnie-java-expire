package com.example.vote.service.impl;

import com.example.vote.entity.Vote;
import com.example.vote.service.IVoteService;
import lombok.extern.slf4j.Slf4j;

import java.io.InputStream;
import java.util.*;

/**
 * @author th
 */
@Slf4j
public class VoteServiceImpl implements IVoteService {

    private final List<Vote> voteList = new ArrayList<>();

    private final Map<String, Vote> voteResult = new HashMap<>();

    private final int limit = 100;

    @Override
    public List<Vote> loadVoter() {
        /// 主观结束投票
//        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("test2/interrupt.txt");
        /// 超过一百个有效投票
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("test2/over100.txt");
        /// 常规输入
//        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("test2/in.txt");
        System.setIn(inputStream);
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        while (count-- != 0) {
            String name = scanner.next();
            int vote = scanner.nextInt();
            if ("0".equals(name) && vote == 0) {
                break;
            }
            voteList.add(new Vote(name, vote == 1));
        }
        return voteList;
    }

    @Override
    public int countVotes() {
        return countVotes(voteList);
    }

    @Override
    public int countVotes(List<Vote> votes) {
        for (var vote : votes) {
            if (voteResult.size() >= limit) {
                break;
            }
            if (voteResult.get(vote.getUsername()) != null) {
                log.info(vote.getUsername() + " 你不允许重复投票。");
            } else {
                log.info(vote.getUsername() + " 感谢你的投票。");
            }
            voteResult.put(vote.getUsername(), vote);
        }
        log.info("当前投票数为：" + voteResult.size());
        return voteResult.size();
    }


    @Override
    public void displayResults() {
        log.info("参与投票的选民和结果如下：");
        voteResult.forEach((voterName, data) ->
            log.info(data.getUsername() + " 意见 " + (data.isOpinion() ? "是" : "否")));
    }
}
