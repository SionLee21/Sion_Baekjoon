import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(String skill, String[] skill_trees) {


        int validCount = 0;
        
        for (String skillTree : skill_trees) {
            Queue<Character> skillQueue = new LinkedList<>();
            for (char c : skill.toCharArray()) {
                skillQueue.add(c);
            }
            
            boolean isValid = true;
            for (char c : skillTree.toCharArray()) {
                if (skillQueue.contains(c)) {
                    if (c != skillQueue.poll()) {
                        isValid = false;
                        break;
                    }
                }
            }
            
            if (isValid) {
                validCount++;
            }
        }
        
        return validCount;
    }
}


