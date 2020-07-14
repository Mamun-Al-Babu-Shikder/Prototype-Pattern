package com.mcubes.test;

import com.mcubes.beans.EMarket;

/**
 * Created by A.A.MAMUN on 7/14/2020.
 */

/**
 * Prototype Pattern says that cloning of an
 * existing object instead of creating new one
 * and can also be customized as per the requirement.
 */
public class TestPrototypePattern {

    public static void main(String[] args) throws CloneNotSupportedException {

        EMarket eMarket1 = new EMarket();
        eMarket1.setName("Computer Source : Dhaka Branch");
        /**
         * Load product just one time.
         * When clone this object then
         * all loaded data will be copied.
         */
        eMarket1.loadProduct();

        // Clone object 'eMarket1'.
        EMarket eMarket2 = eMarket1.clone();
        eMarket2.setName("Computer Source : Tangail Branch");

        // Print the object 'eMarket1' and 'eMarket2'
        System.out.println(eMarket1.toString());
        System.out.println(eMarket2.toString());
    }
}

