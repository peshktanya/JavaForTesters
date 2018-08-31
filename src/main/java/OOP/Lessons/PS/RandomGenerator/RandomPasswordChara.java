package OOP.Lessons.PS.RandomGenerator;

import java.util.Random;

public class RandomPasswordChara {
    public static void main(String[] args) {
        char arr[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
                      'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
                      '0','1','2','3','4','5','6','7','8','9'};

        Random rand = new Random();
        int length = 8 + rand.nextInt(12 - 8 + 1);
        for(int i = 0; i < length; i++) {
            System.out.print(arr[1 + (int)(Math.random() * arr.length - 1)]);
        }
    }
}
