class count_prime {
    public int solution(int[] nums) {
        int answer = 0;
        int temp;
        
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i+1; j < nums.length -1; j++){
                for(int k = j+1; k < nums.length; k++){
                    temp = nums[i] + nums[j] + nums[k];
                    if(check_prime(temp)){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    public boolean check_prime(int n){
        int count = 0;

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                count++;                
            }
        }
        
        if(count != 0) {
            return false;
        }
        return true;
    }
}