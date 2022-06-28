class Bank{
    int rateOfInterest(){
        return 0;
    }
}

class SBIbank extends Bank{
    int rateOfInterest(){
        return 5;
    }
}

class ICICIbank extends Bank{
    int rateOfInterest(){
        return 7;
    }
}

class YESbank extends Bank{
    int rateOfInterest(){
        return 6;
    }
}

class Main1{
    public static void main(String[] args) {
        Bank b;
        b = new SBIbank();
        System.out.println("SBI Bnk rate of interest: " +b.rateOfInterest());
        b = new ICICIbank();
        System.out.println("ICICI Bank rate of interest: "+b.rateOfInterest());
        b = new YESbank();
        System.out.println("YES Bank rate of interest: "+b.rateOfInterest());
    }
}