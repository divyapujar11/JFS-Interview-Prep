class Compitimepoly {
    public int calculate(int a, int b){
        return a+b;
    }
    public int calculate(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Compitimepoly calc = new Compitimepoly();
        System.out.println("sum of a and b : "+ calc.calculate(4,5));
        System.out.println("sum of a, b and c : "+ calc.calculate(5,8,9));
    }
}
