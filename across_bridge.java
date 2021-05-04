import java.util.*;

class across_bridge {
   public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> que = new LinkedList<>();

        int sum = 0;

        for(int i : truck_weights){
            while(true){
                if(que.isEmpty()){
                    que.add(i);
                    answer++;
                    sum += i;
                    break;
                }
                else if(que.size() == bridge_length){
                    sum -= que.poll();
                }
                else{
                    if(sum + i > weight){
                        que.add(0);
                        answer++;
                    } else{
                        que.add(i);
                        sum += i;
                        answer++;
                        break;
                    }
                }
            }
        }

        return answer + bridge_length;
    }
    
}