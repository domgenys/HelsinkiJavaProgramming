/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Genys.D
 */
public class Container {

    private int amountOfLiquidInCotainer;

    public Container() {
        this.amountOfLiquidInCotainer = 0;
    }

    public int contains() {
        return this.amountOfLiquidInCotainer;

    }

    public void add(int amount) {
        if( amount > 0){
            this.amountOfLiquidInCotainer += amount;
            if(this.amountOfLiquidInCotainer > 100){
                this.amountOfLiquidInCotainer = 100;
            }
        }
    }

    public void remove(int amount) {
        if(amount > 0){
             this.amountOfLiquidInCotainer -= amount;
             if(this.amountOfLiquidInCotainer < 0){
                 this.amountOfLiquidInCotainer = 0;
             }
        }
    }

    @Override
    public String toString() {
        return this.amountOfLiquidInCotainer + "/100";
    }
    
    
}
