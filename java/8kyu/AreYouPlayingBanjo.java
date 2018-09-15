//  Problem: https://www.codewars.com/kata/53af2b8861023f1d88000832
public class AreYouPlayingBanjo {

    public static String areYouPlayingBanjo(String name) {
        return name.substring(0, 1).equalsIgnoreCase("r") ? name + " plays banjo" : name + " does not play banjo";
    }

}