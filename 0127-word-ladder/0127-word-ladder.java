class Solution {
    static class Pair{
        String word ;
        int step ;
        Pair(String word, int step){
            this.word = word ;
            this.step = step ;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String> word = new HashSet<>(wordList) ;
        
        // condition for termiate if the word is not there then it will not be int the solution 

        if(!word.contains(endWord)){
            return 0 ;
        }
        
        // create a class jho handle karega queue containing both word and step 

        Queue<Pair> q = new   LinkedList<>() ;
        q.add(new Pair(beginWord,1)) ;

        while(!q.isEmpty()){
            // getting the current word and start to itrate it 
            Pair cur = q.poll() ;
            String curWord = cur.word ;
            // getting the current step here 
            int curStep = cur.step ;
            // if the word is equal to the last word then return the step (answer will be here)
            if(curWord.equals(endWord)){
                return curStep ;
            }

            char[] wordChars = curWord.toCharArray() ;
            // Start itratring on the word and change the char of the word to make a word in the set 
            for(int i=0;i<wordChars.length;i++){
                char org = wordChars[i] ;
                // change it word by word 
                for(char c = 'a'; c <= 'z';c++){
                    if(c == org) continue ;
                    wordChars[i] = c ;
                    String newWord = new String(wordChars) ;
                    // if word is found in the set then put it in the queue and start the loop again 
                    if(word.contains(newWord)){
                        q.add(new Pair(newWord, curStep + 1)) ;
                        word.remove(newWord) ;
                    }
                }
                wordChars[i] = org ;
            }
        }
        return 0 ;
    }
}