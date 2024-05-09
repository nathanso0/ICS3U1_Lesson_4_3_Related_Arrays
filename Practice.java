class Practice extends ConsoleProgram {

  /**
  * Description
  * @author:
  */

  public void run() {
    // Initialize player and scores arrays
    String[] team = {"James", "Bobby",  "Charles",  "Tommy",  "Fredie"};
    int[] score = {42, 61, 36, 41, 20};
    // printing team names
    for (int i = 0; i < team.length; i++) {
      System.out.println(team[i] + ": " + score[i]);
    }

    // Variablees p2
    int currentindex = 0;
    int currentmax = score[0];
    for (int i = 1; i < team.length; i++) {
      if (score[i] > currentmax) {
        currentindex = i;
        currentmax = score[i];
      }
    }
    System.out.println("The max score is: " + currentmax + " and the player who is at max value is: " + team[currentindex]);

  }
}
