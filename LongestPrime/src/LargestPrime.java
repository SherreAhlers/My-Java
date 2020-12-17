// CHALLENGE
// Write a method named getLargestPrime with one parameter of type
// int named number.
// If the number is negative or does not have any prime numbers, the
// method should return -1 to indicate an invalid value.
// The method should calculate the largest prime factor of a given
// number and return it.

// HINT:
// Since the number 0 and 1 are not condidered prime numbers, they
// cannot contain prime numbers.


public class LargestPrime {
    public static int getLargestPrime (int number) {
        int prime = (number) % 10;
        if(number <= 1) {
            return -1;
        } else if (number % 10 == 0) {
            return number;
        } else {
            return -1;
        }
        }

        // CORRECT VERSION:
        public static int getLargestPrime(int number){
            if(number<=0 || number ==1){
                return -1;
            }
            for(int i=2;i<number;i++){
                if(number % i == 0) {
                    number /= i;
                    i--;
                }
            }
            return number;
        }

        // OR LIKE THIS:
        public static int getLargestPrime(int number){
            if(number<=1){
                return -1;
            }
            int k,g=0;
            for(int i=2;i<=number;i++){
                k=0;
                if(number%i==0) {
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0)
                            k = 1;
                    }
                    if (k == 0 && i > g)
                        g = i;
                }
            }
            return g;
        }
    }

