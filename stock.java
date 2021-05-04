import java.util.*;
class stock {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        
        for(int idx = 0; idx < prices.length; idx++){
            while(!stack.empty() && prices[idx] < prices[stack.peek()]){
                answer[stack.peek()] = idx - stack.peek();
                stack.pop();
            }
            stack.push(idx);
        }
        while(!stack.empty()){
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }
        return answer;
    }
}