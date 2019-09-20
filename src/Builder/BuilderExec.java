package Builder;

import Base.Exec;

// refs https://www.techscore.com/tech/DesignPattern/Builder.html/
public class BuilderExec implements Exec {
    @Override
    public void exec() {
        Builder builder = new SaltWaterBuilder();
        Director director = new Director(builder);

        director.constract();
        SaltWater saltWater = (SaltWater)builder.getResult();

        System.out.println(saltWater.salt);
        System.out.println(saltWater.water);
    }
}
