/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Genys.D
 */
public class Gift {
//    Constructor for which the name and weight of the gift are given as parameters
//Method public String getName(), which returns the name of the gift
//Method public int getWeight(), which returns the weight of the gift
//Method public String toString(), which returns a string in the form "name (weight kg)"

    private String name;
    private int weight;

    public Gift(String name, int weight) {
        this.name = name;
        this.weight = weight;

    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
       return name + " (" + weight + "kg)";
        }
    }
