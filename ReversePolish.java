import java.util.Stack;

public class RPN {
    public static int calculate(String[] notation){
        Stack<Integer> operands = new Stack<>();
        for(int i=0; i<notation.length; i++){
            String curr = notation[i];
            Integer o1, o2, result;
            switch (curr) {
                case "+":
                    o1 = operands.pop();
                    o2 = operands.pop();
                    result = o2 + o1;
                    operands.push(result);
                    break;
                
                case "-":
                    o1 = operands.pop();
                    o2 = operands.pop();
                    result = o2 - o1;
                    operands.push(result);
                    break;

                case "*":
                    o1 = operands.pop();
                    o2 = operands.pop();
                    result = o2 * o1;
                    operands.push(result);
                    break;
                
                case "/":
                    o1 = operands.pop();
                    o2 = operands.pop();
                    result = o2 / o1;
                    operands.push(result);
                    break;

                default:
                    operands.push(Integer.parseInt(curr));
                    break;
            }
        }
        
        int result = operands.pop();
        return result;
    }

    public static void main(String[] args) {
        //3*(17-5) + 18/6
        String[] natation = {"3", "17", "15", "-", "*", "18", "6", "/", "+"};
        int result = calculate(natation);
        System.out.println("The result of RPN is " + result);
    }
}
