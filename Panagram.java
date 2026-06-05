class Solution {
    public boolean checkIfPangram(String sentence) {
        int flag = 0;

        for (char ch : sentence.toCharArray()) {
            flag |= (1 << (ch - 'a'));
        }

        return flag == ((1 << 26) - 1);
    }
}