import java.text.DecimalFormat;

public class Lottery {
    /* instance variables */
    DecimalFormat currency = new DecimalFormat("###00");
    private int lotteryNumber;

    /* constructor */
    public Lottery()
    {
        lotteryNumber = (int)((Math.random()*99)+1);
        System.out.println(currency.format(lotteryNumber));
    }
    // no parameters
// initialize the lotteryNumber in the constructor to a random number

    /* Returns 100, 10, 3, or 0, based on whether userNumber won anything */
    public int firstDigit()
    {
        return lotteryNumber/10;
    }
    public int secondDigit()
    {
        return lotteryNumber%10;
    }
    public int determineWinnings(int userNumber)
    {
        if (userNumber==lotteryNumber)
        {
            return 100;
        }
        else if ((((userNumber/10)==(firstDigit())||(userNumber%10)==(firstDigit())))&&(((userNumber/10)==(secondDigit())||(userNumber%10)==(secondDigit()))))
        {
            return 10;
        }
        else if (((userNumber/10)==(firstDigit())||(userNumber%10)==(firstDigit())))
        {
        return 3;
        }
        else if (((userNumber/10)==(secondDigit())||(userNumber%10)==(secondDigit())))
        {
            return 3;
        }
        return 0;
    }

// ADD ANY OTHER METHOD(S) YOU THINK MIGHT BE USEFUL

}
