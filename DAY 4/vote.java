import java.util.Scanner;

public class vote {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int party1 = 0, party2 = 0, party3 = 0, party4 = 0;
        int vote;

        System.out.println("Mini Voting Machine");
        System.out.println("Vote Options:");
        System.out.println("1 - Party 1");
        System.out.println("2 - Party 2");
        System.out.println("3 - Party 3");
        System.out.println("4 - Party 4");
        System.out.println("-1 - End Voting");

        while (true) {
            System.out.println("\nEnter your vote: ");
            vote = sc.nextInt();

            if (vote == -1) {
                break; // stop voting
            }

            switch (vote) {
                case 1:
                    party1++;
                    break;
                case 2:
                    party2++;
                    break;
                case 3:
                    party3++;
                    break;
                case 4:
                    party4++;
                    break;
                default:
                    System.out.println("Invalid vote!");
            }
        }

        // Display Result
        System.out.println("\n--- Voting Result ---");
        System.out.println("Party 1 Votes: " + party1);
        System.out.println("Party 2 Votes: " + party2);
        System.out.println("Party 3 Votes: " + party3);
        System.out.println("Party 4 Votes: " + party4);

        sc.close();
    }
}