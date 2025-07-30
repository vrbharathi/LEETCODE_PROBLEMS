class Solution {
   private List<Integer> getPatternArray(String[] words) {
    Map<String, Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    int index = 0;
    for (String word : words) {
        if (!map.containsKey(word)) {
            map.put(word, index++);
        }
        list.add(map.get(word));
    }
    return list;
}

public boolean wordPattern(String pattern, String s) {
    String[] words = s.split(" ");
    if (words.length != pattern.length())
     return false;

    List<Integer> patternList = getPatternArray(pattern.split(""));
    List<Integer> wordList = getPatternArray(words);

    return patternList.equals(wordList);
}
}
