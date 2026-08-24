class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        // Map<Integer, Integer> win = new HashMap<>() ; 
        Map<Integer, Integer> los = new HashMap<>() ; 

        for(int i = 0 ;i < matches.length;i++){
            int l = matches[i][1] ;
            int w = matches[i][0] ;
            los.putIfAbsent(w, 0) ;
            los.put(l, los.getOrDefault(l, 0) + 1) ;
        }
        List<Integer> zero = new ArrayList<>() ;
        List<Integer> one = new ArrayList<>() ;
        for(int player : los.keySet()){
            int count = los.get(player) ;
            if(count == 0){
                zero.add(player) ;
            }else if(count == 1){
                one.add(player) ;
            }
        }   
        Collections.sort(zero) ;
        Collections.sort(one) ;

        return Arrays.asList(zero,one) ;
    }
}