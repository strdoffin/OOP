
import mockk.Combatable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
public abstract class JobClass implements Combatable {

    protected String name;

    public JobClass() {
        this.name = "Novice";
    }

    public JobClass(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return ("Job:" + this.name);
    }

}
