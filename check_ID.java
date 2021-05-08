class check_ID {
 
    public static void main(String[] args){
        
        System.out.println();
        System.out.println(solution("123_.def")); 
    }
    public static String  solution(String new_id) {
        String answer ="";
        String step1 = new_id.toLowerCase();
        //System.out.println("Step1 : " + step1);

        String step2 = "";
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < step1.length(); i++){
            char ch = step1.charAt(i);
            if(ch == '-' || ch == '_' || ch == '.'){
                sb.append(ch);
            }
            if(ch >= 'a' && ch <= 'z'){
                sb.append(ch);
            }
            if(ch >= '0' && ch <= '9'){
                sb.append(ch);
            }
        }
        step2 = sb.toString();
        //System.out.println("Step2 : " + step2);

        String step3 = step2; 
        while(step3.contains("..")){
            step3 = step3.replace("..",".");
        }
        //System.out.println("Step3 : " + step3);

        String step4 = step3;
        if(step4.length() > 0){
            if(step4.charAt(0) == '.'){
                step4 = step4.substring(1,step4.length());
            }
        }
        if(step4.length() > 0){
            if(step4.charAt(step4.length()-1) == '.'){
                step4 = step4.substring(0, step4.length()-1);
            }
        }
        //System.out.println("Step4 : " + step4);

        String step5;
        if(step4.length() == 0){
            step5 = "a";
            //System.out.println("Step5 : " + step5);
        } else{
            step5 = step4;
            //System.out.println("Step5 : " + step5);
        }
        answer = step5;

        String step6 = step5;
        if(step6.length() >= 16){
            step6 = step6.substring(0,15);
            if(step6.charAt(step6.length()-1) == '.'){
                step6 = step6.substring(0,step6.length()-1);
            }
            answer = step6;
            //System.out.println("Step6 : " + step6);
            return answer;
        }
        
        StringBuilder step7 = new StringBuilder();
        if(step6.length() <= 2){
            step7.append(step6);
            //System.out.println("Step7 : " + step7);
            char ch = step7.charAt(step7.length()-1);
            //System.out.println(ch);
            while(step7.length() < 3){
                step7.append(ch);
            }
            //System.out.println("Step7 : " + step7 + " " + step7.length());
            answer =  step7.toString();
        }
        return answer;
    }
}
