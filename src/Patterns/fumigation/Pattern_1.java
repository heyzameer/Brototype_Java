package Patterns.fumigation;
//***
//**
//***
//***
//**
//**
//***
//***
//***

public class Pattern_1 {
    public static void main(String[] args) {
        int n =3;
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("***");
            }
//            System.out.println();
            for (int j = 0; j < i; j++) {
                if(i==3){
                    break;
                }
                System.out.println("**");
            }
//            System.out.println();
        }
    }
}
