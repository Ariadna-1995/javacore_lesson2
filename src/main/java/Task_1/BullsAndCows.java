package Task_1;

import java.util.HashSet;
import java.util.Set;

public class BullsAndCows {
    private int randomValue;
    private Boolean isWin;
    private int turn;

    public BullsAndCows(int randomValue) {
        this.randomValue = randomValue;
        this.isWin = false;
        this.turn = 0;
    }

    public boolean validValue(int n) {
        Set<Integer> set = new HashSet<>();
        char[] chars = (n + "").toCharArray();
        for (int digit : chars) {
            set.add(digit);
        }
        if (n < 1000 || n > 9999 || set.size() != 4) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    public String compareWith(int n) {
        if (isWin)
            return "You already won !";
        if (turn > 5)
            return "Sorry, you’re out of turns !";
        validValue(n);
        turn++;
        char[] myChars = ("" + n).toCharArray();
        char[] pcChars = ("" + randomValue).toCharArray();
        int bulls = 0;
        String[] res = new String[myChars.length];
        for (int i = 0; i < myChars.length; i++) {
            if (myChars[i] == pcChars[i]) {
                bulls++;
                if (bulls == 4) {
                    isWin = true;
                    return "You win !";
                }
                res[i] = String.valueOf(i);
            }
        }


        int cows = 0;
        for (int i = 0; i < pcChars.length; i++) {
            if (res[i] != null)
                continue;
            for (int j = 0; j < myChars.length; j++) {
                if (res[j] != null)
                continue;
                if (pcChars[i] == myChars[j]) {
                    cows++;
                    break;
                }
            }
        }
        String msgBull = "bull";
        String msgCow = "cow";
        msgBull = (bulls != 1) ? msgBull + "s" :msgBull;
        msgCow = (cows != 1) ? msgCow + "s" :msgCow;
        return (bulls + "  " + msgBull +  "and " + cows + " " + msgCow);
    }
}



