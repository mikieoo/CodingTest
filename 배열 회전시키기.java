class Solution {
    public int[] solution(int[] numbers, String direction) {
        //1
        int[] answer = new int[numbers.length];
        //2
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int n : numbers){
            list.add(n);
        }
        
        if(direction.equals("right")){
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        } else {
            list.add(list.get(0));
            list.remove(0);
            
        }
        
        //1
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        //2 
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}