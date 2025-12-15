/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author doffi
 */
public class Fraction {
    public int topN;
    public int btmN;
    public String toFraction(){
        return (topN+"/"+btmN);
    }
    public String toFloat(){
        double result = (double)topN / (double)btmN;
        return (result + "");
    }
    public void addFraction(Fraction f){
        if (btmN == f.btmN){
            topN += f.topN;
        }else if(btmN != f.btmN){
            topN = topN * f.btmN + f.topN * btmN;
            btmN *= f.btmN;
        }
    }
    public boolean myEquals(Fraction x){
        if (x.toFloat().equals(toFloat()))
            return true;
        else
            return false;
    }
    public void LowestTermFrac(){
        int a = topN;
        int b = btmN;
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        topN /= (double)a;
        btmN /= (double)a;
    }
}
