class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        int sum = 0;

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        for(int i = s.length()-1; i>= 0; i--) {
            char c = s.charAt(i);
            int value = m.get(c);
            sum += value;
            if(i > 0 && value > m.get(s.charAt(i-1))) {
                sum -= m.get(s.charAt(i-1));
                i--;
            }
        }
        return sum;
    }
}