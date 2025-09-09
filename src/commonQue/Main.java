import java.util.*;

public class Main {
    static class Transaction {
        int amount;
        boolean committed;

        Transaction(int amount) {
            this.amount = amount;
            this.committed = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();

        List<Transaction> allTransactions = new ArrayList<>(); // all transactions
        List<Integer> commits = new ArrayList<>();             // committed balances
        List<String> outputs = new ArrayList<>();

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
                    allTransactions.add(new Transaction(amount));
                    break;
                }

                case "debit": {
                    int amount = Integer.parseInt(parts[1]);
                    balance -= amount;
                    allTransactions.add(new Transaction(-amount));
                    break;
                }

                case "abort": {
                    int idx = Integer.parseInt(parts[1]) - 1;
                    if (idx < allTransactions.size()) {
                        Transaction t = allTransactions.get(idx);
                        if (!t.committed && t.amount != 0) {
                            balance -= t.amount; // undo effect
                            t.amount = 0;       // mark aborted
                        }
                    }
                    break;
                }

                case "commit":
                    commits.add(balance);
                    for (Transaction t : allTransactions) {
                        if (!t.committed && t.amount != 0) {
                            t.committed = true; // mark as committed
                        }
                    }
                    break;

                case "rollback": {
                    int commitIdx = Integer.parseInt(parts[1]) - 1;
                    if (commitIdx < commits.size()) {
                        balance = commits.get(commitIdx);
                        // rollback clears any uncommitted changes
                        for (Transaction t : allTransactions) {
                            if (!t.committed) t.amount = 0;
                        }
                    }
                    break;
                }
            }
        }

        sc.close();

        for (int i = 0; i < outputs.size(); i++) {
            System.out.print(outputs.get(i));
            if (i < outputs.size() - 1) System.out.print("\n");
        }
    }
}
