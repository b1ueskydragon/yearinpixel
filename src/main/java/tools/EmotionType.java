package tools;

public enum EmotionType {

  AMAZING_FANTASTIC(5),
  REALLY_GOOD_HAPPY(4),
  NORMAL_AVERAGE(3),
  EXHAUSTED_TIRED(2),
  DEPRESSED_SAD_ANGRY(1);

  private int score;

  EmotionType(int score) {
    this.score = score;
  }

  public Integer getScore() {
    return score;
  }
}
