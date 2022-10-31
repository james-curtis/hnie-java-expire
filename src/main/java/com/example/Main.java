package com.example;

import com.example.phone.service.impl.PhoneServiceImpl;
import com.example.vote.service.impl.VoteServiceImpl;


/**
 * @author th
 */
public class Main {

    public static void expireTest1() {
        PhoneServiceImpl phoneService = new PhoneServiceImpl();
        phoneService.loadPhoneList();
        phoneService.testAllPhone();
    }

    public static void expireTest2() {
        VoteServiceImpl voteServiceImpl = new VoteServiceImpl();
        voteServiceImpl.loadVoter();
        voteServiceImpl.countVotes();
        voteServiceImpl.displayResults();
    }

    public static void main(String[] args) {
        /// 实验题1
        expireTest1();
        /// 实验题2
//        expireTest2();
    }

}
