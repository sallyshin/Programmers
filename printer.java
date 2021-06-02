import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
         Queue<Printer> que = new LinkedList<>();
        
        for(int i = 0; i < priorities.length; i++){
            que.offer(new Printer(i, priorities[i]));
        }
        while(!que.isEmpty()){
            int tmp = que.peek().prior;
            boolean check = false;
            
            for(Printer p : que){
                if(tmp < p.prior){
                    check = true;
                }
            }
            if(check){
                que.add(que.poll());
            } else {
                if(que.poll().location == location){
                    answer = priorities.length - que.size();
                }
            }
        }
        return answer;
    }
    class Printer {
        int location;
        int prior;

        Printer(int loc, int pri){
            this.location = loc;
            this.prior = pri;
        }
    }
}