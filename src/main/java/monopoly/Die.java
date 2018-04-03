/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.util.Random;

public class Die
{
    private Random ran;
    public Die (){
        this.ran = new Random();
    }
    
    public int roll(){
        int first = ran.nextInt(5)+1;
        int second =  ran.nextInt(5)+1;
        return first + second;
    }
}
