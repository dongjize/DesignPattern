package prototype.football;

/**
 * Description:
 *
 * @Author: dong
 * @Date: 2017-09-04
 * @Time: 13:05
 */
public class FootballClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        FootballPlayer player1 = new FootballPlayer("Messi", 30, "Argentina");
        player1.setClub("Barcelona", "Spain");
        player1.setPerformance(50, 20, 98);

        FootballPlayer player2 = (FootballPlayer) player1.clone();
//        player2.setPersonalInfo(25, "Brazil");
//        player2.setClub("Paris St.German", "France");

        FootballPlayer player3 = (FootballPlayer) player1.clone();
        player3.setPersonalInfo(32, "Portugal");
        player3.setClub("Real Madrid", "Spain");
        player3.setPerformance(40, 15, 95);

        player1.display();
        player2.display();
        player3.display();
    }
}
