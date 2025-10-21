public class Calculator {

    Calculator() {

    }

    public static double output(String Input) {
        //make a result variable to be the result of what's broken up
        double result = 0;
        char operator = ' ';
        int operatorIndex = -1;
        String string1;
        String string2;

        //loop through the string to take out its bits and pieces
        for (int i = 0; i < Input.length(); i++) {
            //the case find the operator
            if (Input.charAt(i) == '+' || Input.charAt(i) == '-' ||
                    Input.charAt(i) == '*' || Input.charAt(i) == '/') {
                //sets the operator
                operator = Input.charAt(i);
                operatorIndex = i;

                //this makes the loop check the entire string
                if (i > Input.length()) {
                    break;
                }
            }
        }
        //once it finds the operator, run the if block
        if (operatorIndex != -1) {
            //this will break the string up into two parts
            string1 = Input.substring(0, operatorIndex);
            string2 = Input.substring(operatorIndex + 1);
            Double.parseDouble(string1);
            //case to figure out what to do depending on the operator
            switch (operator) {
                case '+':
                    result = Double.parseDouble(string1) + Double.parseDouble(string2);
                    break;
                case '-':
                    result = Double.parseDouble(string1) - Double.parseDouble(string2);
                    break;
                case '*':
                    result = Double.parseDouble(string1) * Double.parseDouble(string2);
                    break;
                case '/':
                    result = Double.parseDouble(string1) / Double.parseDouble(string2);
                    break;
            }
        }
        //gives the result
        return result;
    }
}

