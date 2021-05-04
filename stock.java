import java.util.*;
class stock {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        
        for(int idx = 0; idx < prices.length; idx++){
            //by 세정, 스택이 비어있는지 확인하는 boolean형 메소드 empty()
            while(!stack.empty() && prices[idx] < prices[stack.peek()]){ // 생성한 stack에는 index를 넣어준다.
                // by 세정, 스택의 맨위 요소를 확인하는 메소드 peek()
                answer[stack.peek()] = idx - stack.peek();
                // by 세정, 스택의 맨위 요소를 꺼내는 메소드 pop()
                stack.pop();
            }
            // by 세정, 스택의 맨위에 함수 인자로 받은 요소를 넣는 push(sth)
            stack.push(idx);
        }
        while(!stack.empty()){
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }
        return answer;
    }
}
