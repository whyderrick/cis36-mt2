package hollywood;

class RealityStar extends Celebrity implements FilmStar, VoiceoverStar
  {
  private int hoursWorked = 16;

  RealityStar() {
    super(0);
  }

  public void shootMovie() {
    this.increaseValue(5_000);
  }

  public void shootTvEpisode() {
    this.increaseValue(500);
  }

  public void recordVoiceover() {
    this.increaseValue(500);
  }
}
