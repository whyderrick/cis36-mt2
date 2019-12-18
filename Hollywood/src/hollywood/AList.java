package hollywood;

class AList extends Celebrity implements FilmStar
  {
  private int hoursWorked = 6;

  AList() {
    super(0);
  }

  public void shootMovie() {
    this.increaseValue(200_000);
  }

  public void shootTvEpisode() {
    this.increaseValue(50_000);
  }

  public void starInPlay() {
    this.increaseValue(10_000);
  }
}
