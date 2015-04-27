package math;

import java.util.Arrays;

/**
 * Created by chris on 24/04/15.
 */
public class BruteForce {


    public static void main(String[] args) {

        BruteForce bruteForce = new BruteForce();
        bruteForce.calculateRange(3,37);
        //bruteForce.calculateIndividual(13);
    }

    public void calculateIndividual(int n)
    {
        int i = n;
        int[] answer = new int[n * 2];
        this.placeN(i, answer);
        printAnswer(answer);
    }

    public void calculateRange(int start, int max)
    {

        int i = start;

        while(i < max)
        {
            int[] answer = new int[i * 2];

            // printAnswer(answer);
            this.placeN(i, answer);
            System.out.println("Solving : " + i);
            printAnswer(answer);
            i = this.nextI(i);
        }
    }

    public int nextI(int i)
    {
        if(i % 2 == 0)
        {
            return i + 3;
        }
        return i + 1;
    }



    public int[] placeN(int n, int[] attempt)
    {

        // Calculate the max value for i
        int maxIndex = attempt.length - (n + 2);

        for(int i = 0; i <= maxIndex; i++)
        {
            int nextIndex = i + n + 1;

            // The value at index i will be zero by default
            if(attempt[i] == 0 && attempt[nextIndex] == 0)
            {
                attempt[i] = n;
                attempt[nextIndex] = n;
                //printAnswer(attempt);
                // n - 1 and try next placement
                int nextn = n - 1;

                // If we've reached zero we've successfully placed all the values
                if(nextn == 0)
                {
                    return attempt;
                }

                // If we've not placed all the values try to place the next n
                placeN(nextn, attempt);

                // After trying to place n-1 (e.g 3) and we check the array to
                // see if it was successful or not. If n-1 couldn't be placed
                // Then we try removing n and we'll go to the next position for n.

                cleanN(nextn, attempt);

            }
        }
        return attempt;
    }



    public void cleanN(int n, int[] attempt)
    {
        for(int val : attempt)
        {
            if(n == val)
            {
               return;
            }
        }

        // If we've scanned the whole array and not matched an n
        // System.out.println("Can't place " + n + " removing " + (n + 1) + " and retrying");
            removeN(n + 1, attempt);
        //    printAnswer(attempt);
    }

    public void removeN(int n, int[] attempt)
    {
        for(int i = 0; i < attempt.length; i++)
        {
            if(attempt[i] == n) { attempt[i] = 0; }
        }
    }


    public void printAnswer(int[] answer)
    {
        StringBuilder stringBuilder = new StringBuilder();

        for(int pos : answer)
        {
            stringBuilder.append(pos).append('|');
        }

        System.out.println(stringBuilder);
    }
}
