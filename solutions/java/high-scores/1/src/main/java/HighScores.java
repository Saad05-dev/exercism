import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class HighScores {

    List<Integer> highScores = new ArrayList<Integer>();

    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    List<Integer> scores() {
        return this.highScores;
    }

    Integer latest() {
        return this.highScores.get(this.highScores.size() - 1);
    }

    Integer personalBest() {
        Integer highestScore = this.highScores.get(0);
        for(Integer Scores : highScores)
        {
            if(highestScore < Scores)
            {
                highestScore = Scores;
            }
        }
        return highestScore;
    }

    List<Integer> personalTopThree() {
        List<Integer> sortedScores = new ArrayList<>(this.highScores);

        sortedScores.sort(Collections.reverseOrder());

        int limit = Math.min(3, sortedScores.size());

        return  sortedScores.subList(0, limit);
    }

}
