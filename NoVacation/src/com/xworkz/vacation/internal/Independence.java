package com.xworkz.vacation.internal;

public class Independence extends FreedomFighters{

    public void fights(Freedom freedom){

        freedom.democracy();

        if(freedom instanceof FreedomFighters){

            FreedomFighters freedomFighters = (FreedomFighters) freedom;
            freedomFighters.definesRights();
            freedomFighters.equality();
            freedomFighters.independence();
            freedomFighters.democracy();
            freedomFighters.development();
        }
    }
}
