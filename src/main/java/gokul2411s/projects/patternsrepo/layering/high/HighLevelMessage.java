package gokul2411s.projects.patternsrepo.layering.high;

/**
 * Created by gokul on 4/8/16.
 */
public final class HighLevelMessage {

  private final String one;
  private final String two;

  public HighLevelMessage(String one, String two) {
    this.one = one;
    this.two = two;
  }

  public String getOne() {
    return one;
  }

  public String getTwo() {
    return two;
  }
}
