package org.t1;

import org.t1.exception.ScoreInvalidException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ScoreInvalidException {
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();
        if (score < 0 || score > 100) {
            throw new ScoreInvalidException("分数必须在0-100之间");
        }
    }

}
