package hollywood;

class BList extends Celebrity implements FilmStar, VoiceoverStar
  {
  private int hoursWorked = 8;

  BList() {
    super(0);
  }

  public void shootMovie() {
    this.increaseValue(100_000);
  }

  public void shootTvEpisode() {
    this.increaseValue(35_000);
  }

  public void recordVoiceover() {
    this.increaseValue(1_000);
  }
}
