package src.advent2023.day24;

import src.PuzzleSolver;

import java.util.List;
import java.util.stream.Stream;

public class Solution extends PuzzleSolver {

    public static void main(String[] args) {
        new Solution().run();
    }

    @Override
    public List<String> getExampleInput1() {
        return List.of("19, 13, 30 @ -2,  1, -2\n" +
                "18, 19, 22 @ -1, -1, -2\n" +
                "20, 25, 34 @ -2, -2, -4\n" +
                "12, 31, 28 @ -1, -2, -1\n" +
                "20, 19, 15 @  1, -5, -3");
    }

    @Override
    public List<String> getExampleOutput1() {
        return List.of("2");
    }

    @Override
    public List<String> getExampleOutput2() {
        return List.of();
    }

    @Override
    public String solvePartOne(Stream<String> lines) {
        return "";
    }

    @Override
    public String solvePartTwo(Stream<String> lines) {
        return "";
    }

}
