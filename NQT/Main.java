import java.util.*;

public class Main {

    // Map each digit and mirror placement to the resulting valid digit
    static Map<Character, Map<Character, Character>> mirrorMap = new HashMap<>();

    static void initMirrorMap() {
        // For each digit, map of mirror -> resulting digit (or null if invalid)
        // Seven-segment reflections manually derived
        // L = left, R = right, U = top, D = bottom, S = skip
        mirrorMap.put('0', Map.of('S','0','L','0','R','0','U','0','D','0'));
        mirrorMap.put('1', Map.of('S','1','L',null,'R',null,'U',null,'D',null));
        mirrorMap.put('2', Map.of('S','2','L',null,'R',null,'U',null,'D',null));
        mirrorMap.put('3', Map.of('S','3','L',null,'R',null,'U',null,'D',null));
        mirrorMap.put('4', Map.of('S','4','L','4','R','4','U',null,'D',null));
        mirrorMap.put('5', Map.of('S','5','L',null,'R',null,'U',null,'D',null));
        mirrorMap.put('6', Map.of('S','6','L','6','R','6','U',null,'D',null));
        mirrorMap.put('7', Map.of('S','7','L',null,'R',null,'U',null,'D',null));
        mirrorMap.put('8', Map.of('S','8','L','8','R','8','U','8','D','8'));
        mirrorMap.put('9', Map.of('S','9','L',null,'R',null,'U',null,'D',null));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        String mirrors = sc.nextLine();

        initMirrorMap();

        List<Character> validDigits = new ArrayList<>();

        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            char mirror = mirrors.charAt(i);
            Character result = mirrorMap.get(digit).get(mirror);
            if (result != null) {
                validDigits.add(result);
            }
        }

        if (validDigits.isEmpty()) {
            System.out.println(0);
            return;
        }

        // Sort digits to form the smallest number
        validDigits.sort(null);

        // Remove leading zeros
        int idx = 0;
        while (idx < validDigits.size() && validDigits.get(idx) == '0') idx++;

        StringBuilder sb = new StringBuilder();
        if (idx == validDigits.size()) {
            sb.append('0'); // only zeros
        } else {
            for (; idx < validDigits.size(); idx++) sb.append(validDigits.get(idx));
        }

        System.out.println(sb.toString());
    }
}
