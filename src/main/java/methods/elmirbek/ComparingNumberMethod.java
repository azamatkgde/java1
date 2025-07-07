package methods.elmirbek;

// Explanation
// ❗The method [void] does not return anything
// ❗The method [String], [int], [double], [float], [boolean], [char] - returns value

public class ComparingNumberMethod {
    public static void main(String[] args) {
        // create instance of the class ComparingNUmber
        System.out.println(ComparingNumbers.max(5, 9));
        MatchNumbers result = new MatchNumbers();
        int sum = result.addition(5, 9);
        System.out.println("Результат сложения : " + sum);
        int sum1 = result.subtraction(5, 8);
        System.out.println("Результат вычитание : " + sum1);
        int sum2 = result.multiplication(66, 78);
        System.out.println("Результат умнажения : " + sum2);
        int sum3 = result.division(55, 78);
        System.out.println("Результат деление ; " + sum3);
        int sum4 = result.modulo(55,  78);
        System.out.println("Результат остатка : " + sum4);
    }
}



class MatchNumbers {

    // ❗required return value type [int]

    int addition (int a, int b) {
        return  a + b;
    }

    int subtraction (int a, int b) {
        return  a - b;
    }

    int multiplication (int a, int b) {
        return  a * b;
    }

    int division (int a, int b) {
        return  a / b;
    }

    int modulo (int a, int b) {
        return  a % b;
    }
}

class ComparingNumbers {
    public  static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}


