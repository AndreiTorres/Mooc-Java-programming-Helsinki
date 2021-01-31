
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        
        int countGames = 0;
        int countWins = 0;
        int countLoss = 0;
        
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String nameOfHomeTeam = parts[0];
                String nameOfVisitTeam = parts[1];
                int pointsHomeTeam = Integer.valueOf(parts[2]);
                int pointsVisitTeam = Integer.valueOf(parts[3]);
                
                if (nameOfHomeTeam.contains(team) || nameOfVisitTeam.contains(team)) {
                    countGames = countGames + 1;
                    if (nameOfHomeTeam.contains(team)) {
                        if (pointsHomeTeam > pointsVisitTeam) {
                            countWins = countWins + 1;
                        } else {
                            countLoss = countLoss + 1;
                        }   
                    } else {
                        if (pointsVisitTeam > pointsHomeTeam) {
                            countWins = countWins + 1;
                        } else {
                            countLoss = countLoss + 1;
                        }
                    }
                } else {
                    continue;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Games: " + countGames);
        System.out.println("Wins: " + countWins);
        System.out.println("Losses: " + countLoss);

    }

}
