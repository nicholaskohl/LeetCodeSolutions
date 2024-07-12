import java.lang.StringBuilder;
class maxScore{
    public static int maximumGain(String s, int x, int y) {
        int total = 0;
        
        if (x > y) {
            Result result = removeSubstrings(s, 'a', 'b', x);
            total += result.total;
            result = removeSubstrings(result.updatedString, 'b', 'a', y);
            total += result.total;
        } else {
            Result result = removeSubstrings(s, 'b', 'a', y);
            total += result.total;
            result = removeSubstrings(result.updatedString, 'a', 'b', x);
            total += result.total;
        }
        
        return total;
    }

    private static Result removeSubstrings(String s, char first, char second, int points) {
        StringBuilder sb = new StringBuilder();
        int total = 0;

        for (char c : s.toCharArray()) {
            if (c == second && sb.length() > 0 && sb.charAt(sb.length() - 1) == first) {
                sb.deleteCharAt(sb.length() - 1);
                total += points;
            } else {
                sb.append(c);
            }
        }

        return new Result(sb.toString(), total);
    }

    static class Result {
        String updatedString;
        int total;

        Result(String updatedString, int total) {
            this.updatedString = updatedString;
            this.total = total;
        }
    }
}
