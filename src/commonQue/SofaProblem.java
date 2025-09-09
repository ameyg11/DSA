import java.util.*;

public class SofaProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();

        List<Integer> transactions = new ArrayList<>();
        List<Integer> commits = new ArrayList<>();
        List<String> outputs = new ArrayList<>(); // store outputs

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            String[] parts = line.split(" ");

            switch (parts[0]) {
                case "read":
                    outputs.add(String.valueOf(balance));
                    break;

                case "credit": {
                    int amount = Integer.parseInt(parts[1]);
                    balance += amount;
                    transactions.add(amount);
                    break;
                }

                case "debit": {
                    int amount = Integer.parseInt(parts[1]);
                    balance -= amount;
                    transactions.add(-amount);
                    break;
                }

                case "abort": {
                    int idx = Integer.parseInt(parts[1]) - 1;
                    if (idx < transactions.size()) {
                        int undo = transactions.get(idx);
                        balance -= undo;
                        transactions.set(idx, 0);
                    }
                    break;
                }

                case "commit":
                    commits.add(balance);
                    transactions.clear();
                    break;

                case "rollback": {
                    int commitIdx = Integer.parseInt(parts[1]) - 1;
                    if (commitIdx < commits.size()) {
                        balance = commits.get(commitIdx);
                        transactions.clear();
                    }
                    break;
                }
            }
        }

        sc.close();

        // print all outputs properly
        for (int i = 0; i < outputs.size(); i++) {
            System.out.print(outputs.get(i));
            if (i < outputs.size() - 1) {
                System.out.print("\n");
            }
        }
    }
}
