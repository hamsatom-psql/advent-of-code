package src.advent2023.day23;

import src.PuzzleSolver;

import java.util.List;
import java.util.stream.Stream;

public class Solution extends PuzzleSolver {

    public static void main(String[] args) {
        new Solution().run();
    }

    @Override
    public List<String> getExampleInput1() {
        return List.of("#.#####################\n" +
                "#.......#########...###\n" +
                "#######.#########.#.###\n" +
                "###.....#.>.>.###.#.###\n" +
                "###v#####.#v#.###.#.###\n" +
                "###.>...#.#.#.....#...#\n" +
                "###v###.#.#.#########.#\n" +
                "###...#.#.#.......#...#\n" +
                "#####.#.#.#######.#.###\n" +
                "#.....#.#.#.......#...#\n" +
                "#.#####.#.#.#########v#\n" +
                "#.#...#...#...###...>.#\n" +
                "#.#.#v#######v###.###v#\n" +
                "#...#.>.#...>.>.#.###.#\n" +
                "#####v#.#.###v#.#.###.#\n" +
                "#.....#...#...#.#.#...#\n" +
                "#.#########.###.#.#.###\n" +
                "#...###...#...#...#.###\n" +
                "###.###.#.###v#####v###\n" +
                "#...#...#.#.>.>.#.>.###\n" +
                "#.###.###.#.###.#.#v###\n" +
                "#.....###...###...#...#\n" +
                "#####################.#");
    }

    @Override
    public List<String> getExampleOutput1() {
        return List.of("94");
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
